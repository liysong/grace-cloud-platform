package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysRole;
import com.grace.admin.po.SysRoleResource;
import com.grace.admin.service.ISysRoleResourceService;
import com.grace.admin.service.ISysRoleService;
import com.grace.common.state.OperateType;
import com.grace.common.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Controller
@RequestMapping("/role")
public class SysRoleController extends AbstractController {

    @Autowired
    private ISysRoleService sysRoleService;

    @Autowired
    private ISysRoleResourceService sysRoleResourceService;

    @OperationLog(operationType= OperateType.ADD,operationName="新增")
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysRole sysRole){


        sysRole.setId(IdGenerator.getNextId());
        sysRole.setCreateTime(new Date());
        sysRole.setUpdateTime(new Date());

        List<String> list = sysRole.getResourceIds();
        if(list !=null && list.size() >0){
            List<SysRoleResource> sysRoleResourceList = new ArrayList<>();
            for(String str: list){
                sysRoleResourceList.add(new SysRoleResource(IdGenerator.getNextId(),sysRole.getId(), str));
            }
            sysRoleResourceService.saveBatch(sysRoleResourceList);
        }else {
            logger.warn("角色为{}为绑定任何资源",sysRole.getName());
        }

        sysRoleService.save(sysRole);

        return  ResponseMessage.ok();
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysRole sysRole){

        sysRole.setUpdateTime(new Date());

        //先删除旧的资源列表
        sysRoleResourceService.deleteRoleResourceByRole(sysRole.getId());
        List<String> list = sysRole.getResourceIds();
        if(list !=null && list.size() >0){
            List<SysRoleResource> sysRoleResourceList = new ArrayList<>();
            for(String str: list){
                sysRoleResourceList.add(new SysRoleResource(IdGenerator.getNextId(),sysRole.getId(), str));
            }
            sysRoleResourceService.saveBatch(sysRoleResourceList);
        }else {
            logger.warn("角色为{}为绑定任何资源",sysRole.getName());
        }


        return  ResponseMessage.ok();
    }


    @RequestMapping("logicDelete")
    @ResponseBody
    public ResponseMessage logicDelete(String id){

        //这里只是逻辑删除
       sysRoleService.logicDelete(id);

        return  ResponseMessage.ok();
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){

        //这里只是逻辑删除
        sysRoleService.removeById(id);

        return  ResponseMessage.ok();
    }

    @RequestMapping("list")
    @ResponseBody
    public ResponseMessage list(){


        return  ResponseMessage.ok();
    }



}

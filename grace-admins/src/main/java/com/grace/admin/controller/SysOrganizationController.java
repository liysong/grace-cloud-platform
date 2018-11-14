package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysOrganization;
import com.grace.admin.service.ISysOrganizationService;
import com.grace.common.state.OperateType;
import com.grace.common.util.IdGenerator;
import com.grace.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("/organization/")
public class SysOrganizationController {

    @Autowired
    private ISysOrganizationService sysOrganizationService;

    @OperationLog(operationType= OperateType.ADD,operationName="新增")
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysOrganization sysOrganization){

        if(sysOrganization == null){
            return  ResponseMessage.error("该对象为空");
        }
        sysOrganization.setId(IdGenerator.getNextId());
        sysOrganization.setCreateTime(new Date());
      //  sysOrganization.setCreateUser(SysShiroUtil.getUser().getId());

        sysOrganizationService.save(sysOrganization);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE,operationName="更新")
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysOrganization sysOrganization){

         sysOrganization.setCreateTime(new Date());
         sysOrganizationService.updateById(sysOrganization);

        return  ResponseMessage.ok();
    }


    @OperationLog(operationType= OperateType.DELETE,operationName="删除")
    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){

        if(StringUtils.isEmpty(id)){
            return  ResponseMessage.error("id不能为空");
        }
        //检查是否存在下级单位
        List<String> list = sysOrganizationService.checkSublevel(id);
        if(list !=null && list.size() >0){
            return  ResponseMessage.error("存在下级单位，请先删除下级单位");
        }
        sysOrganizationService.removeById(id);

        return  ResponseMessage.ok();
    }


    @RequestMapping("list")
    @ResponseBody
    public ResponseMessage list(){


        return  ResponseMessage.ok();
    }

}

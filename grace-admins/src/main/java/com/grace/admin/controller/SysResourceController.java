package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysResource;
import com.grace.admin.service.ISysResourceService;
import com.grace.common.state.DataState;
import com.grace.common.state.OperateType;
import com.grace.common.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 系统资源表 前端控制器
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Controller
@RequestMapping("/resource/")
public class SysResourceController {

    @Autowired
    private ISysResourceService sysResourceService;

    @OperationLog(operationType= OperateType.ADD)
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysResource sysResource){

        sysResource.setId(IdGenerator.getNextId());
        sysResource.setFlag(DataState.ENABLE.getCode());
        sysResourceService.save(sysResource);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE,operationName="更新")
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysResource sysResource){

        sysResourceService.updateById(sysResource);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.DELETE)
    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){

        sysResourceService.removeById(id);
        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.LOGIC_DELETE,operationName="逻辑删除")
    @RequestMapping("logicDelete")
    @ResponseBody
    public ResponseMessage logicDelete(String id){

        sysResourceService.logicDelete(id);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.QUERY)
    @RequestMapping("list")
    @ResponseBody
    public ResponseMessage list(){


        return  ResponseMessage.ok();
    }

}

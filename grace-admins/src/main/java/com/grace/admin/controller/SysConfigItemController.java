package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysConfigItem;
import com.grace.admin.service.ISysConfigItemService;
import com.grace.common.state.OperateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Controller
@RequestMapping("/sys_config/")
public class SysConfigItemController {


    @Autowired
    private ISysConfigItemService sysConfigItemService;

    @OperationLog(operationType= OperateType.ADD,operationName="新增")
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysConfigItem sysConfigItem){

        sysConfigItem.setId(sysConfigItem.getId());
        sysConfigItemService.save(sysConfigItem);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE,operationName="更新")
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysConfigItem sysConfigItem){

        sysConfigItemService.updateById(sysConfigItem);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.LOGIC_DELETE,operationName="逻辑删除")
    @RequestMapping("logicDelete")
    @ResponseBody
    public ResponseMessage logicDelete(String id){

        sysConfigItemService.logicDelete(id);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.QUERY,operationName="查询")
    @RequestMapping("list")
    @ResponseBody
    public ResponseMessage list(){


        return  ResponseMessage.ok();
    }

}

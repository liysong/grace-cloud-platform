package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysConfigItem;
import com.grace.common.state.OperateType;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 角色-资源 前端控制器
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */

public class SysRoleResourceController {



    @OperationLog(operationType= OperateType.ADD,operationName="新增")
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(){



        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE,operationName="更新")
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(){



        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.LOGIC_DELETE,operationName="逻辑删除")
    @RequestMapping("logicDelete")
    @ResponseBody
    public ResponseMessage logicDelete(String id){



        return  ResponseMessage.ok();
    }



    @OperationLog(operationType= OperateType.DELETE,operationName="删除")
    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){


        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.QUERY,operationName="查询")
    @RequestMapping("list")
    @ResponseBody
    public ResponseMessage list(){


        return  ResponseMessage.ok();
    }





}

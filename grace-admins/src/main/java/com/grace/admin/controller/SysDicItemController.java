package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysDicItem;
import com.grace.admin.service.ISysDicItemService;
import com.grace.common.state.OperateType;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.resource.HttpResource;

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
@RequestMapping("/dic_item")
public class SysDicItemController {

    @Autowired
    private ISysDicItemService sysDicItemService;

    @OperationLog(operationType= OperateType.QUERY)
    @RequestMapping(value = {"/list"}, method = {RequestMethod.POST})
    @ResponseBody
    public ResponseMessage list(String groupId){
        List<SysDicItem> list = sysDicItemService.selectSysDicItemList(groupId);

        return  ResponseMessage.ok(list);
    }

    @OperationLog(operationType= OperateType.ADD)
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysDicItem sysDicItem){
         sysDicItem.setUpdateTime(new Date());
         sysDicItemService.save(sysDicItem);
         return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE)
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysDicItem sysDicItem){

        sysDicItem.setUpdateTime(new Date());
        sysDicItemService.updateById(sysDicItem);

        return  ResponseMessage.ok();
    }


    @OperationLog(operationType= OperateType.DELETE)
    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){

        sysDicItemService.removeById(id);


        return  ResponseMessage.ok();
    }

}

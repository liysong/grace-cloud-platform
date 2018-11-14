package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysDicGroup;
import com.grace.admin.po.SysDicItem;
import com.grace.admin.service.ISysDicGroupService;
import com.grace.admin.service.ISysDicItemService;
import com.grace.common.state.OperateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/dic_group")
public class SysDicGroupController {

    @Autowired
    private ISysDicItemService sysDicItemService;

    @Autowired
    private ISysDicGroupService sysDicGroupService;


    @OperationLog(operationType= OperateType.QUERY,operationName="查询")
   @RequestMapping(value = {"/list"}, method = {RequestMethod.POST})
   @ResponseBody
   public ResponseMessage list(String groupId){
        List<SysDicItem> list = sysDicItemService.selectSysDicItemList(groupId);

       return  ResponseMessage.ok(list);
   }

    @OperationLog(operationType= OperateType.ADD,operationName="新增")
    @RequestMapping("add")
    @ResponseBody
    public ResponseMessage add(SysDicGroup sysDicGroup){

       sysDicGroup.setUpdateTime(new Date());

       sysDicGroupService.save(sysDicGroup);

        return  ResponseMessage.ok();
    }

    @OperationLog(operationType= OperateType.UPDATE)
    @RequestMapping("update")
    @ResponseBody
    public ResponseMessage update(SysDicGroup sysDicGroup){

        sysDicGroupService.updateById(sysDicGroup);

        return  ResponseMessage.ok();
    }


    @OperationLog(operationType= OperateType.DELETE)
    @RequestMapping("delete")
    @ResponseBody
    public ResponseMessage delete(String id){

       //检查是否存在字典项，不存在可以删除
        List<SysDicItem> list = sysDicItemService.selectSysDicItemList(id);
        if(list !=null && list.size() >0){
            return  ResponseMessage.error("存在字典项，请先删除字典项");
        }

        sysDicGroupService.removeById(id);

        return  ResponseMessage.ok();
    }

}

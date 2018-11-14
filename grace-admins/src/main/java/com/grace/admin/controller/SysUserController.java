package com.grace.admin.controller;


import com.grace.admin.annotation.OperationLog;
import com.grace.admin.common.ResponseMessage;
import com.grace.admin.po.SysUser;
import com.grace.admin.po.SysUserRole;
import com.grace.admin.service.ISysUserRoleService;
import com.grace.admin.service.ISysUserService;
import com.grace.common.state.DataState;
import com.grace.common.state.OperateType;
import com.grace.common.util.IdGenerator;
import com.grace.common.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
@RestController
@Api("userController相关api")
@RequestMapping("/user/")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private ISysUserRoleService sysUserRoleService;

    /**
     * 添加管理员
     */
    @ApiOperation(value="用户新增")
    @RequestMapping("add")
    @OperationLog(operationType= OperateType.ADD,operationName="新增用户")
    @ResponseBody
    public ResponseMessage add(@Valid SysUser user,String[] roleIds) {


        // 判断账号是否重复
        SysUser theUser = sysUserService.getSysUserByLoginName(user.getLoginName());

        if (theUser != null) {
           // throw new ServiceException(BizExceptionEnum.USER_ALREADY_REG);
            ResponseMessage.error("该账号已存在，请重新填写");
        }

        // 完善账号信息
        user.setId(IdGenerator.getNextId());
     //   user.setSalt(SysShiroUtil.getRandomSalt(5));
    //    user.setPassword(SysShiroUtil.md5(user.getPassword(), user.getSalt()));
        user.setStatus(DataState.ENABLE.getCode());
        user.setCreateTime(new Date());

        //获取角色id集合
        if(roleIds !=null && roleIds.length >0){
            List<SysUserRole> list = new ArrayList<>();
            for(String roleId: roleIds){
                list.add(new SysUserRole(IdGenerator.getNextId(),user.getId(),roleId));
            }
            sysUserRoleService.saveBatch(list);
        }
        sysUserService.save(user);
        return ResponseMessage.ok();
    }


    @ApiOperation(value="用户更新")
    @RequestMapping("update")
    @OperationLog(operationType= OperateType.UPDATE,operationName="更新用户")
    @ResponseBody
    public ResponseMessage  update(@Valid SysUser sysUser){

        if(sysUser != null){
            sysUserService.updateById(sysUser);
            return  ResponseMessage.ok();
        }
        return  ResponseMessage.error();
    }


    @RequestMapping("delete")
    @OperationLog(operationType= OperateType.DELETE,operationName="删除用户")
    @ResponseBody
    public ResponseMessage  delete(String id){

       if(id !=null){
           //删除该用户下拥有的角色

           sysUserService.removeById(id);

           return  ResponseMessage.ok();
       }
        return  ResponseMessage.error();
    }

    @OperationLog(operationType= OperateType.UPDATE,operationName="更改用户密码")
    @RequestMapping("/changePwd")
    @ResponseBody
    public ResponseMessage changePwd(String oldPassword, String newPassword){

        if(StringUtils.isEmpty(newPassword)){
            return ResponseMessage.error("新密码不能为空");
        }


        return  ResponseMessage.ok();

    }


    @OperationLog(operationType= OperateType.UPDATE,operationName="改变用户状态")
    @RequestMapping("/changeStatus")
    @ResponseBody
    public ResponseMessage changeStatus(int status){

        String userId = null;
      //          SysShiroUtil.getUser().getId();

        sysUserService.setStatus(userId,status);

        return ResponseMessage.ok();
    }


}

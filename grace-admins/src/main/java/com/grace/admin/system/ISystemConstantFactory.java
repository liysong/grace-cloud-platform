package com.grace.admin.system;

import com.grace.admin.po.SysDicItem;
import com.grace.admin.po.SysOrganization;
import com.grace.admin.po.SysRole;
import com.grace.admin.po.SysUser;

import java.util.List;

/**
 * @Auther: song
 * @Date: 2018/11/7 11:21
 * @Description:
 * @Version:1.0.0
 */
public interface ISystemConstantFactory {

    /**
     * 根据用户id，获取用户
     * @param userId
     * @return
     */
    SysUser getSysUser(String userId);

    SysRole getSysRole(String roleId);






    List<SysDicItem> getSysDicItemList(String  groupId);

    SysOrganization  getSysOrganization(String id);


}

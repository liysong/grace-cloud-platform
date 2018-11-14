package com.grace.admin.system;

import com.grace.admin.config.SpringContextHolder;
import com.grace.admin.po.SysDicItem;
import com.grace.admin.po.SysOrganization;
import com.grace.admin.po.SysRole;
import com.grace.admin.po.SysUser;
import com.grace.admin.service.*;
import com.grace.admin.service.impl.*;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: song
 * @Date: 2018/11/7 14:29
 * @Description:
 * @Version:1.0.0
 */
@Component
@DependsOn("springContextHolder")
public class SystemConstantFactory implements ISystemConstantFactory {

    private ISysUserService sysUserService = SpringContextHolder.getBean(SysUserService.class);

    private ISysRoleService sysRoleService = SpringContextHolder.getBean(SysRoleService.class);

    private ISysOrganizationService sysOrganizationService = SpringContextHolder.getBean(SysOrganizationService.class);

    private ISysDicItemService sysDicItemService = SpringContextHolder.getBean(SysDicItemService.class);

   // private ISysUserRoleService sysUserRoleService = SpringContextHolder.getBean(SysUserRoleService.class);

   // private ISysResourceService sysResourceService = SpringContextHolder.getBean(SysResourceService.class);



    @Override
    public SysUser getSysUser(String userId) {

        SysUser sysUser = sysUserService.getById(userId);
        if(sysUser !=null){
            return  sysUser;
        }

        return null;
    }

    @Override
    public SysRole getSysRole(String roleId) {
        return sysRoleService.getById(roleId);
    }

    @Override
    public List<SysDicItem> getSysDicItemList(String groupId) {

        List<SysDicItem> dicItemList = sysDicItemService.selectSysDicItemList(groupId);
        if(dicItemList !=null){
            return  dicItemList;
        }


        return null;
    }

    @Override
    public SysOrganization getSysOrganization(String id) {
        SysOrganization sysOrganization = sysOrganizationService.getById(id);
        if(sysOrganization !=null){
            return  sysOrganization;
        }
        return null;
    }
}

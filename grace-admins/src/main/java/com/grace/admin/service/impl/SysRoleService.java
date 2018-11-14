package com.grace.admin.service.impl;

import com.grace.admin.po.SysRole;
import com.grace.admin.mapper.SysRoleMapper;
import com.grace.admin.service.ISysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysRoleService extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Override
    public List<SysRole> selectSysRoleList(String userId) {
        return baseMapper.selectSysRoleList(userId);
    }

    @Override
    public List<String> getRoleIds(String userId){
        List<SysRole> sysRoles=  selectSysRoleList(userId);
        List<String> roleIds = new ArrayList<>();
        if(sysRoles !=null && sysRoles.size() >0){
            for(SysRole sysRole:sysRoles){
                roleIds.add(sysRole.getId());

            }

            return roleIds;
        }

        return  null;

    }

    @Override
    public void logicDelete(String id) {
        baseMapper.logicDelete(id);
    }

    @Override
    public void changeStatus(String id, Integer status) {
        baseMapper.changeStatus(id, status);
    }
}

package com.grace.admin.service.impl;

import com.grace.admin.po.SysRoleResource;
import com.grace.admin.mapper.SysRoleResourceMapper;
import com.grace.admin.service.ISysRoleResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色-资源 服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysRoleResourceService extends ServiceImpl<SysRoleResourceMapper, SysRoleResource> implements ISysRoleResourceService {

    @Override
    public int deleteRoleResourceByRole(String roleId) {
        return baseMapper.deleteRoleResourceByRole(roleId);
    }
}

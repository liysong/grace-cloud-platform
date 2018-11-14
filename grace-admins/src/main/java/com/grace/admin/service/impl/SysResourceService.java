package com.grace.admin.service.impl;

import com.grace.admin.po.SysResource;
import com.grace.admin.mapper.SysResourceMapper;
import com.grace.admin.service.ISysResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统资源表 服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysResourceService extends ServiceImpl<SysResourceMapper, SysResource> implements ISysResourceService {

    @Override
    public List<SysResource> selectSysResourcelist(String roleId) {
        return baseMapper.selectSysResourceList(roleId);
    }


    @Override
    public List<String> selectPermissionList(String roleId) {
        return baseMapper.selectPermissionList(roleId);
    }

    @Override
    public void logicDelete(String id) {
        baseMapper.logicDelete(id);
    }
}

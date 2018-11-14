package com.grace.admin.service.impl;

import com.grace.admin.po.SysOrganization;
import com.grace.admin.mapper.SysOrganizationMapper;
import com.grace.admin.service.ISysOrganizationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
public class SysOrganizationService extends ServiceImpl<SysOrganizationMapper, SysOrganization> implements ISysOrganizationService {

    @Override
    public List<String> checkSublevel(String id) {
        return baseMapper.checkSublevel(id);
    }
}

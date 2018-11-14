package com.grace.admin.service.impl;

import com.grace.admin.po.SysUser;
import com.grace.admin.mapper.SysUserMapper;
import com.grace.admin.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public SysUser getSysUserByLoginName(String loginName) {
        return baseMapper.getSysUserByLoginName(loginName);
    }

    @Override
    public int setStatus(String userId, int status) {
        return baseMapper.setStatus(userId,status);
    }

    @Override
    public int changePwd(String userId, String pwd) {
        return baseMapper.changePwd(userId,pwd);
    }
}

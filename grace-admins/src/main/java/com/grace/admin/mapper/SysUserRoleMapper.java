package com.grace.admin.mapper;

import com.grace.admin.po.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户-角色 Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    void  deleteByUserId(String userId);

}

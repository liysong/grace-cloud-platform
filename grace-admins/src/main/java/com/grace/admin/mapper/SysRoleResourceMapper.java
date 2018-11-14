package com.grace.admin.mapper;

import com.grace.admin.po.SysRoleResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 角色-资源 Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysRoleResourceMapper extends BaseMapper<SysRoleResource> {

    int  deleteRoleResourceByRole(String roleId);

}

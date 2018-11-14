package com.grace.admin.service;

import com.grace.admin.po.SysRoleResource;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 角色-资源 服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysRoleResourceService extends IService<SysRoleResource> {


    int deleteRoleResourceByRole(String roleId);

}

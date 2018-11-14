package com.grace.admin.service;

import com.grace.admin.po.SysResource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 系统资源表 服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysResourceService extends IService<SysResource> {

    List<SysResource> selectSysResourcelist(String roleId);

    List<String> selectPermissionList(String roleId);

    void  logicDelete(String id);
}

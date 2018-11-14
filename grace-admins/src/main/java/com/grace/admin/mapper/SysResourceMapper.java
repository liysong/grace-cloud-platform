package com.grace.admin.mapper;

import com.grace.admin.po.SysResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 系统资源表 Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysResourceMapper extends BaseMapper<SysResource> {

    List<SysResource> selectSysResourceList(String roleId);

    /**
     * 通过角色查询权限标识
     * @param roleId
     * @return
     */
    List<String> selectPermissionList(String roleId);

    void  logicDelete(String id);
}

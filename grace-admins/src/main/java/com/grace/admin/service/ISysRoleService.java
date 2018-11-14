package com.grace.admin.service;

import com.grace.admin.po.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  角色服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysRoleService extends IService<SysRole> {

    List<SysRole> selectSysRoleList(String userId);


    List<String> getRoleIds(String userId);


    /**
     * 逻辑删除角色
     * @param id
     */
    void  logicDelete(String id);

    /**
     * 设置角色的状态
     * @param id
     * @param status
     */
    void  changeStatus(String id, Integer status);




}

package com.grace.admin.mapper;

import com.grace.admin.po.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectSysRoleList(String userId);

     void  logicDelete(String id);

     void  changeStatus(@Param("id") String id, @Param("status") Integer status);

}

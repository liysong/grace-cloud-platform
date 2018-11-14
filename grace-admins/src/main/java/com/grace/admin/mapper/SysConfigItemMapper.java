package com.grace.admin.mapper;

import com.grace.admin.po.SysConfigItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysConfigItemMapper extends BaseMapper<SysConfigItem> {

    void  logicDelete(String id);

}

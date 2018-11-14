package com.grace.admin.mapper;

import com.grace.admin.po.SysDicItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface SysDicItemMapper extends BaseMapper<SysDicItem> {

    List<SysDicItem> selectSysDicItemList(String groupId);

}

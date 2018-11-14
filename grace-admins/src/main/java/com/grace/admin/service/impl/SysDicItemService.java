package com.grace.admin.service.impl;

import com.grace.admin.po.SysDicItem;
import com.grace.admin.mapper.SysDicItemMapper;
import com.grace.admin.service.ISysDicItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysDicItemService extends ServiceImpl<SysDicItemMapper, SysDicItem> implements ISysDicItemService {

    /**
     * 通过字典组获取字典项集合
     * @param groupId
     * @return
     */
    @Override
    public List<SysDicItem> selectSysDicItemList(String groupId) {
        return baseMapper.selectSysDicItemList(groupId);
    }
}

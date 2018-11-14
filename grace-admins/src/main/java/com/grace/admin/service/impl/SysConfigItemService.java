package com.grace.admin.service.impl;

import com.grace.admin.po.SysConfigItem;
import com.grace.admin.mapper.SysConfigItemMapper;
import com.grace.admin.service.ISysConfigItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@Service
public class SysConfigItemService extends ServiceImpl<SysConfigItemMapper, SysConfigItem> implements ISysConfigItemService {

    @Override
    public void logicDelete(String id) {
        baseMapper.logicDelete(id);
    }
}

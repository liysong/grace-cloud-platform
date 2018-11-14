package com.grace.admin.service;

import com.grace.admin.po.SysConfigItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysConfigItemService extends IService<SysConfigItem> {

    /**
     * 逻辑删除系统配置项
     * @param id
     */
    void  logicDelete(String id);
}

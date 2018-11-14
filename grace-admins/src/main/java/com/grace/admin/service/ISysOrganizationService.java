package com.grace.admin.service;

import com.grace.admin.po.SysOrganization;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
public interface ISysOrganizationService extends IService<SysOrganization> {

    /**
     * 检查是否下级单位
     * @param id
     * @return
     */
    List<String> checkSublevel(String id);
}

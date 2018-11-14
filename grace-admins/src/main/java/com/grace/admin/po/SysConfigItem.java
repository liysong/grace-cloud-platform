package com.grace.admin.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@TableName("SYS_CONFIG_ITEM")
public class SysConfigItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableField("ID")
    private String id;

    /**
     * 名称
     */
    @TableField("NAME")
    private String name;

    @TableField("CODE")
    private String code;

    /**
     * 值
     */
    @TableField("VALUE")
    private String value;

    /**
     * 系统参数组
     */
    @TableField("GROUP_CODE")
    private String groupCode;

    /**
     * 信息描述
     */
    @TableField("DESCRIPTION")
    private String description;

    @TableField("FLAF")
    private Integer flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "SysConfigItem{" +
        "id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", value=" + value +
        ", groupCode=" + groupCode +
        ", flag=" + flag +
        ", description=" + description +
        "}";
    }
}

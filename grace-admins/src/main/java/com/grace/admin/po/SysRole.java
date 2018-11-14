package com.grace.admin.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@TableName("SYS_ROLE")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    /**
     * 角色名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 角色编号,如admin
     */
    @TableField("ROLE_CODE")
    private String roleCode;

    /**
     * 角色类型
     */
    @TableField("ROLE_TYPE")
    private Integer roleType;

    /**
     * 角色状态，是否可用，0:可用,1:不可用
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 角色描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 逻辑删除，0: 不删除,1:删除状态
     */
    @TableField("FLAG")
    private Integer flag;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    @TableField(exist = false)
    private List<String > resourceIds;

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
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        "id=" + id +
        ", name=" + name +
        ", roleCode=" + roleCode +
        ", roleType=" + roleType +
        ", status=" + status +
        ", description=" + description +
        ", flag=" + flag +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

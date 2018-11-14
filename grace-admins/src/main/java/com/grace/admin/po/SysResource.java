package com.grace.admin.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统资源表
 * </p>
 *
 * @author song
 * @since 2018-11-04
 */
@TableName("SYS_RESOURCE")
public class SysResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    /**
     * 中文描述
     */
    @TableField("NAME")
    private String name;

    /**
     * 父节点id，根节点此值为0
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 权限编码，系统通过此code进行权限识别，要求全局唯一
     */
    @TableField("PERMISSION_CODE")
    private String permissionCode;

    /**
     * 1.菜单权限 2.功能权限
     */
    @TableField("TYPE")
    private String type;

    /**
     * URI，一般菜单权限才具有
     */
    @TableField("URI")
    private String uri;

    /**
     * 图标，一般菜单权限才使用
     */
    @TableField("MENU_ICON")
    private String menuIcon;

    /**
     * 排序，一般菜单权限才使用
     */
    @TableField("SORT")
    private String sort;

    /**
     * 备注
     */
    @TableField("DESCRIPTION")
    private String description;

    @TableField("FLAG")
    private Integer flag;

    @TableField("STATUS")
    private Integer status;

    /**
     * 是否根节点，1是，0否
     */
    @TableField("IS_ROOT")
    private String isRoot;

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
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    @Override
    public String toString() {
        return "SysResource{" +
        "id=" + id +
        ", name=" + name +
        ", parentId=" + parentId +
        ", permissionCode=" + permissionCode +
        ", type=" + type +
        ", uri=" + uri +
        ", menuIcon=" + menuIcon +
        ", sort=" + sort +
        ", description=" + description +
        ", flag=" + flag +
        ", status=" + status +
        ", isRoot=" + isRoot +
        "}";
    }
}

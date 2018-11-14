package com.grace.admin.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.sql.Clob;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author song
 * @since 2018-11-11
 */
@TableName("SYS_OPERATION_LOG")
public class SysOperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    @TableField("LOG_TYPE")
    private Integer logType;

    @TableField("NAME")
    private String name;

    @TableField("USER_ID")
    private String userId;

    @TableField("CLASS_NAME")
    private String className;

    @TableField("METHOD")
    private String method;

    @TableField("CREATE_TIME")
    private Date createTime;

    @TableField("STATUS")
    private Integer status;

    @TableField("IP")
    private String ip;

    @TableField("PARAMS")
    private String params;

    @TableField("MESSAGE")
    private Clob message;


    @TableField("TOTAL_TIME")
    private Long totalTime;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public Clob getMessage() {
        return message;
    }

    public void setMessage(Clob message) {
        this.message = message;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "SysOperationLog{" +
        "id=" + id +
        ", logType=" + logType +
        ", name=" + name +
        ", userId=" + userId +
        ", className=" + className +
        ", method=" + method +
        ", createTime=" + createTime +
        ", status=" + status +
        ", ip=" + ip +
        ", params=" + params +
        ", message=" + message +
        "}";
    }
}

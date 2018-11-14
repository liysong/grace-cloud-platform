package com.grace.admin.common;

import java.io.Serializable;

/**
 * @Auther: song
 * @Date: 2018/11/8 14:54
 * @Description:
 * @Version:1.0.0
 */
public class ResponseMessage implements Serializable {

    private static String  SUCCESS_MSG ="操作成功";

    private static String  ERROR_MSG = "操作失败";

    /**
     * 状态码
     */
    private int code;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 反馈信息
     */
    private String  message;

    /**
     * 存储的数据
     */
    private Object data;


    protected ResponseMessage(Boolean success, Object data, String message) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    protected ResponseMessage(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static ResponseMessage ok() {
        return new ResponseMessage(true,"ddd" ,SUCCESS_MSG);
    }

    public static ResponseMessage ok(Object data) {
        return new ResponseMessage(true, data,SUCCESS_MSG);
    }

    public static ResponseMessage ok(String  message) {
        return new ResponseMessage(true, null,message);
    }

    public static ResponseMessage error() {
        return new ResponseMessage(false,ERROR_MSG );
    }

    public static ResponseMessage error(String message) {
        return new ResponseMessage(false, message);
    }

    public static ResponseMessage error(Object data) {
        return new ResponseMessage(false, data,ERROR_MSG);
    }


}

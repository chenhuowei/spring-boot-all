package com.fireway.common;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:47
 * @Description:
 */
public class ResponseModel {

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    public static ResponseModel success(String message,Object data){
        return  new ResponseModel(Boolean.TRUE,message,data,0);
    }

    public static ResponseModel error(String message,Object data){
        return  new ResponseModel(Boolean.FALSE,message,data,-1);
    }
    public static ResponseModel success(String message){
        return  new ResponseModel(Boolean.TRUE,message,null,0);
    }

    public static ResponseModel error(String message){
        return  new ResponseModel(Boolean.FALSE,message,null,-1);
    }


    public ResponseModel() {
    }

    public ResponseModel(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    public ResponseModel(boolean success, String message, Object data,int code) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

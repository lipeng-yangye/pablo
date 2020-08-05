package com.lp.business.json;

import com.lp.business.enums.CodeEnum;

import java.io.Serializable;

public class ResultJson<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String successCode = "00000";
    private static final String successMessage = "处理成功";

    private final String resultCode;
    private final String resultMesg;
    private final T data;

    public ResultJson(){
        this.resultCode = successCode;
        this.resultMesg = successMessage;
        this.data = null;
    }

    public ResultJson(String resultCode,String resultMesg,T data){
        this.resultCode = resultCode;
        this.resultMesg = resultMesg;
        this.data = data;
    }

    public static ResultJson success(Object data) {
        return new ResultJson<>(successCode,successMessage,data);
    }

    public static ResultJson json(CodeEnum codeEnum,Object data) {
        return new ResultJson<>(codeEnum.getCode(),codeEnum.getMessage(),data);
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMesg() {
        return resultMesg;
    }

    public T getData() {
        return data;
    }
}

package com.model.json;

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
}

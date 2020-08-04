package com.enums;
/**
 * 系统异常回参枚举值
 */
public enum  CodeEnum {
    SYSTEM_EXCEPTION("99999","系统处理异常");

    private final String code;
    private final String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    CodeEnum(final String code, final String message){
        this.code = code;
        this.message = message;
    }

    public static CodeEnum getEnum(String code){
        CodeEnum[] codeEnums = values();
        for (CodeEnum codeEnum : codeEnums) {
            if(codeEnum.getCode().equals(code)){
                return codeEnum;
            }
        }
        return SYSTEM_EXCEPTION;
    }
}

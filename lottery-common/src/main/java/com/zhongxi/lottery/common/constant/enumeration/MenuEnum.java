package com.zhongxi.lottery.common.constant.enumeration;

/**
 * 是否是菜单的枚举
 * 
 * @author shenxh
 * @since 2018-05-04
 */
public enum MenuEnum {
	YES(1, "是"),
    NO(0, "不是");//不是菜单的是按钮

    int code;
    String message;

    MenuEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String valueOf(Integer status) {
        if (status == null) {
            return "";
        } else {
            for (MenuEnum s : MenuEnum.values()) {
                if (s.getCode() == status) {
                    return s.getMessage();
                }
            }
            return "";
        }
    }
}

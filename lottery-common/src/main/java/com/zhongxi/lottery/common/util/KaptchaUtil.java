package com.zhongxi.lottery.common.util;

import com.zhongxi.lottery.common.properties.LotteryProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {
    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(LotteryProperties.class).getKaptchaOpen();
    }
}

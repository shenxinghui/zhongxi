package com.zhongxi.lottery.common.constant.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * 基本变量类型的枚举
 *
 * @author shenxh
 * @since 2018-05-04
 */
public enum BasicTypeEnum {
    BYTE, SHORT, INT, INTEGER, LONG, DOUBLE, FLOAT, BOOLEAN, CHAR, CHARACTER, STRING;

	 /**
     * 包装类型为Key，原始类型为Value，例如： Integer.class -> int.class.
     */
    public static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<Class<?>, Class<?>>(8);

    /**
     * 原始类型为Key，包装类型为Value，例如： int.class -> Integer.class.
     */
    public static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<Class<?>, Class<?>>(8);

    static {
        wrapperPrimitiveMap.put(Boolean.class, boolean.class);
        wrapperPrimitiveMap.put(Byte.class, byte.class);
        wrapperPrimitiveMap.put(Character.class, char.class);
        wrapperPrimitiveMap.put(Double.class, double.class);
        wrapperPrimitiveMap.put(Float.class, float.class);
        wrapperPrimitiveMap.put(Integer.class, int.class);
        wrapperPrimitiveMap.put(Long.class, long.class);
        wrapperPrimitiveMap.put(Short.class, short.class);

        for (Map.Entry<Class<?>, Class<?>> entry : wrapperPrimitiveMap.entrySet()) {
            primitiveWrapperMap.put(entry.getValue(), entry.getKey());
        }
    }
}

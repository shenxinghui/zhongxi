package com.zhongxi.lottery.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.zhongxi.lottery.common.exception.ToolBoxException;

/**
 * 
 * 日期工具类
 *
 * @author shenxh
 * @since 2018-05-03
 */
public class DateUtils {
	
	//pattern 
	public final static String YYYY_MM_DD = "yyyy-MM-dd";
	public final static String HH_MM_SS = "HH:mm:ss";
	public final static String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
	public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public final static String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
	
	
	public static String dateToString_YYYY_MM_DD(Date date) {
		return dateToString(date,YYYY_MM_DD);
	}
	
	public static String dateToString_HH_MM_SS(Date date) {
		return dateToString(date,HH_MM_SS);
	}
	
	public static String dateToString_YYYY_MM_DD_HH_MM(Date date) {
		return dateToString(date,YYYY_MM_DD_HH_MM);
	}
	
	public static String dateToString_YYYY_MM_DD_HH_MM_SS(Date date) {
		return dateToString(date,YYYY_MM_DD_HH_MM_SS);
	}
	
	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	
	public static Date stringToDate_YYYY_MM_DD(String dateStr) {
		return stringToDate(dateStr,YYYY_MM_DD);
	}
	
	public static Date dateToString_HH_MM_SS(String dateStr) {
		return stringToDate(dateStr,HH_MM_SS);
	}
	
	public static Date dateToString_YYYY_MM_DD_HH_MM(String dateStr) {
		return stringToDate(dateStr,YYYY_MM_DD_HH_MM);
	}
	
	public static Date dateToString_YYYY_MM_DD_HH_MM_SS(String dateStr) {
		return stringToDate(dateStr,YYYY_MM_DD_HH_MM_SS);
	}
	
	public static Date stringToDate(String dateStr, String format) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(dateStr);
		} catch (Exception e) {
			date = null;
		}
		return date;
	}
	
	/**
	 * 格式：<br>
	 * 1、yyyy-MM-dd<br>
	 * 2、HH:mm:ss<br>
	 * 3、yyyy-MM-dd HH:mm 
	 * 4、yyyy-MM-dd HH:mm:ss
	 * 5、yyyy-MM-dd HH:mm:ss.SSS
	 *
	 * @param dateStr 日期字符串
	 * @return 日期
	 */
	public static Date parse(String dateStr) {
		if (null == dateStr) {
			return null;
		}
		dateStr = dateStr.trim();
		int length = dateStr.length();
		try {
			if (length == YYYY_MM_DD.length()) {
				return stringToDate_YYYY_MM_DD(dateStr);
			} else if (length == HH_MM_SS.length()) {
				return dateToString_HH_MM_SS(dateStr);
			} else if (length == YYYY_MM_DD_HH_MM.length()) {
				return dateToString_YYYY_MM_DD_HH_MM(dateStr);
			} else if (length == YYYY_MM_DD_HH_MM_SS.length()) {
				return dateToString_YYYY_MM_DD_HH_MM_SS(dateStr);
			} else if (length >= YYYY_MM_DD_HH_MM_SS_SSS.length() - 2) {
				return stringToDate(dateStr, YYYY_MM_DD_HH_MM_SS_SSS);
			}
		} catch (Exception e) {
			throw new ToolBoxException(StringUtils.format("Parse [{}] with format normal error!", dateStr));
		}

		// 没有更多匹配的时间格式
		throw new ToolBoxException(StringUtils.format(" [{}] format is not fit for date pattern!", dateStr));
	}
}

package com.ygh.test;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * @title:tools_class
 * @description:使用这个类进行国际化的编码转换
 * @author hzhiping
 * @since:2018年4月2日 上午9:25:21
 */
public class CodeFormat {
	private static Locale locale = new Locale("zh","CN");
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n.message.messageResource", locale);
	
	/**
	 * 提供key，返回key对应的键值
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		String result="";
		try {
			// 获取到messageResource中对应的值，并且将其字节进行转换成UTF-8
			result=new String(resourceBundle.getString(key).getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 主测试方法
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(resourceBundle.toString());
		System.out.println(getValue("1003"));
	}
	// 本座修改了这里的东西
}

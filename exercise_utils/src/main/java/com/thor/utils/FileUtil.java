package com.thor.utils;

import java.io.File;

/**
 * 文件工具类
 * @author Thor Li
 * 2019年6月14日下午3:38:26
 */
public class FileUtil {
	
	public static void main(String[] args) {
		System.out.println(getExtendName("aaa.jpg"));
		System.out.println(getTempDirectory());
		System.out.println(getUserDirectory());
		System.out.println(IsFileOrDirectory("D:\\BaiduNetdiskDownload\\[120517] [PHAM!] anmei.zip"));
	}
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		String[] split = fileName.split("\\.");
		//返回数组的最后一位，也就是数组的长度-1
		return split[split.length-1];
		}
	
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		String folder = System.getProperty("java.io.tmpdir");
		File file = new File(folder);
		return file;
	}

	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String property = System.getProperty("user.home");
		File file = new File(property);
		return file;
	}
	
	/**
	 * 方法4：判断输入的路径是否为文件夹或文件
	 * 如果是文件就返回文件，如果是文件夹就返回文件夹
	 */
	public static String IsFileOrDirectory(String filePath) {
		File file = new File(filePath);
		if (file.isDirectory()) {
			return filePath + "是文件夹";
		} else {
			return filePath + "是文件";
		}
	}
	
	/**
	 * 方法5：遍历文件夹，如果是文件，直接输出文件的名称
	 */
	public static void forToDirectory() {
		
	}
}

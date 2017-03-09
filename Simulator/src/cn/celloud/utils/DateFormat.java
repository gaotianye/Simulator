package cn.celloud.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期转换
 * @author Administrator
 *
 */
public class DateFormat {
	private DateFormat(){}
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static String parseYMDHMS(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        return dateFormat.format(date);
	}
	
	/**
	 * yyyy_MM_dd_HH_mm_ss
	 */
	public static String parseYMDHMS2(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");  
        return dateFormat.format(date);
	}
	
	/**
	 * yyyy_MM_dd_HH_mm_ss_SSS
	 */
	public static String parseYMDHMS_SSS(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");  
		return dateFormat.format(date);
	}
	/**
	 * yyyy-MM-dd
	 */
	public static String parseYMD(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		return dateFormat.format(date);
	}
	
	/**
	 * MM_dd_HH_mm
	 */
	public static String parseMDHM(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd_HH_mm");  
		return dateFormat.format(date);
	}
	
	/**
	 * yy
	 */
	public static String parseY(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy");  
		return dateFormat.format(date);
	}
	
	/**
	 * MM
	 */
	public static String parseM(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM");  
		return dateFormat.format(date);
	}
	
	/**
	 * dd
	 */
	public static String parseD(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");  
		return dateFormat.format(date);
	}
	
	/**
	 * second(秒)-->minute(分) +1
	 */
	public static int parseFromSToMAdd1(int second){
		return second/60+1;
	}
	
	/**
	 * second(秒)-->minute(分)
	 */
	public static int parseFromSToM(int second){
		return second/60;
	}
	
	/**
	 * milisecond(毫秒)-->minute(分)+second(秒)
	 */
	public static String parseFromSToMS(long milisecond){
		long second = milisecond/1000;
		return second/60+"分"+second%60+"秒";
	}
	
	/**
	 * String---long
	 * @throws Exception 
	 */
	public static long parseStringToLong(String time) throws Exception{
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
		return format.parse(time).getTime();
	}
	
	//test
	public static void main(String[] args) {
		String parseYMDHMS_SSS = parseYMDHMS_SSS(new Date());
		System.out.println(parseYMDHMS_SSS);
	}
}

package cn.celloud.txt;

import java.util.Date;
import java.util.Random;

import cn.celloud.utils.DateFormat;
import cn.celloud.utils.FileUtils;

/**
 * 1、每行10个单词。 
 * 2、每个单词中间用空格分开 
 * 3、每个单词 字母个数从3-5（随机）
 * 4、每个单词 出现的字母 也是随机的（小写） good
 * @author Administrator
 */
public class WordCount {
	public static void main(String[] args) {
		char letter = 'a';
		String chars = "abcdefghijklmnopqrstuvwxyz";
		// 4、每个线程处理1行
		// 1、for循环10次，生成的单词中间用空格分开
		while (true) {
			String line = "";
			for (int i = 0; i < 20; i++) {
				int nextInt = 0;
				String word = "";
				// 2、随机生成单词长度,最短3，最长5
				Random random = new Random();
				//random.nextInt(N)--[0,N)
				nextInt = random.nextInt(3) + 3;
				// 3、随机生成字母
				for (int j = 0; j < nextInt; j++) {
					letter = chars.charAt((int) (Math.random() * 26));
					word += letter;
				}
				line = line + word + " ";
				// 5、将生成的每行数据写入1个文件中
			}
			line = line.trim();
			String fileName = DateFormat.parseYMD(new Date());
			FileUtils.writeToFile("/"+fileName, line);
		}
	}
}

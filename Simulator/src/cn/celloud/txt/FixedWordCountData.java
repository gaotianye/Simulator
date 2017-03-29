package cn.celloud.txt;

import java.io.File;
import java.util.Date;

import cn.celloud.utils.DateFormat;
import cn.celloud.utils.FileUtils;

/**
 * 1、每行args[0]个单词。 
 * 2、每个单词中间用空格分开 
 * 3、每个单词 字母个数固定，但是是用户指定的
 * 4、每个单词 出现的字母 也是随机的（小写） good
 * @author Administrator
 */
public class FixedWordCountData {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.err.println("Usage: FixedWordCountData <num4eachLine> <randomNum> <output>");
			// 非正常退出 System.exit(0)代表正常退出
			System.exit(1);
		}
		int arg0 = Integer.parseInt(args[0]);
		int arg1 = Integer.parseInt(args[1]);
		char letter = 'a';
		String chars = "abcdefghijklmnopqrstuvwxyz";
		// 3、每个线程处理1行
		// 1、for循环args[0]次，表示每行生成多少个单词，生成的单词中间用空格分开
		while (true) {
			String line = "";
			for (int i = 0; i < arg0; i++) {
				int nextInt = 0;
				String word = "";
				// 2、随机生成字母,字母个数由用户指定
				for (int j = 0; j < arg1; j++) {
					letter = chars.charAt((int) (Math.random() * 26));
					word += letter;
				}
				line = line + word + " ";
			}
			line = line.trim();
			String fileName = DateFormat.parseYMD(new Date());
			// 4、将生成的每行数据写入1个文件中
			FileUtils.writeToFile(args[2]+File.separatorChar+fileName, line);
		}
	}
}

import java.util.Scanner;

public class demo_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("UI!");
		String str1 = "Hello world,Liao pan and LCY";
		String str2 = " Just call me LP and let me know something!    ";
		//返回s字符串长度
		System.out.println(str1.length());
		
		//返回s字符串中下标为2的字符
		System.out.println(str1.charAt(2));
		
		
		//返回s字符串中下标0到4的子字符串
		System.out.println(str2.substring(0,4));
		
		//返回子字符串"Hello"的下标
		System.out.println(str1.indexOf("hello"));
		
		//判断s是否以空格开始
		System.out.println(str2.startsWith(" "));
		//判断s是否为空
		System.out.println(str2.isEmpty());
		
		//判断s是否以"oo"结束
		System.out.println(str1.endsWith("oo"));
		
		//判断s是否等于"Good World!"
		System.out.println(str2.equals("Good World!"));
		
		//比较s字符串与"Hello Nerd!"在词典中的顺序，
		System.out.println(str1.compareTo("H"));
		//System.out.println((byte)'e');  //字符转ascii码
		//去掉s前后的空格字符串，并返回新的字符串
		System.out.println(str2.trim());
		
		// 将s转换为大写字母，并返回新的字符串
		System.out.println(str1.toUpperCase());
		
		// 将s转换为小写，并返回新的字符串
		System.out.println(str1.toLowerCase());
		
		// 将"World"替换为"Universe"，并返回新的字符串
		System.out.println(str1.replace("world", "Universe"));
		
		//valueOf(int a)  //将参数字符串化
		System.out.println(str1.valueOf(123));
		
		
		//将此字符串转换为一个新的字符数组。
		System.out.println(str1.toCharArray()[2]);
		
		
		//从控制台读取字符串
		//Scanner input = new Scanner(System.in);
		//String str3 = input.next();  //next以空格区分，而nextLine（）以回车键区分；
		//System.out.println(str3);
		//format  //既定字符串格式的重复使用
		System.out.println();
		
		//getBytes()
		System.out.println(str1.getBytes());
		
		//getchars()  
		char[] chr = new char[30];
		str1.getChars(0, 5, chr, 0);
		System.out.println(chr);
		
		
		//split  找出所有的字母
		String str4 = "A:BC}||D";
		
		System.out.println();
		
		//hashcode()        Returns a hash code for this string.
		System.out.println();
		
		
		//cantains(s1) ：如果包含s1，则返回true
		
		//str1 和 str2的连接
	}

}
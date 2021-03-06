package exJava;
//enjoy the Runnable
//create task:
//print 'a' 1000000;
//print 'b' 1000000;
//print 1~1000000;


public class TaskClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create task;
		System.out.println("Multiply thread");
		PrintChar printchara = new PrintChar('a',1000000);
		PrintChar printcharb = new PrintChar('b',1000000);
		PrintNum printnum = new PrintNum(1000000);
		
		//create threads;
		Thread thread3 = new Thread(printchara);
		Thread thread2 = new Thread(printcharb);
		Thread thread1 = new Thread(printnum);
		
		
		//start threads;
		thread3.start();
		thread2.start();
		thread1.start();
	}

}


class PrintChar implements Runnable{
	private char chartoprint;
	private int times; //the number of print times;
	/**
	 * print the character n times;
	 */
	public PrintChar(char c,int n){
		chartoprint = c;
		times = n;
	}
	
	public void run(){
		for(int i = 0;i < times ; i++){
			System.out.println(chartoprint);
		}
	}
	
	
}


class PrintNum implements Runnable{
	private int num;
	
	public PrintNum(int n){
		num = n;
	}
	
	public void run(){
		for(int i = 1;i <= num ; i++){
			System.out.println(i);
		}
		
	}
	
}



package ex001;

public class ex4_5_3 {
	public static void main(String[] args){
		
		int i = 1;
		double sum = 0;
		//System.out.println(factorial(3));
		while(i<=20){
			i++;			
			sum = sum + 1/factorial(i);
			//System.out.println("factorial()"+(1/factorial(i)));
			System.out.println("sum"+sum);
		}
		System.out.println("sum="+sum);
		
	}
	public static double factorial(int i){
		double temp = 1;
		for(int j = 1;j <= i; j++){
			temp = temp*j;
		}
		return temp;
	}
}

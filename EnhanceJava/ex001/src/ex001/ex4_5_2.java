package ex001;

public class ex4_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assign the number of line of rhombus.
		int K = 107;
		for(int i = 0; i <= (K/2+1); i++){
			//print blank
			for(int j =(((K/2)+1)-i); j > 0 ;j--){
				//System.out.println("((K/2)+1)="+(((K/2)+1)));
				System.out.print(" ");
			}
			//print *
			for(int k = 1;k <= (2*i+1);k++){
				System.out.print("*");		
			}
			System.out.print("\n");
		}
		
		for(int i = 0; i <=(K/2);i++){
			//print blank
			for(int j = 0; j <= i ;j++){
				System.out.print(" ");
			}
			//print *
			for(int k = 0;k<(K-2*i);k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}

}

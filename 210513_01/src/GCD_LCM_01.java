import java.util.Scanner;

public class GCD_LCM_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입려하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입려하세요 : ");
		int num2 = sc.nextInt();
		int big, small;
		int GCM, LCM, remainder;
		
		if(num1 >= num2) {
			big = num1;
			small = num2;
		} 
		else {
			big = num2;
			small = num1;
		} 
		
		remainder = big%small;
		while(remainder!=0) {
			big = small;
			small = remainder;
			remainder = big%small;
		}
	
		GCM = small;
		LCM = num1*num2/GCM;
		
		System.out.println("최대 공약수 : "+GCM);
		System.out.println("최소 공배수 : "+LCM);
		sc.close();

	}

}

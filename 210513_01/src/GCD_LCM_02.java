import java.util.Scanner;

public class GCD_LCM_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
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
		
		while(true) {
			remainder = big%small;
			
			if(big%small == 0) {
				GCM = small;
				LCM = num1*num2/GCM;
				break;
			}
			else {
				big = small;
				small = remainder;
			}	
		}
		
		System.out.println("�ִ� ����� : "+GCM);
		System.out.println("�ּ� ����� : "+LCM);
		sc.close();

	}

}
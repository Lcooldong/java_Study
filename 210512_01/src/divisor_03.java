import java.util.Scanner;

public class divisor_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] prime_array = new int[20];
		int index = 0;
		int cnt;
		int input_number = sc.nextInt();
		
		while(input_number > 1) {
			cnt = 0;
			for (int prime = 2; prime <= input_number; prime++){
				if(input_number % prime == 0) {
					cnt++;
					input_number /= prime;
				}

				if(cnt == 1) {
					prime_array[index] = prime;
					index++;
					break;
				}
			}
		}

		for(int i=0; i < index-1; i++) {
			System.out.print(prime_array[i] + "x");
		}
		System.out.println(prime_array[index-1]);
		
		sc.close();

	}

}
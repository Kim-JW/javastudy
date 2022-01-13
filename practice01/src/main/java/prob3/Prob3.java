package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("종료 하려면 -1 입력하세요");

		do {
			System.out.print("숫자를 입력하세요 : ");
			num = scanner.nextInt();

			if (num % 2 == 0) {
				System.out.println(sumEvenNum(num));
			} else {
				System.out.println(sumOddNum(num));
			}
			System.out.println();
		} while (num != -1);

		scanner.close();
	}

	public static int sumOddNum(int n) {
		int result = 0;

		for (int i = 1; i <= n; i = i + 2) {
			result += i;
		}

		return result;
	}

	public static int sumEvenNum(int n) {
		int result = 0;

		for (int i = 2; i <= n; i = i + 2) {
			result += i;
		}

		return result;
	}
}

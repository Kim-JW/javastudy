package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			String str = scanner.nextLine();
			String[] strArr = str.split(" ");

			String name = strArr[0];
			int price = Integer.parseInt(strArr[1]);
			int cnt = Integer.parseInt(strArr[2]);

			Goods good = new Goods(name, price, cnt);
			goods[i] = good;
		}

		for (int i = 0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].toString());
		}

		// 자원정리
		scanner.close();
	}
}

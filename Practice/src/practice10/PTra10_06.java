package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		final int distance = 300;

		Car[] cars = new Car[3];
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for (int i=0; i<cars.length; i++)
		{
			System.out.println(i+1+"人目の情報を入力します");
			System.out.println("ガソリンと色ををカンマ区切りで入力してください");

			String line = scanner.nextLine();
			String[] array = line.split(",");

			cars[i] = new Car();
			cars[i].color = array[0];
			cars[i].gasoline = Integer.parseInt(array[1]);

		}
		for (int i=0; i<cars.length;i++)
		{
			int sum=0, z=0;

			while(true)
			{
				z++;
				int run = cars[i].run();
				sum += run;
//				System.out.println(sum);
				if (run == -1)
				{
					System.out.println("たどり着きませんでした");
					break;
				}
				if (sum >= distance)
				{
					System.out.println(z+"時間、"+cars[i].gasoline+"残り");
					break;
				}

			}
		}

	}
}

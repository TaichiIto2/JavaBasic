package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください
		int[] num;


		// ★ 変数arrayの配列を5個の領域で確保してください
		num = new int[5];


		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください
		num[0] = 1;
		num[1] = 4;
		num[2] = 7;
		num[3] = 10;
		num[4] = 13;



		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		for (int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}

	}
}

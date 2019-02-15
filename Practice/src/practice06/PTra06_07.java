package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int i=1;i<=5;i++)
		{
			if (i<=5)
			{
				for (int n=5; n-i>=0; n--)
					System.out.print("□");
				System.out.println();
				for(int x=1; x<=i; x++)
					System.out.print("■");
			}
		}
		System.out.println();
		 for (int a=1; a<=4; a++)
		 {
			 for (int x=4; x-a>=0; x--)
				 System.out.print("■");
			 for (int n =1; n<=a; n++)
				 System.out.print("□");
			 System.out.println();
		 }
		

	}
}

/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player>list = new ArrayList<Player>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] array = line.split(",");
				player.setPosition(array[0]);
				player.setName(array[1]);
				player.setCountry(array[2]);
				player.setTeam(array[3]);

				list.add(player);
			}
		}catch (FileNotFoundException e) {
			System.out.println("ないです");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		String gk = "GK";
		String df = "DF";
		String mf = "MF";
		String fw = "FW";
		int g = 0;
		int d = 0;
		int m = 0;
		int f = 0;
		Collections.shuffle(list);
		for (int i=list.size()-1; i>=0; i--)
		{
			if ((list.get(i).getPosition().equals(gk))  && (g<1))
			{
				System.out.println(list.get(i));
				g++;
			}
			if ((list.get(i).getPosition().equals(df)) && (d<4))
			{
				System.out.println(list.get(i));
				d++;
			}
			if ((list.get(i).getPosition().equals(mf)) && (m<4))
			{
				System.out.println(list.get(i));
				m++;
			}
			if ((list.get(i).getPosition().equals(fw)) && (f<2))
			{
				System.out.println(list.get(i));
				f++;
			}

		}

	}

}


package execution;

import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("動物名：体重：速度を入力してください。");

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] nums = str.split(",");
		//配列の中身の個数がiより大きい場合ループする

		for (int i = 0; i < nums.length; i++) {
			//i列のi番目をコロンで区切る
			String[] num = nums[i].split(":");
			String animalName = num[0];
			//String型から適した型に変換
			double bodyWeight = Double.parseDouble(num[1]);
			int speed = Integer.parseInt(num[2]);

			String scientificName = null;
			// null チェック
			if (scientificName == null) {
				// number が null ならとりあえず空文字列を入れておっく
				scientificName = "";
			}

			//swith文を使って、学名をかく。
			switch (animalName) {
			case "ライオン":
				scientificName = "パンテラ レオ";
				break;
				
			case "ゾウ":
				scientificName = "ロキソドンタ・サイクロティス";
				break;
				
			case "パンダ":
				scientificName = "アイルロポダ・メラノレウカ";
				break;
				
			case "チンパンジー":
				scientificName = "パン・トゥログロディテス";
				break;
				
			case "シマウマ":
				scientificName = "チャップマンシマウマ";
				break;
				
			case "インコ":
				scientificName = "不明";
				break;
				
			}

			System.out.println("動物名：" + animalName);
			System.out.println("体長：" + bodyWeight + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName);
			System.out.println("");

			scanner.close();
		}
	}
}

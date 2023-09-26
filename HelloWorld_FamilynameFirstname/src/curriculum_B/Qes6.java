package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	   /*
		* 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください													
		* ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可													
		* ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください													
		* ・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 									
		* ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字													
		* ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません												
		* ・入力された値は「、」区切りで指定してください												
		* ・そのほかの値が入力された場合下記を出力されるようにしてください												
		*	『受け取った値』は指定の商品ではありません											
		* ・残り台数は0〜11までのランダムな値が出力されるようにしてください													
	    */
		// scanner起動
		Scanner scanner = new Scanner(System.in);
		// 変数に代入
		String data = scanner.nextLine();
		// 入力された値に区切りを入れる
		String Appliances[] = data.split("、");
		// ランダムに数字を出す
		Random random = new Random();

		// それぞれの要素を取り出す、ループを行う、判定を行う
		for (String appliances : Appliances) {
			int numAppliances = random.nextInt(11);

			switch (appliances) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + numAppliances + "台です");
				System.out.println("");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + numAppliances + "台です");
				System.out.println("");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + numAppliances + "台です");
				System.out.println("");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + numAppliances + "台です");
				System.out.println("");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + numAppliances + "台です");
				System.out.println("");
				break;
			case "テレビ":
			case "ディスプレイ":
				String tv = "テレビ";
				System.out.println(
						tv.equals(appliances) ? "テレビの残り台数は" + numAppliances + "台です"
								: "ディスプレイの残り台数は" + (11 - numAppliances) + "台です");
				System.out.println("");

				break;
			default:
				System.out.println("『"+data+"』"+"は指定の商品ではありません");
				System.out.println("");
				break;
			}
			scanner.close();
		}

	}

}

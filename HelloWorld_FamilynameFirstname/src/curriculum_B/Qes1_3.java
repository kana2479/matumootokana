
package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 	  	 	 	 	 	 	 	 	 
		 *	ログイン時の入力チェックシステムを下記条件で作成してください	 	 	 	 	 	 	 	 	 
		 *	・コンソールにユーザー名を入力できるようにしてください	 	 	 	 	 	 	 	 	 
		 *	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください	 	 	 	 	 
		 *	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください 	 	 	 
		 *	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		System.out.println("ユーザー名を入力してください");

		if (userName.length() > 10) {
			userName = "";
			System.out.println("名前を10文字以内にしてください");
		} else if (userName == null || userName.length() < 0) {
			System.out.println("名前を入力してください");
			userName = "";
		} else {
			System.out.println("ユーザー名を登録しました");
		}
		System.out.println(userName);

		//ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください	 	 	 	 	 	 	 

		if (userName.matches("^[a-zA-Z0-9]+$")) {
			System.out.println(userName);
		} else {
			System.out.println("半角英数字のみで名前を入力してください");
		}

		/*
		 * じゃんけんのシステムを下記の条件で作成してください
		　　 ＊・「0はグー、1：チョキ、2：パー」とすること
		　＊・じゃんけんに勝つまでループすること
		　＊・一回ごとに自分の手と相手の手を下記の通り出力してください	
		 ＊ ユーザー名「name」を登録しました
		 ＊ nameの手は「パー」
		 ＊ 相手の手は「グー」
		 */
		int janken_num = 0;
		int win_num = 0;

		System.out.println("0〜2の整数で入力してくだしい。0：グー、１：チョキ、2：パー");
		while (true) {

			janken_num++;
			int input = Integer.parseInt(scanner.nextLine());
			System.out.println(userName + "の手は" + input);
			Random rand = new Random();
			int computer_num = rand.nextInt(3) + 0;
			System.out.println("相手の手は" + computer_num);
			if ((input == 0 && computer_num == 1)
					|| ((input == 1 && computer_num == 2) || ((input == 2 && computer_num == 0)))) {
				System.out.println("やるやん。		\n"
						+ "次は俺にリベンジさせて		");

				System.out.println("勝つまでにかかった合計回数は" + janken_num + "回です");
				win_num += 1;
				break;
			} else if (input == 0 && computer_num == 2) {
				System.out.println("俺の勝ち！			\n"
						+ "負けは次につながるチャンスです！			\n"
						+ "ネバーギブアップ！");

			} else if (input == 1 && computer_num == 0) {
				System.out.println("俺の勝ち！			\n"
						+ "たかがじゃんけん、そう思ってないですか？			\n"
						+ "それやったら次も、俺が勝ちますよ			");

			} else if (input == 2 && computer_num == 1) {
				System.out.println("俺の勝ち！				\n"
						+ "なんで負けたか、明日まで考えといてください。				\n"
						+ "そしたら何かが見えてくるはずです				");

			} else if ((input == 0 && computer_num == 0)
					|| ((input == 1 && computer_num == 1) || ((input == 2 && computer_num == 2)))) {
				System.out.println("DRAW あいこ もう一回しましょう！");

				if (win_num == 1) {
					break;
				}

			}
		}
	}
}

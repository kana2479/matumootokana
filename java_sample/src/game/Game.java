package game;

import java.util.Random;
import java.util.Scanner;

import selfintroduction.Subclass;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力してください。");
		/*------名前入力-------*/
		Scanner scanner = new Scanner(System.in);
		
		/*------ランダムな数字------*/
		Random rand = new Random();
		
		/*------インスタンス化-------*/
		Subclass words = new Subclass(scanner.next(), rand.nextInt(1001), rand.nextInt(1001), rand.nextInt(1001),
				rand.nextInt(1001), rand.nextInt(1001));
		
		
		System.out.println("こんにちは" + "「" + words.name + "」" + "さん");
		System.out.println("ステータス");
		System.out.println("HP：" + words.hp);
		System.out.println("MP：" + words.mp);
		System.out.println("攻撃力：" + words.offensivePower);
		System.out.println("素早さ：" + words.agility);
		System.out.println("防御力：" + words.defensePower);
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
		
		scanner.close();

	}

}

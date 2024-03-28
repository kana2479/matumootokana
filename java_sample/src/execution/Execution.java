package execution;

import java.util.Scanner;

import animals.Chimpanze;
import animals.Elephant;
import animals.Lion;
import animals.Panda;
import animals.Parakeet;
import animals.Zebra;

public class Execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("動物名：体重：速度を入力してください。");
		//Scanner data = new Scanner(System.in).useDelimiter(":");
		Scanner scanner = new Scanner(System.in).useDelimiter(":|,");
		
				Lion a = new Lion(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "パンテラ レオ");
				System.out.println("動物名：" + a.animalName);
				System.out.println("体長：" + a.bodyWeight + "m");
				System.out.println("速度：" + a.speed + "km/h");
				System.out.println("学名：" + a.lion);
				System.out.println("");
				
				Elephant b = new Elephant(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "ロキソドンタ・サイクロティス");
				System.out.println("動物名：" + b.animalName);
				System.out.println("体長：" + b.bodyWeight + "m");
				System.out.println("速度：" + b.speed + "km/h");
				System.out.println("学名：" + b.elephant);
				System.out.println("");

				Panda c = new Panda(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "アイルロポダ・メラノレウカ");
				System.out.println("動物名：" + c.animalName);
				System.out.println("体長：" + c.bodyWeight + "m");
				System.out.println("速度：" + c.speed + "km/h");
				System.out.println("学名：" + c.panda);
				System.out.println("");

				Chimpanze d = new Chimpanze(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "パン・トゥログロディテス");
				System.out.println("動物名：" + d.animalName);
				System.out.println("体長：" + d.bodyWeight + "m");
				System.out.println("速度：" + d.speed + "km/h");
				System.out.println("学名：" + d.chimpanze);
				System.out.println("");

				Zebra e = new Zebra(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "チャップマンシマウマ");
				System.out.println("動物名：" + e.animalName);
				System.out.println("体長：" + e.bodyWeight + "m");
				System.out.println("速度：" + e.speed + "km/h");
				System.out.println("学名：" + e.zebra);
				System.out.println("");
				
				//Scanner data = new Scanner(System.in).useDelimiter(":");
				Parakeet f = new Parakeet(scanner.next(), scanner.nextDouble(), scanner.nextInt(), "不明");
				System.out.println("動物名：" + f.animalName);
				System.out.println("体長：" + f.bodyWeight + "m");
				System.out.println("速度：" + f.speed + "km/h");
				System.out.println("学名：" + f.parakeet);
				System.out.println("");
        //}
				scanner.close();
				
	}
}

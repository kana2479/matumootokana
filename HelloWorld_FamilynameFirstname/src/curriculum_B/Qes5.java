package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// for文を使用して下記の通りに出力してください

		for (int j = 1; j < 10; j++) {
			System.out.println();
			for (int i = 1; i < 21; i++) {
				int num = i * j;
				if (num < 10)
					System.out.print(
							"0" + "0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + "0" + "0" + num + " "
									+ "||" + " ");
				else if (i == 20 && num < 99)
					System.out.print("0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + "0" + num + " ");
				else if (i == 20)
					System.out.print("0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + num + " ");
				else if (i > 9 && num < 100)
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + "0" + num + " " + "||" + " ");
				else if (num > 99)
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + num + " " + "||" + " ");
				else
					System.out.print(
							"0" + "0" + i + " " + "*" + " " + "0" + "0" + j + " " + "=" + " " + "0" + num + " " + "||"
									+ " ");

			}
			System.out.println();

		}
	}


}

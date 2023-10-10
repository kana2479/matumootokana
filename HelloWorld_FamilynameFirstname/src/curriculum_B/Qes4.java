package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// for文を使用して下記の通りに出力してください

		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				int num = i * j;
				if (num < 10 && j < 9)
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + j + " " + "=" + " " + "0" + num + " " + "||" + " ");
				else if (num < 10 && j == 9)
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + j + " " + "=" + " " + "0" + num + " ");
				else if (j == 9)
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + j + " " + "=" + " " + num + " ");
				else
					System.out.print(
							"0" + i + " " + "*" + " " + "0" + j + " " + "=" + " " + num + " " + "||" + " ");

			}
			System.out.println();
		}
	}

}

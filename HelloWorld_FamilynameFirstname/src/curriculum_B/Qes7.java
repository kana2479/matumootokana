package curriculum_B;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください											
		・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください											
		・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください											
		・このプログラムの実行は必ず1回以上行われるようにしてください											
		・出力例を参考にプログラミングを作成してください											
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		
		int n = scanner.nextInt();
		int[]student  = new int[n];

		String[] subjects = {"英語", "数学","理科","社会"};
		int[][] scores = new int[n][subjects.length];

		for (int i = 0; i < scores.length; i++) {
		for (int j = 0; j < scores[i].length; j++) {
		System.out.print((i + 1) + "人目の生徒の" + subjects[j] + "の点数:");
		scores[i][j] = scanner.nextInt();
		}
		System.out.println();
		}
		scanner.close();

		// 生徒毎の平均点
		for (int i = 0; i < scores.length; i++) {
		int sum = 0;
		for (int score : scores[i]) {
		sum += score;
		}
		double Ave=((double)sum / scores[i].length);
		System.out.println((i + 1) + "人目の平均点は" +(String.format("%.2f",Ave)+"点です。"));
		}
		
		System.out.println();
		
		// 科目毎の平均点
	
		for (int i = 0; i < subjects.length; i++) {
			int sum = 0;
		for (int j = 0; j < scores.length; j++) {
		sum += scores[j][i];
		}
		double Ave1=((double)sum / scores.length);
		System.out.println(subjects[i] + "の平均点:"+(String.format("%.2f",Ave1)+"点です"));
		
		}
		//全体の平均点
		int sum1=0;
		for (int i = 0; i < scores.length; i++) {	
		for (int score : scores[i]) {
		sum1 += score;
			}
		
		}
		double Ave2=((double)sum1 / (n*4));
		System.out.println( "全体の平均点:" +(String.format("%.2f",Ave2) +"点です"));
		}
		}
		



         
			



	


		

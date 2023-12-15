package curriculum_New_question;
import java.util.Random;
public class Curriculum_New_1_18 {

	private static final int average = 0;

	// TODO 自動生成されたメソッド・スタブ
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	static String data(String mozi, int num) {
		String result = mozi + "" + num;
		return result;

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	static int square(int value, int value2) {
		int result = value * value2;
		return result;
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	static double square(double d, double d2) {
		double result = d + d2;
		return result;
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	static int[] getArray(int c) {
		Random rand = new Random();
		int[] arrays = new int[c];
		for (int i = 0; i < c; i++) {
			// 1から100のうちの乱数を作成し配列に格納
			int b = rand.nextInt(100) + 1;
			 arrays[i]=b;
			 System.out.println( arrays[i]);
			 
		}
		
		return arrays;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	 static double calcAverage(int[] d) {

		int sum = 0;
		double average;
		for (int i = 0; i < d.length; i++) {
			sum = sum + d[i];
			
		}
		average = (double)sum /d.length;
		System.out.println();
		System.out.println(average);
		System.out.println();
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
     static boolean isZero(double h) {
    	 if(h>50){
    		    return true;
    		}else{
    		    return false;
    		}
     }
     
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		//Q1
		String mozi = "Hello JavaSE";
		int num = 11;
		System.out.println(mozi + " " + num);
		System.out.println();
		//Q2
		int multiplication = square(2, 3);
		System.out.println(multiplication);
		System.out.println();
		//Q3
		int[] a = { 10, 20, 30 };
		displayArray(a);
		System.out.println();
		//Q4
		double addition = square(10.7, 2.4);
		System.out.println(addition);
		System.out.println();

		//Q5
		
		int[] b = getArray(5);
		
		//Q6
		calcAverage(b);
		
		//Q7
		
		isZero(average);
        if(isZero(average)) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}

}

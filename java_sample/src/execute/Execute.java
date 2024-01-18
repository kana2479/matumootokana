	package execute;
import java.text.SimpleDateFormat;
import java.util.Date;

import process.Process;
public class Execute {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Process words = new Process("こんにちは！", "日本", "寿司", "うまい", "和食","今の現在日時は");


		System.out.println(words.hello + "ここは" + words.japan + "です！");
		System.out.println("この" + words.susi + "は" + words.delicious);
		System.out.println(words.susi + "は" + words.food + "です");
		
		Date nowDate = new Date();
		SimpleDateFormat sdf1
        = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formatNowDate = sdf1.format(nowDate);
        System.out.println(words.time+formatNowDate+"です");
	}
	

}

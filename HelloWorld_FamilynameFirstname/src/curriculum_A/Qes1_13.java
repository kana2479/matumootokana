package curriculum_A;

public class Qes1_13 {	
	public static void main(String[] args) {
		
		
		 byte num1 = 0; //バイト型の初期値
	     short num2 = 0; //短整数型の初期値
	     int num3 = 0; //整数型の初期値
	     long num4 = 0L; //長整数型の初期値
		 float num5 = 0.0f; //単精度浮動小数点数型の初期値
		 double num6 = 0.0d; //倍精度浮動小数点数の初期値
		 char num7 = '\u0000'; //文字型の初期値
		 String num8 = null; //文字列の初期値
	     boolean num9 = false; //ブーリアン型の初期値
			
		   //値を代入
	     num1 = 10;
		 num2 = 100;
		 num3 = 1000;  
		 num4 = 10000L;
		 num5 = 9.5f;
		 num6 = 10.5d;
		 num7 = 'a';
		 num8 = "ハロー";
		 num9 = true;
		 
		 //コンソールに出力する
		 System.out.println(num1+num2+num3+num4);
		 System.out.println(num1+num1);
		 System.out.println(num7+num8+num9);
		 System.out.println(num1+num2+num3+num4+num5+num6);
		 System.out.println(num1*num2*num3*num4);
		 System.out.println(num6/100);
		 System.out.println(num1-num2);
		 System.out.println("");//空白
		 
		 /*↓「ハローJAVA2023」と表示される
		 String num="20";
	 	　int num0=23;
	 	　System.out.println("ハローJAVA"+(num+num0));
	 	　　↑これを「ハローJAVA43」と表示させる
	 	*/	 
		String num="20";	 	 	 
	 	int num0 =Integer.parseInt(num)+23;	
	 	System.out.println("ハローJAVA"+(num0));	 
	 	System.out.println("");
	 	
	 	//『山田太郎 18歳 170.5cm 62.2kg 寿司』をコンソールに出力する
	 	String str1 ="山田太郎";//名前
	 	int str2 =18;//年齢
	 	double str3 =170.5;//身長
	 	double str4 =62.2;//体重
	 	String str5 ="寿司";//好きな食べ物
	 		
	 	System.out.println("初めまして"+str1+"です");
	 	System.out.println("年齢は"+str2+"歳です");
	 	System.out.println("身長は"+str3+"cmです");
	 	System.out.println("体重は"+str4+"kgです");
	 	System.out.println("好きな食べ物は"+str5+"です");
	 	System.out.println("");
	 	
	 	//BMIを出す。ただし計算は数値を直書きせず、全て変数を使ってすること
	 	 // BMIの計算
	 	double height =170.5;
	 	double weight =62.2;
	 	double bmi =weight/((height /100)*(height /100));
	 	
	 	System.out.println("BMIは"+bmi+"です");
	 	System.out.println("");
	 	
	 	//変数に再代入してコンソール出力する
	 	str1 = "鈴木一郎";//名前
	 	str2 =24;//年齢
	 	str3 =168.5;//身長
	 	str4 =64.2;//体重
	 	str5 ="オムライス";//好きな食べ物
	 	double bmi2 =22.6;//BMI
	 	
	 	System.out.println("はじめまして"+str1+"です");
	 	System.out.println("年齢は"+str2+"歳です");
	 	System.out.println("身長は"+str3+"cmです");
	 	System.out.println("体重は"+str4+"kgです");
	 	System.out.println("好きな食べ物は"+str5+"です");
	 	System.out.println("BMIは"+bmi2+"です");
	 	System.out.println("");
	 	
	 	//数値を和算で自己代入
	 	str2 = str2 + 24  ; //年齢
	 	str3 =str3 +168.5;//身長
	 	str4 =str4 +64.2;//体重
	 	bmi2 =11.31 ;//BMI
	 	System.out.println("はじめまして"+str1+"です");
	 	System.out.println("年齢は"+str2+"歳です");
	 	System.out.println("身長は"+str3+"cmです");
	 	System.out.println("体重は"+str4+"kgです");
	 	System.out.println("好きな食べ物は"+str5+"です");
	 	System.out.println("BMIは"+bmi2+"です");
	 	System.out.println("");
	 	
	 	//年齢が25歳以上ならtrue
	 	String age ="";
	 	age = str2 > 25 ? "false" :"true";
        System.out.println(age);
        System.out.println("");
        
        //(年齢、身長、体重）を文字列型に型変換する
        String a =String.valueOf(str2);
        String h =String.valueOf(str3);
        String w =String.valueOf(str4);
        System.out.println(a+h+w);
        System.out.println("");
        
        //(年齢と身長）を整数型に変換する
        int a2=Integer.parseInt(a);
        int h2 =(int)Double.parseDouble(h);
        System.out.println(a2);
        System.out.println(h2);
        System.out.println("");
        
        //【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
        String ah ="";
        ah = a2== 25|| h2 > 160 ? "true" :"false";
        System.out.println(ah);
	}
	

}

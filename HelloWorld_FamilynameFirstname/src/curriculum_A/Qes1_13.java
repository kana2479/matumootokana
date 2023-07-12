package curriculum_A;

public class Qes1_13 {	
	public static void main(String[] args) {
		
		
		 byte byteNum = 0; 
		 short shortNum = 0;
	     int intNum = 0; 
	     long longNum = 0L; 
		 float floatNum = 0.0f; 
		 double doubleNum = 0.0d; 
		 char charNum = '\u0000'; 
		 String stringNum = null; 
	     boolean booleaNnum = false; 
			
		   //値を代入
	     byteNum = 10;
	     shortNum = 100;
	     intNum = 1000;  
	     longNum = 10000L;
	     floatNum = 9.5f;
	     doubleNum = 10.5d;
	     charNum = 'a';
	     stringNum = "ハロー";
		 booleaNnum = true;
		 
		 //コンソールに出力する
		 System.out.println(byteNum+shortNum+intNum+longNum);
		 System.out.println(byteNum+byteNum);
		 System.out.println(charNum+stringNum+booleaNnum);
		 System.out.println(byteNum+shortNum+intNum+longNum+floatNum+doubleNum);
		 System.out.println(byteNum*shortNum*intNum*longNum);
		 System.out.println(doubleNum/100);
		 System.out.println(byteNum-shortNum);
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
	 	String name ="山田太郎";//名前
	 	int age =18;//年齢
	 	double height =170.5;//身長
	 	double weight =62.2;//体重
	 	String food ="寿司";//好きな食べ物
	 		
	 	System.out.print("初めまして"+name+"です\n");
	 	System.out.print("年齢は"+age+"歳です\n");
	 	System.out.print("身長は"+height+"cmです\n");
	 	System.out.print("体重は"+weight+"kgです\n");
	 	System.out.print("好きな食べ物は"+food+"です\n");
	 	System.out.print("\n");
	 	
	 	//BMIを出す。ただし計算は数値を直書きせず、全て変数を使ってすること
	 	 // BMIの計算
	 	double height1 =170.5;
	 	double weight1 =62.2;
	 	double bmi =weight1/((height1 /100)*(height1 /100));
	 	
	 	System.out.println("BMIは"+bmi+"です");
	 	System.out.println("");
	 	
	 	//変数に再代入してコンソール出力する
	 	name = "鈴木一郎";
	 	age =24;
	 	height =168.5;
	 	weight =64.2;
	 	food="オムライス";
	 	double bmi2 =22.6;
	 	
	 	System.out.print("はじめまして"+name+"です\n");
	 	System.out.print("年齢は"+age+"歳です\n");
	 	System.out.print("身長は"+height+"cmです\n");
	 	System.out.print("体重は"+weight+"kgです\n");
	 	System.out.print("好きな食べ物は"+food+"です\n");
	 	System.out.print("BMIは"+bmi2+"です\n");
	 	System.out.print("\n");
	 	
	 	//数値を和算で自己代入
	 	age = age + 24  ; 
	 	height =height +168.5;
	 	weight =weight +64.2;
	 	bmi2 =11.31 ;
	 	System.out.print("はじめまして"+name+"です\n");
	 	System.out.print("年齢は"+age+"歳です\n");
	 	System.out.print("身長は"+height+"cmです\n");
	 	System.out.print("体重は"+weight+"kgです\n");
	 	System.out.print("好きな食べ物は"+food+"です\n");
	 	System.out.print("BMIは"+bmi2+"です\n");
	 	System.out.print("\n");
	 	
	 	//年齢が25歳以上ならtrue
	 	String age1 ="";
	 	age1 = age > 25 ? "false" :"true";
        System.out.println(age1);
        System.out.println("");
        
        //(年齢、身長、体重）を文字列型に型変換する
        age =24;
	 	height =168.5;
	 	weight =64.2;
        String age2 =String.valueOf(age);
        String height2 =String.valueOf(height);
        String weight2 =String.valueOf(weight);
        System.out.println(age2+height2+weight2);
        System.out.println("");
        
        //(年齢と身長）を整数型に変換する
        int age3=Integer.parseInt(age2);
        int height3 =(int)Double.parseDouble(height2);
        System.out.println(age3);
        System.out.println(height3);
        System.out.println("");
        
        //【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
        String ageHeight ="";
        ageHeight = age3== 25|| height3 > 160 ? "true" :"false";
        System.out.println(ageHeight);
	}
	

}

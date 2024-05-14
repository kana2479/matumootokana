package japan;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import prefectures.Prefectures;
public class Japan {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("数字を入力してください");
		// scanner起動
		Scanner scanner = new Scanner(System.in);
		// 変数に代入
		String str = scanner.nextLine();
		// 入力された値に区切りを入れる
		String nums[] = str.split(",");
		System.out.println("昇順・降順を入力してください。");
		
		String st = scanner.nextLine();
		//Integer[]  ary = new Integer[11];
		/*-------------インスタンス化--------------*/
		Prefectures hokkaidou=new Prefectures("北海道","札幌市",83424.0);
		Prefectures aomori=new Prefectures("青森県","青森市",9646.0);
		Prefectures iwate=new Prefectures("岩手県","盛岡市",15275.0);
		Prefectures miyagi=new Prefectures("宮城県","仙台市",7282.0);
		Prefectures akita=new Prefectures("秋田県","秋田市",11638.0);
		Prefectures yamagata=new Prefectures("山形県","山形市",9323.0);
		Prefectures fukusima=new Prefectures("福島県","福島市",13784.0);
		Prefectures ibaraki =new Prefectures("茨城県","水戸市",6097.0);
		Prefectures totigi=new Prefectures("栃木県","宇都宮市",6408.0);
		Prefectures gunnma =new Prefectures("群馬県","前橋市",6362.0);
		Prefectures saitama=new Prefectures("埼玉県","さいたま市",3798.0);
								
		
		//for (int i = 0; i < nums.length; i++) {
		
		switch(st) {
		case "昇順":
			Arrays.sort(nums); // 昇順
			
			 break;
		case"降順":
			Arrays.sort(nums, Collections.reverseOrder()); // 降順
			
			break;
		}
			
		/*------------- それぞれの要素を取り出す、ループを行う、判定を行う-------------------*/
		for (String appliances : nums) {
			int number = Integer.parseInt(appliances);
			switch (number) {
			case 0:
			System.out.println("都道府県名： "+hokkaidou.todoufukennmei);
			System.out.println("県庁所在地："+hokkaidou.kenntyousyozaitimei);
			System.out.println("面積："+hokkaidou. mennseki+"km2");
			System.out.println("");
			break;
			
			case 1:
				System.out.println("都道府県名："+aomori.todoufukennmei);
				System.out.println("県庁所在地："+aomori.kenntyousyozaitimei);
				System.out.println("面積："+aomori.mennseki+"km2");
				System.out.println("");
				break;
			case 2:
				System.out.println("都道府県名："+iwate.todoufukennmei);
			System.out.println("県庁所在地："+iwate.kenntyousyozaitimei);
			System.out.println("面積："+iwate.mennseki+"km2");
			System.out.println("");
			break;
			case 3:
				System.out.println("都道府県名："+miyagi.todoufukennmei);
			System.out.println("県庁所在地："+miyagi.kenntyousyozaitimei);
			System.out.println("面積："+miyagi.mennseki+"km2");
			System.out.println("");
			break;
			case 4:
				System.out.println("都道府県名："+ akita.todoufukennmei);
			System.out.println("県庁所在地："+ akita.kenntyousyozaitimei);
			System.out.println("面積："+ akita.mennseki+"km2");
			System.out.println("");
			break;
			case 5:
				System.out.println("都道府県名："+yamagata.todoufukennmei);
			System.out.println("県庁所在地："+yamagata.kenntyousyozaitimei);
			System.out.println("面積："+yamagata.mennseki+"km2");
			System.out.println("");
			break;
			case 6:
				System.out.println("都道府県名："+fukusima.todoufukennmei);
			System.out.println("県庁所在地："+fukusima.kenntyousyozaitimei);
			System.out.println("面積："+fukusima.mennseki+"km2");
			System.out.println("");
			break;
			case 7:
				System.out.println("都道府県名："+ibaraki.todoufukennmei);
			System.out.println("県庁所在地："+ibaraki.kenntyousyozaitimei);
			System.out.println("面積："+ibaraki.mennseki+"km2");
			System.out.println("");
			break;
			case 8:
				System.out.println("都道府県名："+totigi.todoufukennmei);
			System.out.println("県庁所在地："+totigi.kenntyousyozaitimei);
			System.out.println("面積："+totigi.mennseki+"km2");
			System.out.println("");
			break;
			case 9:
				System.out.println("都道府県名："+gunnma.todoufukennmei);
			System.out.println("県庁所在地："+gunnma.kenntyousyozaitimei);
			System.out.println("面積："+gunnma.mennseki+"km2");
			System.out.println("");
			break;
			case 10:
				System.out.println("都道府県名：" +saitama.todoufukennmei);
			System.out.println("県庁所在地："+ saitama.kenntyousyozaitimei);
			System.out.println("面積："+ saitama.mennseki+"km2");
			System.out.println("");
			break;
			}
		}
		
		scanner.close();
	}
}

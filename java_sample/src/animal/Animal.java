package animal;

import lion.Lion;

public class Animal {
	public static void main(String[] args) {
		/*-----インスタンス化--------*/
		Lion profile = new Lion();

		/*-----set〇〇で値をセットする----*/
		profile.setAnimalame("ライオン");
		profile.setBodyLength(2.1);
		profile.setSpeed(80);
		/*------get〇〇で値を取得する--------*/
		System.out.println("動物名：" + profile.getAnimalame());
		System.out.println("体長：" + profile.getBodyLength() + "m");
		System.out.println("速度：" + profile.getSpeed() + "km/h");
	}
}
package selfintroductionProgram;

public class Person {
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	public double bmi;
	public static int count=0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName,int age, double height, double weight) {
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;

	}
	Person(String firstName,String lastName,int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}
	
	public String fullName(){
		return this.firstName + this.lastName;
		}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//public void print() {
	//	System.out.println("名前は" + this.firstName + "です");
	//	System.out.println("年は" + this.age + "です");
		

	//}
//public static void printCount() {
	//	System.out.println("合計"+Person.count+"人です");
	//}
	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner()+"が購入しました");
	}
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner()+"が購入しました");
	}
	

}

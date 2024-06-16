package selfintroductionProgram;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		//person1.print();
		
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		//person2.print();
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println();
		person1.print();
		System.out.println();
		person2.print();
		System.out.println();
		System.out.println("合計"+Person.count+"人です");
		
		Person.printCount();

	}

}
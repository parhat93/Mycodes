package Day7;

public class PeopleWithAction {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "mike";
		p1.job = "computer developer";
		p1.age = 45;
		p1.gender = 'M';

		p1.run(5 + 5);
		p1.swim(25);

		p1.bike(6);
		System.out.println("===============================");
		p1.say("Good moring");
		p1.play("soccer");
		p1.play("vedio games");

		Person p2 = new Person();
		p2.name = "osman";
		p2.job = "computer diginer";
		p2.age = 33;
		p2.gender = 'M';
		System.out.println("--------------------");
		p2.run(3);
		p2.swim(20);
		p2.bike(4);

	}

}

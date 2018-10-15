public class GreeterTest {
	public static void main(String[] args){
		Greeter g = new Greeter();

		String greeting = g.greet();
		String greetingWithName = g.greet("Michael", "Choi");
		System.out.println(greetingWithName);
	}
}
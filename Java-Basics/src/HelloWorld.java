
public class HelloWorld {
	String name;
	int age;
	
	public HelloWorld(String newName,int newAge) {
		name = newName;
		age = newAge;
	}
	
	public HelloWorld() {
	}
	
	public static void main(String[] args) {
		
		HelloWorld sreehari = new HelloWorld("Sreehari K",22);
		sreehari.printData();
		
		HelloWorld kmctce = new HelloWorld("KMCT CE",12);
		kmctce.printData();
		
		HelloWorld someRandomGuy = new HelloWorld();
		someRandomGuy.name = "I'm a random guy";
		someRandomGuy.age = 18;
		someRandomGuy.printData();
		
	}
	
	private void printData() {
		System.out.println(name);
		System.out.println(age);
	}
	
}


public class AddNumbers {
	int num1;
	int num2;
	public AddNumbers(int newNum1,int newNum2) {
		num1 = newNum1;
		num2 = newNum2;
	}
	public static void main(String[] args) {
		AddNumbers operation1 = new AddNumbers(20, 20);
		int returnedResult = operation1.addTwoNums();
		System.out.println(returnedResult);
		
	}
	
	private int addTwoNums() {
		int result = num1+num2;
		return result;
	}
}

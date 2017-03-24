import java.util.Scanner;

public class PrintCalc {
	Scanner scan=new Scanner(System.in);
	public void printCalculator()
	{
		Calculator obj=new Calculator();
		int userInput1=scan.nextInt();
		int userInput2=scan.nextInt();
		System.out.println("Addition :"+obj.add(userInput1,userInput2));
		System.out.println("Subtraction :"+obj.sub(userInput1,userInput2));
		System.out.println("Multiplication :"+obj.mul(userInput1,userInput2));
		System.out.println("Division :"+obj.div(userInput1,userInput2));
	}
}

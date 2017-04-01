import java.util.Scanner;

class InputWithScanner{
   public static void main(String[] args){

   	int Input1;
	float Input2;
	String Input3;

	Scanner getInput = new Scanner(System.in);

	System.out.print("Enter a string: ");
	Input3 = getInput.nextLine();
	System.out.println("You entered string: "+Input3+"\n");

	System.out.print("Enter an integer: ");
	Input1 = getInput.nextInt();
	System.out.println("You entered integer: "+Input1+"\n");
 
	System.out.print("Enter a float: ");
	Input2 = getInput.nextFloat();
	System.out.println("You entered float: "+Input2+"\n");
   }
}

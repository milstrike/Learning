import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bebek{
	public static void main(String[] args){
		int A;
		int B;
		int C;
		int D;
		String input = "";
		BufferedReader inputData = new BufferedReader(new 
InputStreamReader(System.in));
		try{
		  input = inputData.readLine();
		}
		catch(IOException e){
		}

		String[] masukan = input.split(" ");
		A = Integer.parseInt(masukan[0]);
		B = Integer.parseInt(masukan[1]);
		C = A/B;
		D = A%B;

		System.out.println("masing-masing " + C);
		System.out.println("bersisa " + D);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class segitiga{
	public static void main(String[] args){
		double A;
		double B;
		double C;
		String input = "";
		BufferedReader inputData = new BufferedReader(new 
InputStreamReader(System.in));
		try{
		  input = inputData.readLine();
		}
		catch(IOException e){
		}

		String[] masukan = input.split(" ");
		A = Double.parseDouble(masukan[0]);
		B = Double.parseDouble(masukan[1]);
		C = A*B/2;

		System.out.printf("%.2f",C);
	}
}


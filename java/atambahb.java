import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class atambahb{
	public static void main(String[] args){
	
		BufferedReader dataInput = new BufferedReader(new 
InputStreamReader(System.in));
		String masukan = "";
		try{
		masukan = dataInput.readLine();
		}
		catch(IOException e){
		
		}

		String[] number = masukan.split(" ");
		int A = Integer.parseInt(number[0]);
		int B = Integer.parseInt(number[1]);
		int C = A + B;
		System.out.println(C);
	
	}
}

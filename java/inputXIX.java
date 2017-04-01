import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class inputXIX{
	public static void main(String[] args){
		BufferedReader dataInput = new BufferedReader(new 
InputStreamReader(System.in));
		String masukan = "";
		try{
			masukan = dataInput.readLine();
		}
		catch(IOException e){
			System.out.println("Masukan Salah");
		}
		System.out.println(masukan);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class olimpiade{
    
    public static void main(String[] args){
        int totalSeleksi = 0;
        String kodePeserta = "";
        int tempTotalPeserta = 0;
        int tempJumlahLolos = 0;
        int[][] seleksi = new int[10][10];
        String[][] nilaiPeserta = new String[10][10];
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input5 = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            totalSeleksi = Integer.parseInt(input1.readLine());
        }
        catch(IOException e){
            
        }
        
        if(totalSeleksi < 0 || totalSeleksi > 8 ){
            System.exit(1);
        }
        
        
        for(int i=0; i<totalSeleksi; i++){
            try{
                String masukanX = input3.readLine();
                String alpha[] = masukanX.split(" ");
                tempTotalPeserta = Integer.parseInt(alpha[0]);
                tempJumlahLolos = Integer.parseInt(alpha[1]);
            }
            catch(IOException e){
                
            }
        
            if(tempTotalPeserta < 1 || tempTotalPeserta >80){
                System.exit(1);
            }
            else{
                seleksi[i][0] = tempTotalPeserta;
                if(tempJumlahLolos < 0 || tempJumlahLolos > tempTotalPeserta){
                    System.exit(1);
                }
                else{
                    seleksi[i][1] = tempJumlahLolos;
                }
            }
            
            try{
                kodePeserta = input2.readLine();
            }
                catch(IOException e){
            
            }
            
            for(int a=0; a<seleksi[i][0]; a++){
                String PesertaDanNilai = "";
                try{
                   PesertaDanNilai = input3.readLine();
                }
                catch(IOException e){
            
                }
                
                String[] ExtractNilaiPeserta = PesertaDanNilai.split(" ");
                for(int b=0; b<3; b++){
                    nilaiPeserta[a][b] = ExtractNilaiPeserta[b];
                }
                
               
            }
            
            
        }
        
        
        
        
        System.out.println(totalSeleksi);
        System.out.println(kodePeserta);
    }
}
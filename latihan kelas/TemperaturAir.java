import java.io.*;
public class TemperaturAir{
 public static void main(String[]args)throws IOException
  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    
    //variabel
    
    int msk=0;
    
    //proses
    
      System.out.println("Masukkan Temperatur Air");
      msk = Integer.parseInt(br.readLine());
        if(msk<0)
      {
        System.out.println("Benda Padat");
      }if(msk>=0){
        System.out.println("Benda Cair");
      }if(msk>=100)
        System.out.println("Benda Gas");
    
 }
 
}

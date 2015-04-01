import java.io.*;
public class TebakGambarAngka{
 public static void main(String[]args)throws a0IOException
  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
 int bilrandom = (int)(Math.random()+0.5);
 int tebak;
System.out.println("Masukkan Tebakan Anda");
tebak = Integer.parseInt(br.readLine());
  if(bilrandom==1)
      System.out.println("Gambar");
   else
    System.out.println("Coin");
  System.out.println("Anda menebak = "+tebak);
  System.out.println("Komputer menebak = "+bilrandom); 
  if(tebak==bilrandom)
  System.out.println("Maka anda Menang");
  else
  System.out.println("Anda Kalah");
}
}
 

import java.io.*;
public class Tugas1 {
  public static void main (String[]args) throws IOException
  {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
    //Variabel
      int jumlahbarang;
      int bonus;
      
    //Output 
    System.out.println("=============TOKO TSHIRT==============");
    System.out.println("Promo beli 2 gratis 1");
    System.out.println("");
    System.out.println("Jumlah Barang yang dibeli = ");
    jumlahbarang = Integer.parseInt(br.readLine());
    
    //Proses
    bonus=(jumlahbarang/2);
    
    System.out.println("Pembelian Barang Anda = "+jumlahbarang);
    System.out.println("Bonus = "+bonus);
    System.out.println("Total Barang Anda"+(jumlahbarang+bonus));
    System.out.println("=========================================");
  } 
}
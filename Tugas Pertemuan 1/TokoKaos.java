import java.io.*;
public class TokoKaos {
  public static void main (String[]args) throws IOException
  {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
//Variabel
      int jumlahbarang;
      int bonus;
      int kaos=25000;
      int a;
      
//Output 
    System.out.println("=============TOKO TSHIRT==============");
    System.out.println("Promo beli 2 gratis 1");
    System.out.println("");
    System.out.println("Jumlah Kaos = ");
    jumlahbarang = Integer.parseInt(br.readLine());
     
//Proses
    a=(jumlahbarang * kaos);
    bonus=(jumlahbarang/2);
    
    System.out.println("Jumlah Barang Anda = "+ jumlahbarang);
    System.out.println("Total Harus Dibayar : Rp."+a+",-");
    System.out.println("Bonus "+bonus);
    System.out.println("=========================================");
  } 
}
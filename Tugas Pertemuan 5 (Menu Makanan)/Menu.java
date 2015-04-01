import java.io.*;
class Menu{
  public static void main (String[]args) throws IOException
  {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
  String[]mkn={"Soto Ayam","Gado-gado","Nasi Goreng","NasiCampur","MieAyam"};
  int[]hrg={1000,8000,1000,2000,100};
  String nota="";
  int total=0;
  int subtotal=0;
  

  System.out.println("Daftar Menu Makanan");
  System.out.println("Makanan Harga");
  System.out.println();
  
  for(int i=0; i<mkn.length;i++){
   System.out.println((i+1) + "." + mkn[i]+"\t\t"+hrg[i]);
  }
  
  
  String jawab="y";
  while(jawab.equalsIgnoreCase("y")){
    
    
    System.out.println();
    System.out.print("Masukkan pilihan : ");
    int pilih=Integer.parseInt(br.readLine());
    
    
    
    System.out.println();
    System.out.println(mkn[pilih-1]);
    System.out.println();
    
    
    System.out.print("Masukkan Jumlah Pesanan : ");
    int a=Integer.parseInt(br.readLine());
    System.out.println("Harga : "+hrg[pilih-1]);
    subtotal=hrg[pilih-1]*a;
    System.out.println("Bayar : "+subtotal);
    System.out.println();
    
    nota+=mkn[pilih-1]+"\t\t"+a+" Porsi\t\t"+hrg[pilih-1]+"\t\t"+subtotal+"\n-----------------------------------------------------------------\n";
    total+=subtotal;
    System.out.println("Pesan lagi?[y/n]");
    jawab=br.readLine(); 
    System.out.println();
  }
  
       
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Nota 1");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("MENU JUMLAH HARGA SUBTOTAL");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(nota);
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Total bayar : "+total);
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Terima Kasih");
  
 }
}
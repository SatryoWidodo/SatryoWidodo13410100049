import java.io.*;
public class Alattulis {
  public static void main (String[]args) throws Exception{
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    String []hariHari ={"Senin","Selasa","Rabu","Kamis","Jumat","sabtu","minggu"};
        String []barangBarang ={"Buku Tulis","Kertas Lipat","Bolpoint","Pensil"};
        int[] hargaBarang={4500,3500,2500,1700};
        int[] totalDalamHari=new int[7];
        int[] totalDalamMinggu=new int[7];
        int[] subtotal=new int[4];
        int[] total=new int[7];
        int[] barang=new int[7];
        int[] laris=new int[4];
        int[] terjual=new int[7];
        int totalSemuaBarang =0;
        
        int barangDalamMinggu =0;
        int  barangMinimal=100000;
        int barangMaksimal =0;
        int maksimal =0;
        String laku;
        String kurangLaku;
        String hari;
        
        for(int i=0;i<7;i++){
        
          System.out.println();
          System.out.println("*"+"Barang-Barang Yang Terjual Pada Hari"+ hariHari[i]+"*");
          System.out.println();
          
          for(int j=0; j<4; j++){
          
            System.out.print("Jumlah"+barangBarang[j]+"Yang Terjual:");
            terjual[j] = Integer.parseInt(br.readLine());
            laris[j]+=terjual [j];
            sUBTotal[j]=hargaBarang[j]*terjual[j];
            total[i]=total[i]+sUBTotal[j];
            totalDalamMinggu= totalDalamMinggu + sUBTotal[j];
            barang[i]= barang[i]+ terjual[j];
            TotalSemuaBarang=TotalSemuaBarang+Terjual[j];
          }
          TotalDalamSehari[i]=Total[i];
          Terjual[i]=Barang[i];
          System.out.println();
          System.out.println("---------------------------------------------");
          System.out.println(">>Total Pendapatan DiHari"+HariHari[i]+"sejumlah   :Rp."+TotalDalamHari[i]+",-");
          System.out.println();
          System.out.println(">>Total Barang Yang Di Beli"+HariHari[i]+"sejumlah   :Rp."+Terjual[i]+"Barang");
           System.out.println(">>--------------------------------------------"); 
                               
                             
        }
     Maksimal=0;
     Maksimal=TotalDalamHari[0];
     Hari=HariHari[0];
     
     for(int k=0;k<HAriHari.length;k++){
     
     if(TotalDalamHari[k]>Maksimal)
     {
     Maksimal=TotalDalamHari[k];
     Hari=HariHari[k];
     }
    }
     barangMaksimal=0;
     barangMinimal=100000;
     Laku=barangBarang[0];
     kurangLaku=barangBarang[0];
     
     for(int m=0;m<4;m++){
       if(laris[m]>barangMaksimal){
     
     barangMaksimal=laris[m];
       kurangLaku=barangBarang[m];
       }

     if(laris[m]<barangMinimal);{
     barangMinimal=laris[m];
     kurangLaku=barangBarang[m];
     }
   }
       System.out.println();
       System.out.println();
          System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
          System.out.println(">>Total Pendapatan DiHari"+HariHari[i]+"sejumlah   :Rp."+TotalDalamHari[i]+",-");
          System.out.println();
          System.out.println(">>Total Barang Yang Di Beli"+HariHari[i]+"sejumlah   :Rp."+Terjual[i]+"Barang");
           System.out.println(">>--------------------------------------------"); 
       }
}
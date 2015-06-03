import java.io.*;
import java.util.*;
public class CariMhsbaru{

public static void main(String []str) throws IOException
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  int bilangan1=0;
  int bilangan2=0;
  int bilangan3=0;
  int bilangan4=0;
  
  
  String [][]dbList = {
  {"08410100375","Purwanto",},
    {"10410100146","Noer Hidayat"},
    {"10410100162","Sandy Perdana"},
    {"11410100142","Himawan Pradipta Utama"},
    {"12410100049","Sujatmiko Hadinugroho"},
    {"12410100070","Denny Kusuma"},
    {"12410100088","Mochammad Afri Fitriansyah"},
    {"12410100131","Pradita Satria Prima"},
    {"12410100159","Fajriyan Nurli"},
    {"12410100160","Hazvi Fahlevi"},
    {"13410100006","Nico Stephanus Kuncoro"},
    {"13410100007","Ramdhani Kurniawan"},
    {"13410100048","Alanvianto Mukti Tamtomo"},
    {"13410100049","Satryo Widodo"},
    {"13410100058","Khamim Ahsanu Amala"},
    {"13410100060","Arfiansyah Agma"},
    {"13410100061","Candra Dwi Prasetya"},
    {"13410100069","Mohammad Rangga Nurcahyo"},
    {"13410100083","Raymond Andreas Soebijantoro"},
    {"13410100153","Dwiki Rizwan Nizar"},
    {"13410100155","Anggy Pranindya Sudarmadji"},
    {"13410100157","Wahyu Alfiyanda"},
    {"13410100180","Rayana Suryatama"},
    {"13410100190","Bryan Asril Zani"},
    {"13410100192","Eko Amiyantho"},
    {"13410100200","Kristin Lebdaningrum"},
    {"13410100206","RB. Nuriana Alim Putra"},
    {"13410100216","Sabdo Wicaksono Putra"},
    {"14410100170","Rizky Akbar"},
    {"14410100172","Abdul Haris"},
    {"14410100173","Ach Nofal Kurniawan"},
    {"14410100174","Andri Anggara"},
    {"14410100175","Auda Rizqi Aulany"},
    {"14410100176","Noppy Wahyono Suwoto"},
    {"14410100177","Arya Teja"},
    {"14410100178","Nuari Imas Masita"},
    {"14410100179","Afif Lutfian Fahmi Chudlori"},
    {"14410100181","Novita Perdani"},
    {"14410100182",  "Dheta Amelya Kurniawendy"}
  };
 
 Scanner sc = new Scanner (System.in);
  boolean Selesai = false;
  int pilihan = 0;
    
  
  do{
   
   System.out.println ("");
   System.out.println (" PENCARIAN DATA MAHASISWA ");
   System.out.println ("");
   System.out.println ("1. CARI DATA MAHASISWA BY NIM");
   System.out.println ("2. FILTER DATA MAHASISWA BY NAMA");
   System.out.println ("3. FILTER DATA MAHASISWA BERDASARKAN ANGKATAN");
   System.out.println ("4. DELETE DATA MAHASISWA BY NIM");
   System.out.println ("5. UPDATE DATA MAHASISWA");
   System.out.println ("6. ADD DATA MAHASISWA");
   System.out.println ("7. VIEW DATA MAHASISWA");
   System.out.println ("8. EXIT");
   System.out.print ("Pilih pilihan [1-8] : ");
   pilihan = sc.nextInt();
   switch(pilihan){
       case 1:
         
          System.out.print("Input Nim : ");
      String nim=br.readLine();

      for(int k =0;k<dbList.length;k++){
        if(dbList[k][0].equals(nim)){
      System.out.println();
          System.out.println(dbList[k][0]+"  "+ dbList[k][1] );
          System.out.println();
          System.out.println("Pada data ke "+k);
          bilangan2=1;
            }
        else{ }
      }
      if(bilangan2==1){
      }
      else{
        System.out.println("data tidak ada ");
       }
         
       break;
 
 
     case 2:
       
       
       break;
       
       
     case 3:
       
       break;
       
       
     case 4:
       //data inputan baru
       System.out.println("masukkan data :");
       String cari = br.readLine();
       for(int k =0;k<dbList.length;k++)
       System.out.println(dbList[k][0]+" "+dbList[k][1]+" ");
       System.out.println("");
       System.out.println("");
       System.out.println("data setelah dihapus");
       
       for(int i=0;i< dbList.length;i++){
         if(cari == dbList[i][0]){
          dbList[i][0]="";
         }
         else {
          System.out.print(dbList[i]+"");}
       }break;
       
       
     case 5:
       //update data
       
       break;
       
       
     case 6:
       //mnambah data
       break;
      
       
     case 7:
     
       
           for(int k =0;k<dbList.length;k++){
       System.out.println(dbList[k][0]+" "+dbList[k][1]+" ");
      bilangan1=0;
     }
  
       break;
       
   }
   }while(pilihan<8);
}
}



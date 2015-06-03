import java.io.*;
import java.util.*;
public class CariMhs{

public static void main(String []strd) throws IOException
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  int bil1=0;
  int bil2=0;
  int bil3=0;
  int bil4=0;
  
  String [][]dataList = {
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
  do{
   System.out.println ("");
   System.out.println (" PENCARIAN DATA MAHASISWA ");
   System.out.println ("");
   System.out.println ("1. CARI BERDASARKAN NIM");
   System.out.println ("2. CARI BERDASARKAN NAMA");
   System.out.println ("3. FILTER BERDASARKAN NIM");
   System.out.println ("4. FILTER BERDASARKAN NAMA");
   System.out.println ("5. EXIT");
   System.out.print ("Pilih pilihan [1-5] : ");
   int piluser = sc.nextInt();
   
   if (piluser == 1)
    {
      System.out.print("Input Nim : ");
      String nim=br.readLine();

      for(int k =0;k<dataList.length;k++){
        if(dataList[k][0].equals(nim)){
      System.out.println();
          System.out.println(dataList[k][0]+"  "+ dataList[k][1] );
          System.out.println();
          System.out.println("Pada data ke "+k);
          bil2=1;
        }
        else{ }
      }
      if(bil2==1){
      }
      else{
        System.out.println("data tidak ada ");
       }

    }
 
  if (piluser == 2)
    {
      System.out.print("Input Nama : ");
      String nama=br.readLine();

      for(int k =0;k<dataList.length;k++){
        if(dataList[k][1].equals(nama)){
      System.out.println();
          System.out.println(dataList[k][0]+"  "+ dataList[k][1] );
          System.out.println();
          System.out.println("Pada data ke "+k);
          bil2=1;
        }
        else{ }
      }
      if(bil2==1){
      }
      else{
        System.out.println("data tidak ada ");
       }

    }
    
   if (piluser == 3)
    {
      System.out.print("Input Nim : ");
      String nim=br.readLine();

      for(int k =0;k<dataList.length;k++){
        if(dataList[k][0].contains(nim)){
  System.out.println();
          System.out.println(dataList[k][0]+"  "+dataList[k][1]);
    System.out.println();
          System.out.println("Pada data ke "+k);
          bil2=1;
        }
        else{ }
      }
      if(bil2==1){ }
      else{
        System.out.println("data tidak ada ");
       }
    }

if (piluser == 4)
    {
      System.out.print("Input Nama : ");
      String nama=br.readLine();

      for(int k =0;k<dataList.length;k++){
        if(dataList[k][1].contains(nama)){
  System.out.println();
          System.out.println(dataList[k][0]+"  "+dataList[k][1]);
    System.out.println();
          System.out.println("Pada data ke "+k);
          bil2=1;
        }
        else{ }
      }
      if(bil2==1){ }
      else{
        System.out.println("data tidak ada ");
       }
    } 
    
   if (piluser == 5)
    {
     Selesai = true;
     
    } 
   
    
   
    } while (!Selesai);
    
 }

 
}


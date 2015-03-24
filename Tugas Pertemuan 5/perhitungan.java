import java.io.*;
public class perhitungan {
 public static void main (String[]args) throws IOException
 {
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
  
  System.out.print("Masukkan jumlah soal anda: ");
  
  int soal=Integer.parseInt(br.readLine());
  
  int angka1;
  int a=0;
  int angka2;
  int hasil;
  int nilai=0;
  int salah=0;
  int benar=0;
  
   System.out.println ("");
   System.out.println ("SOAL !!");
   System.out.println ("");
   
  while(a<soal){
   
   angka1=(int)(Math.random()*20);
   angka2=(int)(Math.random()*10);
   
   System.out.print ((a+1)+" . "+ angka1 +" + " + angka2 + " = " ); 
   hasil=Integer.parseInt(br.readLine());
   
   int jawaban=angka1+angka2;
    if(jawaban==hasil){
     nilai+=10;
     benar+=1;
    }else{
     salah+=1;
     nilai-=5;
    }
   a++;
  }
  System.out.println ("");
  System.out.println("Nilai Anda : " + nilai);
  System.out.println("Jawaban benar adalah: " + benar);
  System.out.println("Jawaban salah adalah: " + salah);
 }
}
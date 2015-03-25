import java.io.*;
public class hitungan {
 public static void main (String[]args) throws IOException
 {
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
  
  System.out.print("Masukkan jumlah soal anda: ");
  
  int soal=Integer.parseInt(br.readLine());
  int a=0;
  int angka1;
  int angka2;
  int hsl;
  int salah=0;
  int benar=0;
  
   System.out.println ("");
   System.out.println ("SOAL !!");
   System.out.println ("");
   
  while(a<soal){
   
   angka1=(int)(Math.random()*20);
   angka2=(int)(Math.random()*10);
   
   System.out.print ((a+1)+" . "+ angka1 +" + " + angka2 + " = " ); 
   hsl=Integer.parseInt(br.readLine());
   
   int jawaban=angka1+angka2;
    if(jawaban==hsl){
     benar+=1;
    }else{
     salah+=1;
    }
   a++;
  }
  System.out.println ("");
  System.out.println("Jawaban benar adalah: " + benar);
  System.out.println("Jawaban salah adalah: " + salah);
 }
}
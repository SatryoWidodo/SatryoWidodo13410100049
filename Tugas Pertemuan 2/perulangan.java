import java.io.*;
class perulangan{
	public static void main (String[]args)throws IOException
 {
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

 int sum=0;
 int count=0;
 double avg=0;
 int maks=0;
 int min=0;
 int input;
 
 System.out.print("Masukkan Jumlah Data : ");
 int jumlah= Integer.parseInt(br.readLine());
 
  while (count<jumlah){
	  System.out.println("===========================");
	   System.out.print("Masukkan Data ke  " + (count + 1) + " : ");
	   input=Integer.parseInt(br.readLine());
	   
	   sum+=input;
	   if (input>maks)
		maks=input;
	   
	   if (min==0)
		min=input;
		
	   if (input<min)
		min=input;
	   count++;
	  }
	  
  avg=sum/(double)jumlah;
 System.out.println("Jumlah Data = "+sum);
 System.out.println("Rata Data = "+avg);
 System.out.println("Maksimal = "+maks);
 System.out.println("Minimal = "+min);
 }
}
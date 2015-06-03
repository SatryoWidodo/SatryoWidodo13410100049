import java.io.*;
public class dikalikalikan{
 public static void main (String[]args) throws IOException
 {
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

 int bil1;
 int bil2;
   System.out.println("----------------------------------");
   System.out.println("      Dikalikan 2 Bilangan    ");
   System.out.println("---------------------------------");
   System.out.print("Bilangan 1 : ");
   bil1=Integer.parseInt(br.readLine());
   System.out.print("Bilangan 2 : ");
   bil2=Integer.parseInt(br.readLine());
   
   System.out.println("--------------------------");
   System.out.print("Hasil : " + bil1 + " x " + bil2 + " = ");
   System.out.print(bil2);
  for (int a=bil1-1; a>0; a--) 
  {
   if (a>0){
     System.out.print("+" + bil2);
     }
  }
  System.out.print(" = " + bil1*bil2);
  
 }
}
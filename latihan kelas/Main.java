import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  
Scanner sc = new Scanner(System.in);
int [] x = new int[10];
for(int j=0; j<10; j++)
{
System.out.print("Masukkan data = ");
x[j] = sc.nextInt();
} 
for (int i=0; i<=9; i++)
System.out.println(x[i]);
int cari;
System.out.print("Cari data = ");
cari = sc.nextInt();
int k;
for(k=0; k<10; k++)
if (cari == x[k])
{
System.out.println("Data ditemukan");
break; 
}
if (k == 10) 
System.out.println("Data tidak ada");
}
}
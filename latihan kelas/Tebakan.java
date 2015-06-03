import java.util.Scanner;
public class Tebakan{
public static void main(String[] args){
   
int angkatebak=(int)(Math.random()*10);
int a,b,c;

    System.out.println("    Mari Bermain Tebak Angka 0 - 10");

System.out.println("---------------------------------------------------");
System.out.println("Kesempatan Pertama");
System.out.printf("Masukkan angka nya = ");
Scanner angka=new Scanner (System.in);
a = angka.nextInt();

    if(a==angkatebak){
    System.out.println("Selamat! Angka yang anda masukkan Benar");
   
    }else if(a>angkatebak){
    System.out.println("Maaf, angka yang anda masukkan terlalu Besar, kesempatan tinggal 2 kali. Pikirkan kembali angka yg anda masukkan");}

    else if(a    System.out.println("Maaf, angka yang anda masukkan terlalu Kecil, kesempatan tinggal 2 kali. Pikirkan kembali angka yg anda masukkan");

    System.out.println("---------------------------------------------------");
    System.out.println("Kesempatan Kedua");
    System.out.printf("Masukkan angka nya = ");
    Scanner angka1=new Scanner (System.in);
    b = angka1.nextInt();
   
    if(b==angkatebak){
    System.out.println("Selamat! Angka yang anda masukkan Benar ");
       

    }else if(b>angkatebak){
    System.out.println("Maaf, angka yang anda masukkan terlalu Besar, kesempatan tinggal 1 kali.PIKIRKAN BAIK-BAIK!"); }

    else if(b    System.out.println("Maaf, angka yang anda masukkan terlalu Kecil, kesempatan tinggal 1 kali.PIKIRKAN BAIK-BAIK!");

    System.out.println("---------------------------------------------------");
    System.out.println("Kesempatan Terakhir");
    System.out.printf("Masukkan Angka nya = ");
    Scanner angka2=new Scanner (System.in);
    c = angka2.nextInt();

    if(c==angkatebak){
    System.out.println("Selamat! Angka yang anda masukkan Benar");

    }else if(c>angkatebak){
    System.out.println("Maaf ... Anda Belum Beruntung! Angka yang Anda masukkan terlalu BESAR. Kesempatan Habis. SILAHKAN COBA LAGI! Semoga Berhasil :D");}

    else if(c    System.out.println("Maaf ... Anda Belum Beruntung! Angka yang Anda masukkan terlalu KECIL. Kesempatan Habis. SILAHKAN COBA LAGI! Semoga Berhasil :D");}
   
    if(c    System.out.println("---------------------------------------------------");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH ANGKA" +angkatebak);}
    System.out.println("---------------------------------------------------");

    if(c>angkatebak){
    System.out.println("---------------------------------------------------");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH ANGKA" +angkatebak);}
    System.out.println("---------------------------------------------------");
    }
}


System.out.println("---------------------------------------------------");
System.out.println("            SELESAI");
System.out.println("---------------------------------------------------");
 }
}
import java.util.*;
import java.io.*;
public class ViewDbMhs {
  public static void main() {
    System.out.println("Program View Data Mahasiswa \nKelas Q1-142") ;
    System.out.println("1. Cari Data Mahasiswa by NIM") ;
    System.out.println("2. View Data Mahasiswa Filter by Nama") ;
    System.out.println("3. View Data Mahasiswa Filter by by Angkatan (Nim)") ;
    System.out.println("4. Delete Data Mahasiswa") ;
    System.out.println("5. Update Data Mahasiswa") ;
    System.out.println("6. Add Data Mahasiswa") ;
    System.out.println("7. View All Data Mahasiswa") ;
    System.out.println("8. Exit") ;
    System.out.print("Pilih menu (1-8) : ") ;
  }
  public static void viewAll(){
    for(int i=0;i<DataMhs01.dMhs.length;i++){
      System.out.println((i+1)+"\t" + DataMhs01.dMhs[i][0] + "\t" + DataMhs01.dMhs[i][1]);
    }
  }
  public static void cariDataByNim(Scanner sc){
    System.out.println("Pencarian Data Mahasiswa by Nim") ;
    System.out.println("Masukkan NIM yang dicari : ") ;
    String nim = sc.next() ;
    String str=DataMhs01.cariByNim(nim) ;
    if(str.equals(""))
      System.out.println("Nim "+ nim+ " Tidak Ditemukan Dalam Array") ;
    else
      System.out.println(str) ;
  }
  public static void filterByNama(Scanner sc) {
    System.out.println("Filter Data Mahasiswa by Nama") ;
    System.out.println("Masukkan nama yang dicari : ") ;
    String nama = sc.next() ;
    DataMhs01.filterByNama(nama) ;
  }
  public static void filterPerAngkatan(Scanner sc) {
    System.out.println("Filter Data Mahasiswa per Angkatan") ;
    System.out.println("Masukkan angkatan yang dicari : ") ;
    String angkatan = sc.next() ;
    DataMhs01.filterPerAngkatan(angkatan) ;
  }
  public static void DeleteData(Scanner sc) {
    System.out.println("Delete Data Mahasiswa") ;
    System.out.println("Masukkan NIM Mahasiswa yang dihapus : ") ;
    String nim = sc.next() ;
    DataMhs01.DeleteData(nim) ;
  }
  public static void UpdateData(Scanner sc) {
    System.out.println("Update Data Mahasiswa") ;
    System.out.println("Masukkan NIM Mahasiswa yang dicari : ") ;
    String nim = sc.next() ;
    System.out.println("Masukkan Nama Mahasiswa yang baru : ") ;
    String nama = sc.next() ;
    DataMhs01.UpdateData(nim, nama) ;
  }
  public static void InsertData(Scanner sc) {
    System.out.println("Insert Data Mahasiswa") ;
    System.out.println("Masukkan NIM Mahasiswa : ") ;
    String nim = sc.next() ;
    System.out.println("Masukkan Nama Mahasiswa : ") ;
    String nama = sc.next() ;
    DataMhs01.InsertData(nim, nama) ;
  }
  public static void main(String []argv) {
    Scanner sc = new Scanner(System.in) ;
    boolean selesai = false;
     do {
    main();
    int pil= sc.nextInt();
       switch(pil){
      case 1:cariDataByNim(sc); selesai = false; break;
      case 2:filterByNama(sc);break ;
      case 3:filterPerAngkatan(sc);break;
      case 4:DeleteData(sc);break;
      case 5:UpdateData(sc);break;
      case 6:InsertData(sc);break;
      case 7:viewAll();break;
      }
      }while(!selesai) ;
    }
}

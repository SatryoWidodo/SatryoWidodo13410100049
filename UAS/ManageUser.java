import java.util.*;
public class ManageUser
{
 public static Vector<UserLogin> dataUser = new Vector<UserLogin>();
 public static Scanner Scn = new Scanner(System.in);
 
 public static void TambahUser() // Tambah User
 {
  System.out.println();
  System.out.println("=======================================");
  System.out.println("     Tambah User     ");
  System.out.print("Masukkan Username Baru \t : ");
  String userName = Scn.next();
  System.out.print("Masukkan Password \t : ");
  String password = Scn.next();
  System.out.print("Masukkan Tipe \t : ");
  String type = Scn.next();
  UserLogin userBaru = new UserLogin(userName, password, type);
  dataUser.add(userBaru);
 }
 
 public static void LihatUser() // Lihat Data User
 {
  System.out.println();
  System.out.println("No. Username\tPassword\tBagian");
  System.out.println("===========================================");
  int i = 0;
  for(UserLogin vUser : dataUser)
  {
   System.out.println((i+1) + ".  " + vUser.getUserName() + "\t" + vUser.getPassword() + "\t\t" + vUser.getType());
   i++;
  }
  System.out.println("==========================================");
 }
 
 public static void HapusUser() // Hapus Data User
 {
  int idx = -1;
  int i = 0;
  System.out.println();
  System.out.println("=======================================");
  System.out.println("     Hapus User     ");
  System.out.print("Masukkan User yang akan dihapus \t: ");
  String userName = Scn.next();
  do
  {
   if(dataUser.elementAt(i).getUserName().equals(userName))
   {
    idx = i;
   }
   i++;
  }while((i < dataUser.size() && (idx == -1)));
  
  if(idx == -1)
  {
   System.out.println(userName + " Tidak ditemukan");
  }
  else
  {
   System.out.print("Apakah User " + userName + " akan dihapus (Y / T) : ");
   String Hapus = Scn.next();
   if(Hapus.equalsIgnoreCase("Y"))
   {
    dataUser.removeElementAt(idx);
    System.out.println("User " + userName + " Berhasil dihapus");
   }
  }
 }
 
 public static void GantiPass() //Ganti Pass
 {
  int idx = -1;
  int i = 0;
  System.out.println();
  System.out.println("=======================================");
  System.out.println("     Ganti Password User     ");
  System.out.print("Masukkan Use yang akan diubah Passwordnya \t: ");
  String usrName = Scn.next();
  do
  {
   if(dataUser.elementAt(i).getUserName().equals(usrName))
   {
    idx = i;
   }
   i++;
  }while((i < dataUser.size() && (idx == -1)));
  
  if(idx == -1)
  {
   System.out.println(usrName + " Tidak ditemukan");
  }
  else
  {
   System.out.print("Masukkan Password Baru : ");
   String newPass = Scn.next();
   dataUser.elementAt(idx).setPassword(newPass);
   System.out.println("Password " + usrName + " Berhasil diganti");
  }
 }
 
 public static void MenuAdmin() //menu admin
 {
  //boolean halamanAdmin = false;
  int Pilihan = 0;
  do
  {
   System.out.println();
   System.out.println("===================================");
   System.out.println("     Menu Admin    ");
   System.out.println(" Toko Sepeda      ");
   System.out.println("===================================");
   System.out.println("1. User");
   System.out.println("2. Buah");
   System.out.println("3. Laporan Penjualan");
   System.out.println("4. Cari Data Sepeda");
   System.out.println("5. Keluar");
   System.out.print("Masukkan Pilihan Anda (1-5): ");
   Pilihan = Scn.nextInt();
   switch(Pilihan)
   {
    case 1 : User();
    break;
    case 2 : ManageBuah.Sepeda();
    break;
    case 3 : ManageBuah.reportPenjualan();
    break;
     case 4 : ManageSepeda.Pencariandata();
   }
  }while(Pilihan < 5);
 }
 
 public static void MenuKasir() //menu kasir
 {
  int Pilihan = 0;
  do
  {
   System.out.println();
   System.out.println("====================================");
   System.out.println("     Menu Kasir    ");
   System.out.println(" Toko Sepeda");
   System.out.println("====================================");
   System.out.println("1. Penjualan");
   System.out.println("2. Lihat Data Sepeda");
   System.out.println("3. Laporan Penjualan");
   System.out.println("4. Omset Penjualan");
   System.out.println("5. Keluar");
   System.out.print("Masukkan Pilihan Anda (1-5) : ");
   Pilihan = Scn.nextInt();
   switch(Pilihan)
   {
    case 1 : ManageSepeda.penjualan();
    break;
    case 2 : ManageSepeda.LihatSepeda();
    break;
    case 3 : ManageSepeda.reportPenjualan();
    break;
     case 4 : ManageSepeda.reportomset();
     break;
   }
  }while(Pilihan < 5);
  
 }
 
 public static void User() //user
 {
  int Pilihan = 0;
  do
  {
   System.out.println();
   System.out.println("===============================");
   System.out.println("     Menu Admin    ");
   System.out.println(" Toko Sepeda Jaya");
   System.out.println("===============================");
   System.out.println("1. Tambah User");
   System.out.println("2. Lihat User");
   System.out.println("3. Hapus User");
   System.out.println("4. Ganti Password User");
   System.out.println("5. Keluar");
   System.out.print(" Masukkan Pilihan Anda (1-5) : ");
   Pilihan = Scn.nextInt();
   switch(Pilihan)
   {
    case 1 : TambahUser();
    break;
    case 2 : LihatUser();
    break;
    case 3 : HapusUser();
    break;
    case 4 : GantiPass();
    break;
    default:break;
   }
  }while(Pilihan < 5);
 }
 
 public static void main(String[] args)
 {
  dataUser.add(new UserLogin("Admin","Admin","Admin"));
  dataUser.add(new UserLogin("Kasir","Kasir","Kasir"));
  int Pilihan = 0;
  boolean loginSukses = false;
  if(!cekPass())
  {
   loginSukses = true;
  }
 }
 
 public static boolean cekPass() // Cek User dan Password
 {
  boolean Benar = false;
  //String userLgn = "";
  //String passLgn = "";
  int i = 0;
  do
  {
   
   System.out.println();
   System.out.println("-------Login--------");
   System.out.println();
   System.out.print("Masukkan Username : ");
   String userLgn = Scn.next();
   System.out.print("Masukkan Password : ");
   String passLgn = Scn.next();
   System.out.println();
   int a = 0;
   int idx = -1;
   do
   {
    if(dataUser.elementAt(a).checkPassUser(userLgn, passLgn, "Admin"))
    {
     System.out.println("\"Selamat Anda Login Sebagai Admin\"");
     Benar = true;
     MenuAdmin();
    }
    else if(dataUser.elementAt(a).checkPassUser(userLgn, passLgn, "Kasir"))
    {
     System.out.println("\"Selamat Anda Login Sebagai Kasir\"");
     Benar = true;
     MenuKasir();
    }
    a++;
   }while(a < dataUser.size());
   i++;
   System.out.println("\"Login Salah\"");
  }while((Benar = true) && (i < 5));
  System.out.println("");
  System.out.println("======================================");
  System.out.println("\"Maaf Anda Tidak Berhasil Login\"");
  System.out.println("======================================");
  return Benar;
 }
}
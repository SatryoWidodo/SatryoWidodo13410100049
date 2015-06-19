import java.text.SimpleDateFormat;
import java.util.*;
public class ManageSepeda
{
 public static Vector<dataSepeda> dbSepeda = new Vector<dataSepeda>();
 public static Vector<UserLogin> dataUser = new Vector<UserLogin>();
 public static Scanner Scn = new Scanner(System.in);
 public static Vector idTrans = new Vector();
 public static Vector idSepeda = new Vector();
 public static Vector hargaJual = new Vector();
 public static Vector nmSepeda = new Vector();
 public static Vector <Double>subTotal = new Vector<Double>();
 public static Vector <Double>Total = new Vector<Double>();
 public static Vector kuantiti = new Vector();
 
 public static Vector idsepeda = new Vector();

 
 
 public static void Sepeda() //menu
 {
  dbSepeda.add(new dataSepeda("S001","polygon Xi",90000));
  dbSepeda.add(new dataSepeda("S002","Minion X2",100000));
  dbSepeda.add(new dataSepeda("S003","Family Xi",150000));
  dbSepeda.add(new dataSepeda("S004","Yoyo",200000));
  dbSepeda.add(new dataSepeda("S005","Bunlar",70000));
  int Pilihan = 0;
  do
  {
   System.out.println();
   System.out.println("=========================================");
   System.out.println("     Toko Penjualan Sepeda     ");
   System.out.println("=========================================");
   System.out.println();
   System.out.println("1. Tambah Sepeda");
   System.out.println("2. Lihat Sepeda");
   System.out.println("3. Hapus Sepeda");
   System.out.println("4. Cari Data Sepeda");
   System.out.println("5. Keluar");
   System.out.print("Masukkan Pilihan Anda (1-5): ");
   Pilihan = Scn.nextInt();
   System.out.println();
   switch(Pilihan)
   {
    case 1 : TambahSepeda();
    break;
    case 2 : LihatSepeda();
    break;
    case 3 : HapusSepeda();
    break;
    case 4 : Pencariandata();
    break;
   }
  }while(Pilihan < 4);
 }
  
 public static void TambahSepeda() //tambah buah
 {
  System.out.println();
  System.out.println("=========================================");
  System.out.println("     Tambah Data Sepeda Baru     ");
  int index = 0;
  String ID = "";
  boolean valid = false;
  do
  {
   System.out.print("ID Barang   : ");
   ID = Scn.next();
   index = cariIdxID(ID,dbSepeda);
   if(index != - 1)
   {
    System.out.println("ID " + ID + " Sudah ada dalam Tabel Sepeda");
   }
   else
   {
    valid = true;
   }
  }
  while(!valid);
  System.out.print("Masukkan Nama Sepeda \t : ");
  String nmSepeda = Scn.next();
  System.out.print("Masukkan Harga Sepeda \t : Rp. ");
  int hgSepeda = Scn.nextInt();
  dbSepeda.add(new dataSepeda(ID, nmSepeda, hgSepeda));
 }
 
 public static void LihatSepeda() //lihat buah
 {
  System.out.println();
  System.out.println("==================================================================");
  System.out.println("No. ID\t\tNama\t\tHarga Beli\t\tHarga Jual");
  System.out.println("==================================================================");
  int i = 0;
  for(dataSepeda vSepeda : dbSepeda)
  {
   System.out.println((i+1) + ".  " + vSepeda.getId() + "\t" + vSepeda.getNamaSepeda() + "\t\tRp. " + vSepeda.getHargaSepeda() + "\t\tRp. " + vSepeda.getHargaJual());
   i++;
  }
  System.out.println("==================================================================");
 }
 
 public static void HapusSepeda() //hapus buah
 {
  int idx = -1;
  int i = 0;
  System.out.println();
  System.out.println("=========================================");
  System.out.println("     Hapus Data Sepeda     ");
  System.out.print("Masukkan ID Sepeda yang akan dihapus \t: ");
  String ID = Scn.next();
  do
  {
   if(dbSepeda.elementAt(i).getId().equals(ID))
   {
    idx = i;
   }
   i++;
  }while((i < dbSepeda.size() && (idx == -1)));
  
  if(idx == -1)
  {
   System.out.println(ID + " Tidak ada ditemukan");
  }
  else
  {
   System.out.print("Apakah User " + ID + " akan dihapus (Y / T) : ");
   String Hapus = Scn.next();
   if(Hapus.equalsIgnoreCase("Y"))
   {
    dbSepeda.removeElementAt(idx);
    System.out.println("User " + ID + " Berhasil dihapus");
    System.out.println("=========================================");
   }
  }
 }
 
 public static int cariIdxID(String Key, Vector<dataSepeda> dbSepeda) //cari id
 {
  int idx = -1;
  int i = 0;
  while((i < dbSepeda.size()) && (idx == -1))
  {
   if(dbSepeda.elementAt(i).getId().equals(Key))
   {
    idx = i;
   }
    i++;
  }
  return idx;
 }
 
 public static int cariIdxNama(String Key, Vector<dataSepeda> dbSepeda) //cari id nama
 {
  int idx = -1;
  int i = 0;
  while((i < dbSepeda.size()) && (idx == -1))
  {
   if(dbSepeda.elementAt(i).getNamaSepeda().equals(Key))
   {
    idx = i;
   }
    i++;
  }
  return idx;
 }
 
 public static void penjualan() //transaksi
 {
  int index = 0; 
  String namaSepeda = "";
  String Trans = "";
  String Tambah = "";
  double Ttl = 0;
   System.out.println("");
   System.out.println("=======================================");
   System.out.println("TR#");
   Trans = Scn.next();
   idTrans.add(Trans);
   do
   {
    System.out.print("Nama Barang   : ");
    namaSepeda = Scn.next();
    index = cariIdxNama(namaSepeda,dbSepeda);
    if(index != - 1)
    {
     nmSepeda.add(namaSepeda);
     idSepeda.add(dbSepeda.elementAt(index).getId());
     System.out.print("Masukkan Jumlah : ");
     double Kuantiti = Scn.nextDouble();
     kuantiti.add(Kuantiti);
     double subTtl = (dbSepeda.elementAt(index).getHargaJual() * Kuantiti);
     subTotal.add(subTtl);
     Ttl += subTtl;
     Total.add(Ttl);
     hargaJual.add(dbSepeda.elementAt(index).getHargaJual());
     System.out.print("Apakah Ada Transaksi Lagi ? (Y/N) : ");
     Tambah = Scn.next();
    }
    else
    {
     System.out.println("Nama " + namaSepeda + " Tidak ada dalam Tabel Sepeda");
    }
   }while(Tambah.equalsIgnoreCase("Y"));
 }
 
 public static void reportPenjualan() //hasil transaksi
 {
  double TotalBayar = 0;
  for(int i = 0; i < idTrans.size(); i++)
  {
   System.out.println("");
   System.out.println("========================================================");
   System.out.println("ID TR#" + idTrans.elementAt(i));
   System.out.println("========================================================");
   System.out.println("ID Sepeda\t Sepeda\tHarga Jual\t Kuantiti\t Total");
   System.out.println("========================================================");
   for(int j = 0; j < idSepeda.size(); j++)
   {
    System.out.println(idSepeda.elementAt(j) + "\t" + nmSepeda.elementAt(j) + "\t\t" + hargaJual.elementAt(j) + "\t" + kuantiti.elementAt(j) + "\t" + subTotal.elementAt(j));
    TotalBayar += subTotal.elementAt(j);
   }
   System.out.println("========================================================");
   System.out.println("Total Keseluruhan : Rp. " + TotalBayar);
   System.out.println("========================================================");
  }
 }
 
 
 public static void reportomset()
 {
  double TotalBayar = 0;
  for(int i = 0; i < idTrans.size(); i++)
  {
   for(int j = 0; j < idSepeda.size(); j++)
   {
    //1
     //System.out.println(idSepeda.elementAt(j) + "\t" + nmSepeda.elementAt(j) + "\t\t" + hargaJual.elementAt(j) + "\t" + kuantiti.elementAt(j) + "\t" + subTotal.elementAt(j));
    TotalBayar += subTotal.elementAt(j);
   }
   System.out.println("Total Keseluruhan Omset : Rp. " + TotalBayar);
  }
 }
 
 
 public static void Pencariandata()
 {
   int urutan = 0;
   System.out.print("Masukan ID Barang : ");
   String cari = Scn.next();
   if(dbSepeda.contains(cari)){
   urutan = dbSepeda.indexOf(cari);
   System.out.println("Nama Barang : "+dbSepeda.elementAt(urutan));
   }else{
   System.out.println("Data tidak ditemukan!");
   }
 }
}
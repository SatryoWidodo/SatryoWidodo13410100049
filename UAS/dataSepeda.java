public class dataSepeda
{
 private String idSepeda;
 private String namaSepeda;
 private double jml;
 private double hargaSepeda;
 private int hargaJual;
 private double Keuntungan;
 
 public dataSepeda(String idSepeda, String namaSepeda, double hargaSepeda)
 {
  this.idSepeda = idSepeda;
  this.namaSepeda = namaSepeda;
  this.hargaSepeda = hargaSepeda;
  hargaJual = (int)hargaSepeda + (int)(hargaSepeda * 0.1);
  Keuntungan = hargaJual - hargaSepeda;
 }
 
 public String getId()
 {
  return idSepeda;
 }
 
 public String getNamaSepeda()
 {
  return namaSepeda;
 }
 
 public double getHargaSepeda()
 {
  return hargaSepeda;
 }
 
 public double getJumlah()
 {
  return jml;
 }
 
 public double getHargaJual()
 {
  return hargaJual;
 }
 
 public void setHarga(double hargaSepeda)
 {
  this.hargaSepeda = hargaSepeda;
 }
 
 public static double subTotal(double hargaJual, double jml)
 {
  return hargaJual * jml;
 }
 
 public void setNama(String namaSepeda)
 {
  this.namaSepeda = namaSepeda;
 }
}
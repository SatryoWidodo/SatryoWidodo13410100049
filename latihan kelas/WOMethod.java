public class WOMethod
{
  public static void cetakgaris(int panjanggaris){
    for(int i=0;i<panjanggaris;i++)
      System.out.print("*");
      System.out.println();
  }
  
   public static void cetakgaris(int panjanggaris, String bentuk){
    for(int i=0;i<panjanggaris;i++)
      System.out.print(bentuk);
      System.out.println();
  }
  public static void main(String[]args){
   cetakgaris(20,"@");
     System.out.println("Data Customer");
   cetakgaris(100,"$");
   System.out.println("id/nama/alamat");
  }
}
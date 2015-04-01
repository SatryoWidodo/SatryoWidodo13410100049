public class array01 {
  public static void main (String[]args){
  int []drandom = new int[20];
  int max;
  int min;
  int total=0;
  int rata;
  System.out.println("Mengisi drandom dengan 10 bil random");
   for(int i=0;i<drandom.length; i++)
   {
     drandom[i] = (int)(Math.random()*10.0);
     
   }
System.out.println("Menampilkan hasil bil random dalam array");
min = drandom[0];
max = drandom[0];
for(int j=0;j<drandom.length; j++)
{
  if (min>drandom[j])
    min=drandom[j];
  if (max<drandom[j])
    max=drandom[j];
  total=total+drandom[j];
  System.out.println("Data Random ke ["+j+"]=" + drandom[j]);
}
rata=total/20;
 System.out.println("Nilai Rata = "+rata);
  System.out.println("Nilai Terendah = "+min);
  System.out.println("Nilai Tertinggi = "+max);
  
  
  //Horizontal hargraphy
  for(int i=0;i<drandom.length;i++){
    System.out.print(i+"\t");
    for(int j=0; j<drandom[i];j++);
    {
      System.out.print("*"); 
    }
  }
  
}
}

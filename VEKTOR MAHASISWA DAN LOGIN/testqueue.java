import java.util.*;

public class testqueue{
  
  public static void main(String []args){
    Queue<String> antrian  = new LinkedList<String>();
    antrian.add("Pelanggan 1");
    antrian.add("Pelanggan 2");
    antrian.add("Pelanggan 3");
    antrian.add("Pelanggan 4");
    System.out.println(antrian.peek());
    
    // menampilkan data
    
    System.out.println(antrian.poll());
     System.out.println(antrian.poll());
      System.out.println(antrian.poll());
       System.out.println(antrian.isEmpty());
    
  }
}

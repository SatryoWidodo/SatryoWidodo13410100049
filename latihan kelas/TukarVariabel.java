public class TukarVariabel {
 public static void main(String[] args) {
  int a, b, c;
  a = 5;
  b = 3;
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  c = a;
  a = b;
  b = c;
  System.out.println("a = "+a);
  System.out.println("b = "+b);
  System.out.println("c = "+c);
 }
}

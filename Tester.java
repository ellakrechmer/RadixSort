public class Tester {
  public static void main(String[] args){
    int a=123;
    int b=4786;
    int c=3910;
    Radix r=new Radix();
    System.out.println(r.nth(a, 0));
    System.out.println(r.nth(a, 1));
    System.out.println(r.nth(a, 2));
    System.out.println(r.nth(b, 0));
    System.out.println(r.nth(b, 1));
    System.out.println(r.nth(b, 2));
    System.out.println(r.nth(b, 3));
    System.out.println(r.nth(c, 0));
    System.out.println(r.nth(c, 1));
    System.out.println(r.nth(c, 2));
    System.out.println(r.nth(c, 3));
  }
}

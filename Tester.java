public class Tester {
  public static void main(String[] args){
    // int c=123;
    // int d=4786;
    // int e=3910;
    Radix r=new Radix();
    // System.out.println(r.length(c));
    // System.out.println(r.length(d));
    // System.out.println(r.length(e));
    SortableLinkedList s=new SortableLinkedList();
    s.add(50); s.add(-41); s.add(11); s.add(-12); s.add(42); s.add(32); s.add(32);
    s.add(-23); s.add(34); s.add(-44); s.add(34); s.add(87); s.add(77); s.add(58);
    s.add(365); s.add(8);
    System.out.println(s);
    r.radixSortSimple(s);
    System.out.println(s);
  }
}

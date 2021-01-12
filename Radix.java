public class Radix{
  public static int nth(int n, int col){
    for (int i=0; i<col; i++){
      n=n/10;
    }
    return n%10;
  }
  public static int length(int n){
    int len=1;
    while (n/10!=0){
      n/=10;
      len++;
    }
    return len;
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets) {
    for (int i=0; i<buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }
}

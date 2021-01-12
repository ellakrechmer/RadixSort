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
  public static void radixSortSimple(SortableLinkedList data) {
    int maxlen=0;
    for (int i=0; i<data.size(); i++){
      if (length(data.get(i))>maxlen) maxlen=length(data.get(i));
    }
    SortableLinkedList[] buckets=new SortableLinkedList[10];
    for (int i=0; i<maxlen; i++){
      for (int j=0; j<data.size(); j++) {
        int digit=nth(data.get(j), i);
        for (int a=0; a<10; a++){
          if (digit==a) buckets[a].add(data.get(j));
        }
      }
      merge(data, buckets);
    }
  }
}

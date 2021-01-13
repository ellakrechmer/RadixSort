import java.util.*;
public class Radix{
  public static int nth(int n, int col){
    for (int i=0; i<col; i++){
      n=n/10;
    }
    return Math.abs(n%10);
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
    for (int a=0; a<10; a++) buckets[a]=new SortableLinkedList();
    for (int i=0; i<maxlen; i++){
      while (data.size()!=0) {
        buckets[nth(data.get(0), i)].add(data.get(0));
        data.remove(0);
      }
      merge(data, buckets);
    }
  }
  public static void radixSort(SortableLinkedList data) {
    SortableLinkedList positive= new SortableLinkedList();
    SortableLinkedList negative=new SortableLinkedList();
    while (data.size()!=0){
      if (data.get(0)<0) negative.add(data.get(0));
      else positive.add(data.get(0));
      data.remove(0);
    }
    radixSortSimple(positive);
    radixSortSimple(negative);
    for (int i=negative.size()-1; i>=0; i--){
      data.add(negative.get(i));
    }
    data.extend(positive);
  }
}

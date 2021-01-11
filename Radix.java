public class Radix{
  public static int nth(int n, int col){
    for (int i=0; i<col+1; i++){
      n=n%10;
    }
    return n;
  }
}

public class ArrayOps{
  public static void main(String[] args) {
    int[]A={3,4,5};
    System.out.print(sum(A));
  }
//4a
  public static int sum(int[] arr) {
    int result=0;
    for (int i=0; i<arr.length;i++){
      result+=arr[i];
    }
    return result;
   }
}

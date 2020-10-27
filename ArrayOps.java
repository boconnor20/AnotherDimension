public class ArrayOps{
  public static void main(String[] args) {
    int[]A={3,4};
    System.out.println(sum(A));
    System.out.println(largest(A));
  }
//4a
  public static int sum(int[] arr) {
    int result=0;
    for (int i=0; i<arr.length;i++){
      result+=arr[i];
    }
    return result;
   }
 //4b
   public static  int largest(int[]arr) {
     int max= arr[0];
     for (int i=0; i<arr.length; i++){
       if (arr[i]>max)
          max=arr[i];
     }
     return max;
   }
//4c
  public static int[] sumRows(int[][] matrix){
      int[] arr = new int[matrix.length];
      for(int i = 0; i < arr.length; i ++){
        arr[i] = sum(matrix[i]);
      }
      return arr;
    }
    
}

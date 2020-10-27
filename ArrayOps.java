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
//4d
  public static int[] largestInRows(int[][] matrix){
    int[] arr = new int[matrix.length];
    for(int i = 0; i < arr.length; i ++){
      arr[i] = largest(matrix[i]);
    }
    return arr;
  }
  //4e
  public static int sum(int[][] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i ++){
      for(int j =0; j < arr[i].length; j ++){
        sum += arr[i][j];
      }
    }
    return sum;
  }
  //5a
  public static int[] sumCols(int[][] matrix){
    int length = matrix[0].length;
    int[] result = new int[length];
    for(int i= 0; i < matrix.length; i ++){
      for(int j = 0; j < length;j++){
        result[j] += matrix[i][j];
      }
    }
    return result;
  }
  //5b
  public static boolean isRowMagic(int[][] matrix){
    int[] arr = sumRows(matrix);
    for(int i = 0; i <arr.length; i ++){
      if(arr[i] != arr[0]){
        return false;
      }
    }
    return true;
  }
  //5c
  public static boolean isColMagic(int[][] matrix){
    int[] arr=sumCols(matrix);
    for(int i = 0; i <arr.length; i ++){
      if(arr[i] != arr[0]){
        return false;
      }
    }
    return true;
  }
  //5d
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int[] rowS = sumRows(matrix);
    int[] colS = sumCols(matrix);
    if(rowS[row] != colS[col]){
      return false;
    }
    return true;
  }
}

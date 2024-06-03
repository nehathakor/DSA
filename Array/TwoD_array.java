class TwoD_array {
   public static void main(String[] args) {
  //  Scanner sc  = new Scanner(System.in);
    /*    int[][] arr = new int[3][3];                   //user input

       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = sc.nextInt();
        }
       }
       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
       }  */
  
      /*  int[][] arr = new int[2][3];               //using Array method
       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = sc.nextInt();
        }
       }

       for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]));
       }   */

     /*   int[][] arr = new int[3][4];                     //using for each
       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = sc.nextInt();
        }
       }

       for(int[] a : arr){
        System.out.println(Arrays.toString(a));
       }   */

       int[][] arr = {                           //Jagged array or arrays with no specific number of columns
        {1, 2, 3, 4},
        {5, 6},
        {7, 8, 9}
       };

       for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
       }
   }
}
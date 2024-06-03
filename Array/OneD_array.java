import java.util.*; 

public class OneD_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
       for (int i = 0; i < arr.length; i++) {         //Important loop to be printed for every part
            arr[i] = sc.nextInt();
        }
        /*   for (int i = 0; i < arr.length; i++) {    //using for loop
            System.out.println(arr[i]);
        } */

     /*    for(int num : arr){                           //using for-each
            System.out.println(num);
        } */

        System.out.println(Arrays.toString(arr));    //using Array string
        sc.close();
    }
}



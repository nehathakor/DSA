
import java.util.ArrayList;
import java.util.Collections;

public class Divisiors1 {
    public static void sumOfAllDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if(n%i==0){
                list.add(i);
                if((n/i) != i){
               list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        sumOfAllDivisors(6);
    }
}

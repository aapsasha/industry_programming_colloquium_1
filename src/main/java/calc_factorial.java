import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class calc_factorial {
    private final int factorialNumber;
    ArrayList<Integer> factorialArray;
    calc_factorial(int factorialNumber){
        this.factorialNumber = factorialNumber;
    }
    public ArrayList<Integer> calc(){
        if(factorialArray == null){
            if(factorialNumber == 0){
                return new ArrayList<>();
            }
            Integer[] tmpFactorialArray =  new Integer[factorialNumber];
            tmpFactorialArray[0] = 1;
            try {
                for (int i = 1; i < factorialNumber; ++i) {
                    tmpFactorialArray[i] = tmpFactorialArray[i - 1] * (i + 1);
                }
            }catch(RuntimeException e){
                System.err.println("Слишком большое число!");
                return null;
            }
            factorialArray = new ArrayList<>();
            Collections.addAll(factorialArray, tmpFactorialArray);
        }
        return factorialArray;
    }
}

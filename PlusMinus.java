import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0; i < size; i++) {
            if (arr.get(i) < 0) {
                minus++;
            } else if (arr.get(i) > 0) {
                plus++;
            } else
                zero++;
        }
        DecimalFormat fm = new DecimalFormat("##.#####");
        
        double plusRatio = (double) plus / (double) size;
        System.out.println(fm.format(plusRatio));

        double minusRatio = (double) minus / (double) size;
        System.out.println(fm.format(minusRatio));

        double zeroRatio = (double) zero / (double) size;
        System.out.println(fm.format(zeroRatio));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-4);
        arr.add(-1);
        arr.add(-40);
        arr.add(0);
        arr.add(34);
        arr.add(2);
        arr.add(9);
        plusMinus(arr);

        bufferedReader.close();
    }
}

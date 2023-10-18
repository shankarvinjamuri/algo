import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class HashJava {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 5, 6, 3 };

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {

        HashSet<Integer> hset = new HashSet<>();
        hset.add(10);
        System.out.println(hset.size());

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "100");
        System.out.println(map.get(1));

double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.####");

         df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}

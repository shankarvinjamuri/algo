import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SearchNumberInArray {

    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY arr
     * 2. INTEGER k
     */

    public static String findNumber(List<Integer> arr, int findMe) {

        int size = arr.size();

        for (int i = 0; i < size; i++) {
            if (arr.get(i) == findMe)
                return "YES";
        }
        return "NO";

    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();

        int findFor = Integer.parseInt(input);

        String result = findNumber(arr, findFor);
        System.out.println(result);
    }
}

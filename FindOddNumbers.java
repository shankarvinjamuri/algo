import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindOddNumbers {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER l
     * 2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0)
                result.add(i);
        }
        return result;

    }

    public static void main(String[] args) throws IOException {

        // Enter data using BufferReader
        BufferedReader l_reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String l = l_reader.readLine();

        // Enter data using BufferReader
        BufferedReader r_reader = new BufferedReader(
                new InputStreamReader(System.in));

        String r = r_reader.readLine();

        int left = Integer.parseInt(l);
        int right = Integer.parseInt(r);

        List<Integer> result = oddNumbers(left, right);

        int resultSize = result.size();
        for (int i = 0; i < resultSize; i++) {
            System.out.println(result.get(i));
        }
    }

}
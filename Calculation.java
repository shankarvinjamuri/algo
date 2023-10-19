import static org.junit.Assert.*;  
import com.javatpoint.logic.*;  
import org.junit.Test;  

public class Calculation {

    public static int findMax(int arr[]) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}


  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  
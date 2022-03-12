// Import to display the array as a string
import java.util.Arrays;

public class Main2 {
  
  public static void main(String[] args) {
    
    // Declare all the input arrays
    int [][] input_array_a = { { 1, 3 }, { 4, 5 } };
    int [][] input_array_b = { { 7, 1, 72, 92 }, { 66, 24 } };
    int [][] input_array_c = { { 19, }, { 12, 241 } };

    int[][][] array_of_input_array = { 
        input_array_a,
        input_array_b,
        input_array_c,
    };

    // Create an object from the Solution class
    Solution2 sol = new Solution2();

    // iterate over the array of input array
    for (int i = 0; i < array_of_input_array.length; i++) {

      // Declare and Initialize the input array
      int[][] input_array_i = array_of_input_array[i];

      // Declare the output_array_i
      int[][] output_array_i = sol.execute(input_array_i);

      // Display the output_array_i
      System.out.println("Input Array: " + Arrays.deepToString(input_array_i));
      System.out.println("Ouput Array: " + Arrays.deepToString(output_array_i));
      System.out.println("");
    }
  }
}
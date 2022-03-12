// Import to display the array as a string
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      // Declare all the input arrays
      int[][] array_of_input_array = {
        {1, 3, 4, 5}, // Input - 1
        {7, 1, 72, 92, 66, 24}, // Input - 2
        {19, 12, 241}, // Input - 3
      };
    
// Create an object from the Solution class
    Solution sol = new Solution();
    // Initialize the value of array length
    int array_length = array_of_input_array.length;
    // iterate over the array of input array
    for (int i = 0; i < array_length; i++){
        // Declare and Initialize the input array
        int[] input_array = array_of_input_array[i];
      
        // Declare the output_array
        String[] output_array = sol.execute(input_array);
        // Display the output_array
        System.out.println("Input Array: " + Arrays.toString(input_array));
        System.out.println("Ouput Array: " + Arrays.toString(output_array));
        System.out.println("");
    }
    }
  }
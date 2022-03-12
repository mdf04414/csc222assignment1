public class Solution2 {

  public static int[][] execute(int[][] input_array) {
    // Initialize the value of first element of the array
    int[] input_array_a = input_array[0];
    // Initialize the length value of first element of the array
    int input_array_a_length = input_array_a.length;
    // Initialize the value of second element of the array
    int[] input_array_b = input_array[1];
    // Initialize the length value of second element of the array
    int input_array_b_length = input_array_b.length;
    // Initialize the output array size
    int output_array_length = 0;

    // Check the smaller array size and it will the output array size
    if (input_array_a_length < input_array_b_length){
      output_array_length = input_array_a_length; 
    }
    else {
      output_array_length = input_array_b_length; //making output array length the longest out of the two arrays
    }
    
    // Declare the output array
    int[][] output_array = new int[output_array_length][2]; //creating a new array with two spots for values

    // Check if the array value is 1 and if so then we only need elements from 0 index
    if (input_array_b_length == 1 || input_array_a_length == 1){  

      // Initialize the output array
          int[] pair_array = {input_array_a[0], input_array_b[0]}; //creating a pair array that takes both values from a and b
          output_array[0] = pair_array;

    }
    else{

        // Recursively sort the array according the second element array
        for(int i=0; i < (output_array_length-1); i++){ //iterating over output array length -1 

          int xb = input_array_b[i]; //first index value
          int yb = input_array_b[i+1]; //the value after the one being iterated

          if (yb < xb) { 

            input_array_b[i] = yb; //rearranging it if xb is bigger
            input_array_b[i+1] = xb;

            // Make the similar index swap first element array
            int xa = input_array_a[i]; //swapping again but for other array
            int ya = input_array_a[i+1];
            input_array_a[i] = ya;
            input_array_a[i+1] = xa;
          }
        }
      }

    // Recursively create pairs i.e output array
    for(int i=0; i < output_array_length; i++){
      // Initialize and declare the pair from input_array_a and input_array_b elements  
      int[] pair_array = {input_array_a[i], input_array_b[i]};
      // Add them to output array
      output_array[i] = pair_array; //sorting output array and adding it to pair array
    
    }
    // Return output array
    return output_array;
  }
}

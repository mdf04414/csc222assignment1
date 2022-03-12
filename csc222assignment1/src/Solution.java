public class Solution {
  public static String[] execute(int[] input_array){
    //create a variable to be length of output array for the output string array length
    int input_array_length = input_array.length;
    
    //create an output string-datatype array for the output
    String[] output_array = new String[input_array_length];
    // Iterate over the length of the input_array
    for (int i = 0; i < input_array_length; i++) {
          //for each input index, if it is % 2 == 0, change value of output array to even
          if(input_array[i] % 2 == 0){
            // Assign the output array value 
            output_array[i] = "even";
          }else{
            // Assign the output array value 
            output_array[i] = "odd";
          }
      }
    return output_array;
  }
}
public class Solution {
    public  static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        Boolean validDigit = false;
        ArrayList<Integer> output = new ArrayList<Integer>();
        int number = 0;
        for(int i = A.size()-1; i > -1; i--) {
            number += A.get(i) * (int)Math.pow(10, i);
        }
        System.out.println(number);
        number += 1;
        System.out.println(number);
        for(int i = 0; i < A.size(); i++) {
            output.add(number % (int)Math.pow(10, i+1));
            number = number/(int)Math.pow(10, i+1);
        }
        if(number != 0 ) {
            output.add(number);
        }
        
        System.out.println(output.toString());
        Collections.reverse(output);
        System.out.println(output.toString());
        return output;
    }
}

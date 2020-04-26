public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        for(int i = 0; i < A.size()-1; i++) {
            if(Math.abs(A.get(i+1)-A.get(i)) < Math.abs(B.get(i+1)-B.get(i))) {
                steps += Math.abs(B.get(i+1)-B.get(i));
            } else {
                steps += Math.abs(A.get(i+1)-A.get(i));
            }
        }
        return steps;
    }
}

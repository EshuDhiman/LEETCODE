class Solution {
    public int smallestEvenMultiple(int n) {
         int multiple = 2;
    while (multiple % n != 0) {
        multiple += 2;
    }
    return multiple;
        
    }
}
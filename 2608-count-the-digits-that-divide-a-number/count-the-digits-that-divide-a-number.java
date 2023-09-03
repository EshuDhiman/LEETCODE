class Solution {
    public int countDigits(int num) {
     int n = 0;
        int x = num;
        int count = 0;
        while (x > 0) {
            n = x % 10;
            x = x / 10;
            if (num % n == 0) {
                count++;
            }
            
        }
        System.out.println(count);
        return count;
    }
}
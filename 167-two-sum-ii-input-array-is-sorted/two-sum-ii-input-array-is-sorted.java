class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1 ;
        int[] arr = new int[2];
        while (p2 > p1) {
            if (numbers[p1] + numbers[p2] == target) {
                arr[0] = p1+1;
                arr[1] = p2+1;
                break;
            } else if (numbers[p1] + numbers[p2] >target) {
                p2--;
                
            } else {
                p1++;
            }
        }
        return arr;
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
         if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle, 0));
            return haystack.indexOf(needle, 0);
        }
        return -1;
    }
}
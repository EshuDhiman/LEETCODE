class Solution {
    public int strStr(String haystack, String needle) {
         if(haystack.contains(needle)){
            return haystack.indexOf(needle, 0);
        }
        return -1;
    }
}
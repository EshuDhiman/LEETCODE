class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  
        char[] phrase = s.toCharArray();
        for (int i = 0, j = phrase.length - 1; i < phrase.length;) {

            if (phrase[i] == (phrase[j])) {
                i++;
                j--;

            } else {
                return false;
            }
        }
        return true;
    }
}
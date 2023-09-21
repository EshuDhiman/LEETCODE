class Solution {
    public String truncateSentence(String s, int k) {
    String[] words = s.split(" ");
    if (words.length <= k) {
        return s;
    }
    return String.join(" ", Arrays.copyOfRange(words, 0, k));
}

}
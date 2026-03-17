package problems.slidingwindow;

public class LongestRepeatingCharacterReplacement424 {
    public static int characterReplacement(String s, int k) {
        int low = 0;
        int max = 1;

        int changes = 0;
        int diffIndex = 0;
        char currChar = s.charAt(low);
        char currLen = 1;
        for(int i = 1; i < s.length(); i++) {
            if(currChar == s.charAt(i)) {
                currLen++;
                continue;
            }

            if(changes == 0) {
                diffIndex = i;
            }
            changes++;
            if(changes > k) {
                i = diffIndex;
                max = Math.max(max, currLen);
                currLen = 0;
                changes = 0;
                currChar = s.charAt(diffIndex);
            }
            currLen++;
        }
        return Math.max(max, currLen);
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("XYYX", 2));
    }

}

package problems.arraysandhashing;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        String[] parts = s.trim().split(" ");
        return parts[parts.length - 1].length();
    }
}

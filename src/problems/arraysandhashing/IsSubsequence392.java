package problems.arraysandhashing;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;

        if (s.length() > t.length())
            return false;

        int sIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (sIndex == s.length()) {
                return true;
            }
            if (t.charAt(i) == s.charAt(sIndex)) {
                sIndex++;
            }
        }

        return sIndex == s.length();
    }
}

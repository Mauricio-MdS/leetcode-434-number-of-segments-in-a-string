class Solution {
    public int countSegments(String s) {
        int segments = 0;
        boolean inSegment = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                inSegment = false;
            } else if (!inSegment) {
                segments++;
                inSegment = true;
            }
        }

        return segments;
    }
}
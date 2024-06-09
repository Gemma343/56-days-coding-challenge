class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        int i = 0, j = 0;

        while (i < S.length && j < T.length) {
            if(S[i] == T[j]) {
                i++;
            }

            j++;
        }

        return i == S.length;
    }
}
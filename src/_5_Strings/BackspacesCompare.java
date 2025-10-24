package _5_Strings;

public class BackspacesCompare {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            int skipS = 0;
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            int skipT = 0;
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            // compare characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) return false;
            } else if (i >= 0 || j >= 0) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
    public boolean backspaceCompareNaive(String s, String t) { // Naive Approach
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!sb.isEmpty() && ch == '#') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (ch != '#') {
                sb.append(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char th = t.charAt(i);
            if (!tb.isEmpty() && th == '#') {
                tb.deleteCharAt(tb.length() - 1);
            } else if (th != '#') {
                tb.append(th);
            }
        }

        return sb.compareTo(tb) == 0;
    }

    static void main() {
        System.out.println("Hello World!");
    }
}

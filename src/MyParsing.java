import java.util.ArrayDeque;
import java.util.Deque;

public class MyParsing {

    private final Deque<Character> stack = new ArrayDeque<>();

    public boolean parsePolishRecord(String s) {

        int sPos = 0;
        while (sPos < s.length()) {
            char ch = s.charAt(sPos);
            if (!this.charCheck(ch)) return false;

            if (ch != ' ') {
                stack.addFirst(ch);
            }
            sPos++;
        }
        System.out.println(stack.toString());
        return true;
    }


    public boolean charCheck(char ch) {

        char[] digitRange = new char[]{'0', '9'};
        char[] operationRange = new char[]{'(', '/' };
        char[] capLetterRange = new char[] {'A','Z'};
        char[] lowLetterRange = new char[] {'a', 'z'};
        char[] dopSymb = new char[] { '^', '|', ' '};
        char excludedSymb = ',';

        if (ch >= digitRange[0] && ch <= digitRange[1]) return true;
        if (ch >= operationRange[0] && ch <= operationRange[1] && ch != excludedSymb) return true;
        if (ch >= capLetterRange[0] && ch <= capLetterRange[1]) return true;
        if (ch >= lowLetterRange[0] && ch <= lowLetterRange[1]) return true;
        if (ch == dopSymb[0] || ch == dopSymb[1] || ch == dopSymb[2]) return true;
        return false;
    }
}

package Day4;

public class RemoveFlag {
    public static void main(String[] args) {
        System.out.println(getResult("25+61=86")); // PASS
        System.out.println(getResult("12345+12345=24690")); // PASS
        System.out.println(getResult("5++5=10")); // ERROR
        System.out.println(getResult("10000+1=10002")); // FAIL
    }

    private static String getResult(String str) {
        // ctrl + alt + shift + T : extract method
        int plusCnt = getCountOf(str, '+');
        int plusIndex = getIndexOf(str, '+');
        int equalCnt = getCountOf(str, '=');
        int equalIndex = getIndexOf(str, '=');

        if (!(plusCnt == 1 && equalCnt == 1))
            return "ERROR";
        if (!isValidSymbol(str))
            return "ERROR";
        // alr + Enter : invert if condition
        if (plusIndex < 1 || equalIndex < 3 || equalIndex >= str.length() - 1 || plusIndex >= equalIndex - 1) {
            return "ERROR";
        }

        int operand1 = Integer.parseInt(str.substring(0, plusIndex));
        int operand2 = Integer.parseInt(str.substring(plusIndex + 1, equalIndex));
        int result = Integer.parseInt(str.substring(equalIndex + 1));
        if (operand1 + operand2 == result)
            return "PASS";
        return "FAIL";
    }

    private static boolean isValidSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') continue;
            if (str.charAt(i) == '=') continue;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') continue;
            return false;
        }
        return true;
    }

    private static int getIndexOf(String str, char symbol) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                return i;
            }
        }
        return 0;
    }

    private static int getCountOf(String str, Character symbol) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                cnt++;
            }
        }
        return cnt;
    }
}

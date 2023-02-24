package hw.seminar4.validParentheses;

public class Main {
    public static void main(String[] args) {
        StringBuilder newLine = new StringBuilder("([]{})[]()[]()[]");
        System.out.println(checkValidation(newLine));
    }

    public static boolean checkValidation(StringBuilder newStr) {
        int i = 0;
        while (i < newStr.length()) {
            if (newStr.charAt(i) == '{' || newStr.charAt(i) == '(' || newStr.charAt(i) == '[') {
                i += 1;
            } else {
                if (i == 0) return false;
                char tempString = ' ';
                switch (newStr.charAt(i)) {
                    case '}':
                        tempString = '{';
                        break;
                    case ')':
                        tempString = '(';
                        break;
                    case ']':
                        tempString = '[';
                        break;
                }
                if (newStr.charAt(i-1) == tempString) {
                    i -= 1;
                    newStr.deleteCharAt(i);
                    newStr.deleteCharAt(i);
                } else return false;
            }
        }
        if (newStr.length() == 0) return true;
        return false;
    }
}

package strings;

public class Strings {

    public static void main(String[] args) {
        String s = "Это строка на языке Java ";
        char carray[] = new char[9];
        s.getChars(s.length() - 9, s.length(), carray, 0);
        System.out.print(carray);
        char symbol;
        symbol = s.charAt(6);
        System.out.println(symbol);
        System.out.println("----------------");
        byte nums[];
        nums = s.getBytes();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(nums[i] + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println("----------------");
        char chars[] = new char[s.length()];
        chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println("----->");
            } else {
                System.out.print(chars[i] + "*");
            }
        }
    }
}

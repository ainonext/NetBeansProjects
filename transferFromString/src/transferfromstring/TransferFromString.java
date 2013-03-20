package transferfromstring;

public class TransferFromString {

    static public int numpow(int pow) {
        int num = 2;
        if (pow == 0) {
            return num = 1;
        }
        pow--;
        return numpow(pow) * num;
    }

    public static void main(String[] args) {
        String str = "aba11111nk";
        System.out.print("Строка с двоичным числом " + str + "\n");
        int res = 0;
        int tmp = -1;
        for (int counter = 0; counter <= str.length() - 1; counter++) {
            if (str.charAt(counter) == '1' || str.charAt(counter) == '0') {
                tmp += 1;
            }
        }
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '0') {
                if (((int) str.charAt(i) - 48) > 0) {
                    res += ((int) str.charAt(i) - 48) * numpow(tmp);
                    tmp--;
                }
            }
        }
        System.out.print("В десятичной системе число " + res + "\n");
    }
}

package sorts;

public class Sorts {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 1, 5, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int len = array.length;
        int tmp;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    
                }
                
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

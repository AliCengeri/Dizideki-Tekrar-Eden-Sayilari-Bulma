import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 2, 4, 6, 3, 5};
        int[] newList = new int[list.length];
        int count = 0;
        for (int i : list) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(newList, list[i])) {
                        newList[count++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int a : newList) {
            if (a != 0) {
                System.out.println(a);
            }
        }
    }
}
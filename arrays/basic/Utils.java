import java.util.List;

public class Utils {
    public static void main(String[] args) {

    }

    public static void printArray(int[] arr, String text) {
        System.out.println(text);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printList(List<Integer> list, String text) {
        System.out.println(text);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

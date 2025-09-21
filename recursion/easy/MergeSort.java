package recursion.easy;

public class MergeSort {

    void merge(int[] arr, int low, int mid, int high) {
    int n1 = mid - low + 1;
    int n2 = high - mid;

    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    for (int i = 0; i < n1; i++)
        leftArr[i] = arr[low + i];
    for (int j = 0; j < n2; j++)
        rightArr[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = low;
    while (i < n1 && j < n2) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
        }
    }
    while (i < n1) {
        arr[k++] = leftArr[i++];
    }
    while (j < n2) {
        arr[k++] = rightArr[j++];
    }
}

    void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public void main(String[] args) {
        int arr[] = new int[] { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        System.out.println("After sorting : ");
        divide(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

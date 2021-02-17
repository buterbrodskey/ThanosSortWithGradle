import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr0 = {2, 94, 12, 22, 66, 10, 99, 0};
        int[] arr1 = {};
        int[] arr2 = {2, 94, 12, 22, 66, 10, 99};
        int[] arr3 = {1,1,1,1,1,1,1};
    }

    public static void ThanosSort(int[] arr, int l, int r) {
        if (arr.length == 0) {
            return;
        }

        boolean isSorted = true;

        int[] temp = Arrays.copyOfRange(arr, l, r);

        int avg = 0;
        for (int i = l; i < r; i++) {
            avg += arr[i];
        }
        avg /= (r - l);

        int l_edge = l, r_edge = r - 1;

        for (int i = 0; i < (r - l); i++) {
            if (temp[i] <= avg) {
                arr[l_edge] = temp[i];
                l_edge++;

                isSorted = temp[i] == avg ? isSorted : false; // на случай, если все элементы в подмассиве окажутся равными

            } else {
                arr[r_edge] = temp[i];
                r_edge--;
                isSorted = false;
            }
        }
        if (temp.length == 2 || temp.length == 1) {
            return;
        }
        if (isSorted) { return; }
        ThanosSort(arr, l, l_edge);
        ThanosSort(arr, l_edge, r);
    }
}

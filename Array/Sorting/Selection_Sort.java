// Selection Sort => 

public class Selection_Sort {
    public static void main(String[] args) {
        int array[] = { 5, 8, 1, 3, 12, 7, 0, 4 };
        int sortedArray[] = sorting(array);

        for (int i : sortedArray) {
            System.out.print(i + ",");
        }

    }

    static int[] sorting(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex!=i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}

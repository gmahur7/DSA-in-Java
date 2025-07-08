// Q7 -> Allocate n no of books to m no of students

public class Q7_Book_Allocation {
    public static void main(String[] args) {
        int books[] = { 10, 20, 30, 40 };
        int students = 2;
        System.out.println(allocateBook(books, students));
    }

    static int allocateBook(int array[], int m) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (isPossibleSolution(array, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    static boolean isPossibleSolution(int array[], int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i : array) {
            if (pageSum + i <= mid) {
                pageSum += array[i];
            } else {
                studentCount++;
                if (studentCount > m || array[i] > mid) {
                    return false;
                }
                pageSum = array[i];
            }
        }
        return true;
    }

}

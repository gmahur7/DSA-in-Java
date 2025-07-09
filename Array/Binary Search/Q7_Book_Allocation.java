// Q7 -> Allocate n no of books to m no of students

public class Q7_Book_Allocation {
    public static void main(String[] args) {
        int books[] = { 10, 20, 30, 40 };
        int students = 2;
        System.out.println(allocateBook(books, students));
    }

    static boolean isPossibleSolution(int array[],int students,int mid){
        int student=1;
        int pagesCount=0;

        for(int i=0;i<array.length;i++){
            if(pagesCount+array[i]<=mid){
                pagesCount+=array[i];
            }else{
                student++;
                if(student>students || mid<array[i]){
                    return false;
                }
                pagesCount=array[i];
            }
        }
        return true;
    }

    static int allocateBook(int books[], int students) {
        int totalPages = 0;
        for (int i : books) {
            totalPages += i;
        }

        int start = 0, end = totalPages, ans=-1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (isPossibleSolution(books,students,mid)) {
                ans=mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }
}

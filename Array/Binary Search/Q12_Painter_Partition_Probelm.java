// Q7 -> Allocate n no of books to m no of students

public class Q12_Painter_Partition_Probelm {
    public static void main(String[] args) {
        int walls[] = { 5,5,5,5 };
        int painters = 2;
        System.out.println(paintersPartition(walls, painters));
    }

    static boolean isPossibleSolution(int array[],int painters,int mid){
        int painter=1;
        int widthSum=0;

        for(int i=0;i<array.length;i++){
            if(widthSum+array[i]<=mid){
                widthSum+=array[i];
            }else{
                painter++;
                if(painter>painters || mid<array[i]){
                    return false;
                }
                widthSum=array[i];
            }
        }
        return true;
    }

    static int paintersPartition(int walls[], int painters) {
        int totalWallsWidth = 0;
        for (int i : walls) {
            totalWallsWidth += i;
        }

        int start = 0, end = totalWallsWidth, ans=-1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (isPossibleSolution(walls,painters,mid)) {
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

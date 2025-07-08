/*
Q10 => Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
*/

public class Q10_Search_Insert_Postiton {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};
        int target=3;
        int position = searchPosition(arr, target);
        System.out.println("Inserting postion index for target "+target+" is: "+position);
    }

    static int searchPosition(int array[], int target){
        int start=0,end=array.length-1,ans=array.length;
        int mid=(start+end)/2;
        while (start<=end) {
            if(array[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return ans;
    }
}

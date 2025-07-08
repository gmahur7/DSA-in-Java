// Q8=> Find the lower bound in sorted array with given target no.? 
// Lower bound => Smallest index such that array[ind] >= target

public class Q8_Lower_Bound {
    public static void main(String[] args) {
        int arr[]={2,3,6,7,9,12,14,15,20};
        int target = 4;
        int ans = lowerBond(arr, target);
        System.out.println("Lower bound index for target "+target+" is : "+ans);
    }

    static int lowerBond (int array[],int target){
        int start = 0;
        int end=array.length-1;
        int answer = end+1;
        int mid = (start+end)/2;

        while(start<=end){
            if(array[mid]>=target){
                answer=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid = (start+end)/2;
        }
        return answer;
    }
}

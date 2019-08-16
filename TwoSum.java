import javax.lang.model.util.ElementScanner6;

// arr = [2, 5, 7, 13, 34, 41, 45, 56].  Target 7
// 2 element sum to equal to target
// 7 => 0, 1;  8 => -1, -1

// int[] arr = {2, 5, 7, 13, 34, 41, 45, 56}
// arr[4]  arr.length
// int count = arr.length;
// int target = 8;
// , 17, 34, 41, 45, 56, 67
public class TwoSum{
    public static void main (String[] args){
        int[] arr = {2, 5, 7, 13, 17, 34, 41, 45, 56, 67};
        int target = 123;
        System.out.println(sum(arr, target)); 
    }

    public static int sum( int[] arr, int target){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return 1;
                } 
                if(arr[i] + arr[j] > target){
                    break;
                }
            }           
        }
        return -1;
    }
}
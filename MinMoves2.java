import java.util.Arrays;

public class MinMoves2 {
    public static void main(String[] args) {
        int[] nums= {1,2,3};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[(nums.length-1)/2];
        int moves = 0;
        for(int num: nums)
            moves+=Math.abs(num-mid);
        return moves;
    }
}

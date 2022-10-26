public class SqrtX {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = right - (right-left)/2;
        while(left < right) {
            if(mid>x/mid)
                right=mid-1;
            else
                left=mid;
            mid = right - (right-left)/2;
        }
        return left;
    }
}

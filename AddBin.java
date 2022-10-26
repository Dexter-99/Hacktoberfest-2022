public class AddBin {
    public static void main(String[] args) {
        String a ="11";
        String b ="1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length()-1,
                j = b.length()-1;
        int sum=0;
        while( i>=0 || j>=0 ){
            if(i>=0)
                sum += a.charAt(i--) - '0';
            if(j>=0)
                sum += b.charAt(j--) - '0';
            // System.out.print(sum%2);
            s.append(sum%2);
            sum /= 2;
        }
        if(sum != 0)
            s.append(1);
        return s.reverse().toString();
    }
}

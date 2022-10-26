public class PoorPigs {
    public static void main(String[] args) {
        int buckets = 4;
        int minutesToDie = 15;
        int minutesToTest =15;
        System.out.println(poorPigs(buckets, minutesToDie, minutesToTest));

    }
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs=0;
        int batch=(minutesToTest/minutesToDie)+1;
        while(Math.pow(batch, pigs++)<buckets);
        return --pigs;
    }
}

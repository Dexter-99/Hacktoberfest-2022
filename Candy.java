public class Candy {
    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int size=ratings.length;
        int[] front = new int[size];
        int[] back = new int[size];
        front[0] = back[size-1] = 1;
        for(int i = 1 ; i< size ; i++) {
            if(ratings[i]>ratings[i-1])
                front[i] = front[i-1]+1;
            else front[i] = 1;
            if(ratings[size-1-i] > ratings[size-i])
                back[size-1-i] = back[size-i]+1;
            else back[size-1-i] =  1;
        }
        int candy=0;
        for(int i=0 ; i<size ; i++)
            candy += Math.max(front[i],back[i]);
        return candy;
    }
}

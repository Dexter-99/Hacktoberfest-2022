import java.util.Arrays;

public class RescueBoat {

    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int front = 0;
        int back = people.length-1;
        int boats = 0;
        while(front <= back) {
            if(people[front] + people[back] <= limit)
                front++;
            boats++;
            back--;
        }
        return boats;
    }
}

import java.util.Arrays;

public class MaxMoves {
    public static void main(String[] args) {
        int [][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(maximumUnits(boxTypes,truckSize));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);
        int maxBoxes=0;
        int i=0;
        while(truckSize>0 && i<boxTypes.length){
            int min = Math.min(boxTypes[i][0],truckSize);
            maxBoxes += min*boxTypes[i][1];
            truckSize -= boxTypes[i][0];
            i++;
        }
        return maxBoxes;
    }
}

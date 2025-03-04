import java.util.*;

public class CouplesHoldingHands{
    public static int minSwaps(int [] row){
        int n = row.length;
        Map<Integer, Integer> pos = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            pos.put(row[i], i);
        }

        int swaps = 0;

        for(int i = 0; i<n; i+=2){
            int first = row[i];
            int second = first ^ 1;
            System.out.println(first+" "+second);

            if(row[i+1] != second){
                swaps++;

                int partInd = pos.get(second);

                row[partInd] = row[i+1];
                row[i+1] = second;

                pos.put(row[partInd], partInd);
                pos.put(row[i+1], i+1);
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] row = {0, 2, 3, 1};

        System.out.println(minSwaps(row));

    }

                
}
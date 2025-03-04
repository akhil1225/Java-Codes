public class DiscountPrices{
    public static int[] finalPrices(int[] prices){
        int n = prices.length;

        int[] res = new int[n];

        for(int i = 0; i<n; i++){
            res[i] = prices[i];
            for(int j = i+1; j< n; j++){
                if(prices[i] >= prices[j]){
                    res[i] = prices[i] - prices[j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {8, 4, 2, 3, 5};

        int[] res = finalPrices(prices);

        for(int ele: res){
            System.out.print(ele+" ");
        }
    }
}
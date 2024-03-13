class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n <= 1) {
            return 0;
        }
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        int minPrice1 = price[0];
        // int[] prices1 = {10,22,5,75,65,80};
        for (int i=1;i<n;i++) {
            minPrice1 = Math.min(minPrice1, price[i]);
            profit1[i] = Math.max(profit1[i - 1], price[i] - minPrice1);
            System.out.println(profit1[i]);
        }
        int maxPrice2 = price[n - 1];  //80
        System.out.println();
        // int[] prices1 = {10,22,5,75,65,80};
        for (int i=n-2;i>=0;i--) {
            maxPrice2 = Math.max(maxPrice2, price[i]);//80
            // System.out.println("Max : "+maxPrice2);
            profit2[i] = Math.max(profit2[i + 1], maxPrice2 - price[i]);
            System.out.println(profit2[i]);
            
        }
        System.out.println();
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            
            // System.out.println("profit1[i] : "+profit1[0]);
            maxProfit = Math.max(maxProfit, profit1[i] + (i + 1 < n ? profit2[i + 1] : 0));
            // System.out.println(maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int n1 = 6;
        int[] prices1 = {10,22,5,75,65,80};
        maxProfit(n1, prices1);
        System.out.println();
        // int n2 = 7;
        // int[] prices2 = {2,30,15,10,8,25,80};
        // System.out.println(maxProfit(n2, prices2));
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        int total = 0;
        for (int[] each : boxTypes) {
            int num_box = each[0];
            int putin = Math.min(truckSize, num_box);
            if (putin == 0) {
                return total;
            }
            total += putin * each[1];
            truckSize -= putin;
        }
        return total;
    }
}
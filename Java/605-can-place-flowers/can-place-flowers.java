class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n <= 0) return true;

            if (flowerbed[i] == 0) {
                // Check left and right boundaries
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
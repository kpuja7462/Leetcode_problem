class Solution {
    public int reverse(int x) {
       int sign = 1;

        if (x < 0) {
            sign = -1;
            x = -x;
        }

        int reverse = 0;

        while (x != 0) {

            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
        }

        return sign * reverse;

        
    }
}
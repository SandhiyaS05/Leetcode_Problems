class Solution {
    public int maximum69Number (int num) {

        int original = num;
        int maximum = num;
        int place = 1;

        while (num > 0) {

            int digit = num % 10;
            int newNum = original;

            if (digit == 6) {
                newNum = original + (3 * place); // Change 6 to 9
            } else {
                newNum = original - (3 * place); // Change 9 to 6
            }

            if (newNum > maximum) {
                maximum = newNum;
            }

            num = num / 10;
            place = place * 10;
        }

        return maximum;
    }
}
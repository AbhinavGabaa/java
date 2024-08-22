public class ConsecutiveDigitRuner {
    public boolean hasConsecutiveDuplicates (String sttt){


        // TODO: Write your code her
        int count = 0;
        if (sttt == null) {
            return false;
        }
        if (sttt.length() == 1) {
            return false;
        }
        // Himanshi=8
        //0 1 2 3 4 5 6 7
        for (int i = 0; i < sttt.length() - 1; i++) {
            char currentc = sttt.charAt(i);
            char nextc = sttt.charAt(i + 1);
            if (currentc == nextc) {
                return true;
            }

        }
        return false;
    }
}

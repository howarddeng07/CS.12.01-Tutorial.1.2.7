import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        }
        digitList = new ArrayList<>();
        if (num == 0) {
            digitList.add(0);
        } else {
            while (num > 0) {
                digitList.add(0, num % 10);
                num /= 10;
            }
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
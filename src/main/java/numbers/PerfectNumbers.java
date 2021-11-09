package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int counter = 1; counter <= number / 2; counter++) {
            if (number % counter == 0) {
                sum += counter;
            }
        }
        return sum == number;
    }
}

package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (j == i) {
                System.out.println(i);
            }
            i++;
        }
    }
}

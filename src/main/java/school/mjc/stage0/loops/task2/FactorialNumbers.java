package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int i = 1;
        while (i <= printToInclusive) {
            int j = 1;
            int count = 1;
            while (j <= i) {
                count *= j;
                j++;
            }
            System.out.println(count);
            i++;
        }
    }
}

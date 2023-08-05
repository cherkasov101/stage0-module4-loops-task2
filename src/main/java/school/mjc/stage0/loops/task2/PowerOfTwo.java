package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        System.out.println(1);
        int i = 1;
        int count = 2;
        System.out.println(count);
        while (i <= power) {
            count *= 2;
            System.out.println(count);
            i++;
        }
    }
}

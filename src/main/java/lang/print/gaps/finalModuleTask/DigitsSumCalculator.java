package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number/1000;
        int b = number/100%10;
        int c = number/10%10;
        int d = number%10;
        int sum = a+b+c+d;
        System.out.println(sum);
    }
}

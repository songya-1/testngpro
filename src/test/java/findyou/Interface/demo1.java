package findyou.Interface;

public class demo1 {
    public static void main(String[] args) {
        int i = 0, sum1 = 0, sum2 = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum1 = sum1 + i;

            } else {
                sum2 = sum2 + i;
            }
            ;
            i++;

        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

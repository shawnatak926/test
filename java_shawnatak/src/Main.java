//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int age = 5;

        if (age>= 20) {
            System.out.println("성인입니다.");

        } else {
            System.out.println("미성년자압니다.");
        }

        int grade = 2;
        int coupon;

        switch (grade) {
            case 1: coupon = 10000; break;
            case 2: coupon = 5000; break;
            case 3: coupon = 3000; break;
            default: coupon = 500; break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);


\
    }
}
public class Main {
    public static void main(String[] args) {
        int count = 0;

        count++;
        System.out.println(count);
        count++;
        System.out.println(count);
        count++;
        System.out.println(count);

        System.out.println("----------------");

        count = 0;
        while (count < 3) {
            count++;
            System.out.println(count);
        }
    }
}
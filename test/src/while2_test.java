public class while2_test {
    public static void main(String[] args) {
        int c = 0;
        while (c < 10) {
            System.out.println(c);
            c++;
            if (c == 5) {
                break;
            }
        }
    }
}

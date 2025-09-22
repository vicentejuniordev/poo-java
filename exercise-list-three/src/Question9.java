public class Question9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 1; i <= 15; i++){
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}

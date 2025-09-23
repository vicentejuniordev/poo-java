public class Question11 {
    public static void main(String[] args) {
        float a = 1;
        float c = 1;
        for(int i = 1; i<= 64; i ++){
            System.out.println(c);
            a *= 2;
            
            c += a;
        }
    }
}

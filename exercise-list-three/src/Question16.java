public class Question16 {
    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        for(int i = 50; i <= 70; i++){
            if(i % 2 == 0){
                sum += i;
                average += 1;
            }
        }
        average = sum / average;
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + average);
    }
}

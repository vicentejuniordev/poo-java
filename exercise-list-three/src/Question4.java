public class Question4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 500; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Somatório dos números pares: "+ sum);
    }
}

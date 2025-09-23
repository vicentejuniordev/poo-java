public class Question15 {
    public static void main(String[] args) {
        int fatorial = 1;
        for(int i = 1; i <= 10; i++){
          if(i % 2 != 0){
            for(int j = i; j > 0; j--){
              fatorial *= j;
            }
            System.out.println("Fatorial de " + i + " é " + fatorial);
            fatorial = 1;
          }
        }
    }
}

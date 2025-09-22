public class Question7 {
    public static void main(String[] args) {
        for(int i = 0; i <= 15;i++){
            if(i == 0){
                System.out.println(1);
            }else{
                int r = 1;
                for(int j = 0; j< i; j++){
                    r *= 3;
                }
                System.out.println(r);
            }
        }
    }
}

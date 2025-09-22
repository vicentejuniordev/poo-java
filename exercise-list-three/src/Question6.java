public class Question6 {
    public static void main(String[] args) {
        int i = 1;
        while (true){
            if(i < 200){
                if(i % 4 == 0){
                    System.out.println(i);
                    i++;
                }else{
                    i++;
                }
            }else{
                break;
            }
        }
    }
}

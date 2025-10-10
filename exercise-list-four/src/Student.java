public class Student { 
    String name;
    float score1;
    float score2;
    private float average;

    void media(){
        average = (score1+ score2)/2;
        System.out.println("\nYour average is: " + average);
    }

    void aprovado(){
        if(average >= 7){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        // Questions 1 and 2
        Pessoa p1 = new Pessoa();
        p1.name = "João";
        p1.age = 20;
        p1.toPresent();

        //Question 3 and 4
        Carro car1 = new Carro();
        car1.mark = "Fiat";
        car1.model ="Fastback";
        car1.year = 2025;
        car1.displayInformation();

        //Questions 5 and 6
        Product product1 = new Product();
        product1.name = "Sword";
        product1.amount = 10;
        product1.price = 20;
        product1.toalCalcValue();

        //Question7
        Book b1 = new Book();
        b1.title = "The Prince";
        b1.author = "Niccolo Machiavelli";
        b1.numberOfPages = 232;
        b1.summary();

        //Question 8 and 9
        Student s1 = new Student();
        s1.name="Jaime";
        s1.score1 = 10;
        s1.score2 = 10;
        s1.media();
        s1.aprovado();

        Student s2 = new Student();
        s2.name = "Joãozinho";
        s2.score1 = 6;
        s2.score2 = 6;
        s2.media();
        s2.aprovado();
    }
}

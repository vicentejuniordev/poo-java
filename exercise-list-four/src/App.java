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

        

    }
}

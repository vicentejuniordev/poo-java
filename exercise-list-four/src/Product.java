public class Product {
    String name;
    float price;
    int amount;

    void toalCalcValue(){
        System.out.println("\nTotal value: R$" + price * amount);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product("lenovo", "ideaPad", 5000, 300);   //Product constructordır yani nesne oluştuğu an çağrılır ve çalışır .
        // bu nesne default constructor ile muhattap olur

        System.out.println(product.name + " " + product.model + " " + product.price + " " + product.stockAmount);

        Product product1 = new Product("lenovo", "ideaPad", 5000, 300);  //parametreli consturctor
        System.out.println(product1.name + " " + product1.model + " " + product1.price + " " + product1.stockAmount);
    }}
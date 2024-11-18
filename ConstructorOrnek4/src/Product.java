public class Product {
    public static String name;
    public String model;
    public int price;
    public int stockAmount;

    public Product(String lenovo, String ideaPad, int i, int i1) {   //default constructors (parametre almaz)  mainde yeniden tanımlamaya gerek kalmadı
        this.name = "Macbook";    //constructor uzun süre değeri değişmeyecek seylerde kullanılmalı
        this.model = "Pro";        //değişecek özellik ise mesela stock gibi constructor ile değil manuel olarak değer atamalıyız
        this.price = 15000;
        this.stockAmount = 500;

    }
}

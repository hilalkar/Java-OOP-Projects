//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ürünü (Product) yöneten (managing) sınıfta (class) referans veri tiplerinin (object referer) nasıl kullanıldığını görürken,
        // yine encapsulation konseptine bağlı kalarak access modifiers (erişim belirleyicilerin) verilere erişimi nasıl
        // sınırlandırdığını ve getter-setter metotlarının (getter setter method) doğru kullanımını
        // bir kez daha program yazarak (programming) göstermeye çalıştım


        Product product= new Product("beats","solo",100,"black");
        System.out.println( "product's brand"+product.brand+"product's model"+product.model+"product's amount "+product.stockAmount+"product's color"+product.color);
        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
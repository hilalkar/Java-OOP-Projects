public class ProductManager {
    public void add(Product product) {     //object referer ürün eklemek içi metot
        //JDBC
        System.out.println("Product added to database");
        product.setId("BeatsSoloWireless1");
        System.out.println("product's id :"+product.getId());
    }

       // public void remove(Product product){

        }




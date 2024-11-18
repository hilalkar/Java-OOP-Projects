//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* loglama senaryosu üzerinde, interface kavramına, bağımlılık (Dependency)
         ve bağımlılık enjeksiyonu (Dependency Injection) kavramlarına ve gevşek-bağlı uygulamaların (Loosely-Coupled Apps)
         polymorphism ile birlikte nasıl inşa edildiğine değindik.
         Farklı müşteri tiplerini veritabanına ekledikten sonra fafrklı loglama yöntemleriyle loglama yapılması
         */
        Customer customer = new Customer();
        customer.setFirstName("Furkan");
        customer.setLastName("baysan");
        customer.setAge(25);
        ILogger logger = new EmailLogger();
        CustomerManager customerManager = new CustomerManager(logger);
        customerManager.add(customer);


    }
}
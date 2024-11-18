public class CustomerManager {
    ILogger logger;   //dependency nin ifadesi / composition
    public CustomerManager(ILogger newLogger){   //dependency injection
    this.logger=newLogger;

    }


    public void add(Customer customer){
        System.out.println(customer.getFirstName()+" "+ customer.getLastName()+ "added to the datebase");
      //loglama yapmak istiyoruz
        this.logger.log();
        
    }
}

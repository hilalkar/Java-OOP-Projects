public class ManagerSalaryCalculation extends BaseSalaryCalculation{
    public ManagerSalaryCalculation(){
        super(1000,300);
    }
    public void salaryCalculation(){  //override
        this.maas=(this.maas*oran/20);
        System.out.println( "Manager salary:"+this.maas);
    }
}

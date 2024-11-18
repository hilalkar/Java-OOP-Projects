public class VeznedarSalaryCalculation extends BaseSalaryCalculation{
    public VeznedarSalaryCalculation(){
        super(1000,100);     //base e atıfta bulunduk

    }

    @Override
    public void salaryCalculation() {
        this.maas=(this.maas*oran/20+500);
        System.out.println( "Cashier salary:"+this.maas);


    }
}

public class EngineerSalaryCalculation extends BaseSalaryCalculation {
    public EngineerSalaryCalculation(){         //super ile base in constructor ını çağırdık ve bu sınıfın özelliklerini yapılandırdık
        super(1000,200);

    }public void salaryCalculation(){    //override
        this.maas=(this.maas*oran/20);
        System.out.println( "Engineer salary:"+ this.maas);

    }

}

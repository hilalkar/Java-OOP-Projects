//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*Üst sınıfı (baseclass-superclass) inherit eden farklı alt sınıf nesnelerinin (subclasses)
     hiyerarşik yapıda birbiriyle nasıl iletişim kurduğunu bir maaş hesaplama (salary calculation)
     senaryosu üzerinden inceledik. Son olarak, çok şekilliliğe (polimorfizm) giriş niteliğinde
      object referer (pointer) yapısının nasıl kullanıldığını gördük.
     */

    EngineerSalaryCalculation engineerSalaryCalculation = new EngineerSalaryCalculation();
    engineerSalaryCalculation.salaryCalculation();

    ManagerSalaryCalculation managerSalaryCalculation = new ManagerSalaryCalculation();
    managerSalaryCalculation.salaryCalculation();

    VeznedarSalaryCalculation veznedarSalaryCalculation = new VeznedarSalaryCalculation();
    veznedarSalaryCalculation.salaryCalculation();
    }
}
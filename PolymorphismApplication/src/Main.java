//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/* kredi hesaplama modülü üzerinden Çok Şekilliliği (Polymorphism) anlatmaya çalıştım.
 Birden fazla ve farklı, birbirinin alternatifi olan ve ortak eylem veya eylemleri (methods)
 barındırmakla yükümlü alt sınıf (subclass) nesnelerinin, bir üst sınıf (base class- superclass)
  tarafından object referer (pointer) yapısının kullanımıyla nasıl yönetilebileceğini
  ve polymorphic yapının nasıl oluşturulduğunu anlattım
 */
        BaseCreditManager creditManager = new StudentCreditManager();
        System.out.println(creditManager.creditCalculate(1000.0));
        BaseCreditManager creditManager1 = new TeacherCreditManager();
        System.out.println(creditManager1.creditCalculate(1000.0));


        /*BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{
                new SoldierCreditManager(), new StudentCreditManager(),
                new TeacherCreditManager()};
        for (BaseCreditManager creditManager : baseCreditManagers) {
            System.out.println(creditManager.creditCalculate(1000.0));

        }
      */

    }
}
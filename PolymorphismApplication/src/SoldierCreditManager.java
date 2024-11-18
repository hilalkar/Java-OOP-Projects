public class SoldierCreditManager extends BaseCreditManager {
    @Override
    public double creditCalculate(double tutar) {
        return tutar * 1.15;
    }
}

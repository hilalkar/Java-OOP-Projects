public class KiralikEv extends Ev{

    public KiralikEv (int metrekare){
        super.metreKare=metrekare;
    }
    public double getFiyat(){
        return metreKare*50;
    }
    public String getIsim(){
        return "kiralık";
    }
}

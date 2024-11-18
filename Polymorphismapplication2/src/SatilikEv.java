public class SatilikEv extends Ev {
    public SatilikEv (int metrekare){
        super.metreKare=metrekare;
    }

    public double getFiyat(){
        return metreKare*5000;
    }
}

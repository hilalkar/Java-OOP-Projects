public class Ev {
    int metreKare;
    private double fiyat;

    public Ev(int metreKare){    //fiyatı yapılandırıcıya almadık çünkü alt sınıflar kendi yapılandırıcısında kullanıp atayacak

        this.metreKare=metreKare;
    }

    public int getMetreKare() {
        return metreKare;
    }

    public void setMetreKare(int metreKare) {
        this.metreKare = metreKare;
    }
    public void setFiyat(double fiyat){
        this.fiyat=fiyat;

    }
    public double getFiyat(){
        return fiyat;

    }

}

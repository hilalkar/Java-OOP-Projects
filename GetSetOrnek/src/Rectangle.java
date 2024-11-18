public class Rectangle {
    private int kisaKenar;
    private int uzunKenar;

    public Rectangle(int kısakenar,int uzunKenar){
        this.kisaKenar=kısakenar;
        this.uzunKenar=uzunKenar;
    }
    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
    public int alan(int kisaKenar,int uzunKenar){
        int alan;
        return alan=uzunKenar*kisaKenar;
    }
}

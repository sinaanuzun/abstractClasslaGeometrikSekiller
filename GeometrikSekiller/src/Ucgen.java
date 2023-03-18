public class Ucgen extends Geometrik{
    private double yukselik;
    private double taban;

    public void bilgi(double yukselik, double taban){
        isimBelirle("Üçgen Nesnesi : ");
        this.yukselik = yukselik;
        this.taban = taban;
    }


    @Override
    public double alanHesap() {
        return (taban*yukselik) / 2;
    }
}

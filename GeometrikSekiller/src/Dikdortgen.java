public class Dikdortgen extends Geometrik{
    private double uzunkenar;
    private double kisakenar;

    public void bilgi(double uzunkenar, double kisakenar){
        isimBelirle("Dikdörtgen Nesnesi : ");
        this.uzunkenar=uzunkenar;
        this.kisakenar=kisakenar;
    }


    @Override
    public double alanHesap() {
        return uzunkenar*kisakenar;
    }
}

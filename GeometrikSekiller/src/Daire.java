public class Daire extends Geometrik{
    private double yaricap;
    private double pi = Math.PI;

    public void bilgi(double yaricap){
        isimBelirle("Daire Nesnesi : ");
        this.yaricap=yaricap;
    }

    @Override
    public double alanHesap() {
        return pi*Math.sqrt(yaricap);
    }
}

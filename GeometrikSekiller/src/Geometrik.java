public abstract class Geometrik {
    private String isim;

    public void isimBelirle(String isim) {
        this.isim = isim;
    }

    public String isimGetir() {
        return this.isim;
    }

    public abstract double alanHesap();
}

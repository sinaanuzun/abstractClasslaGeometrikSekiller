public class Main {
    public static void main(String[] args) {

        Ucgen ucgen = new Ucgen();
        Dikdortgen dikdortgen = new Dikdortgen();
        Daire daire = new Daire();

        ucgen.bilgi(5,3);
        System.out.print(ucgen.isimGetir());
        System.out.println(ucgen.alanHesap());

        dikdortgen.bilgi(12,7);
        System.out.print(dikdortgen.isimGetir());
        System.out.println(dikdortgen.alanHesap());

        daire.bilgi(12.5);
        System.out.print(daire.isimGetir());
        System.out.println(daire.alanHesap());
    }
}
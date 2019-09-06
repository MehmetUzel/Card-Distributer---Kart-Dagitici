import java.util.Random;

public class Deste {
    private Kart[] deste;
    private int anlıkkart;
    private static final int kart_sayisi=52;
    private static final Random Rastgele_Sayilar = new Random();

    public Deste()
    {
        int[] degerler = {2,3,4,5,6,7,8,9,10,11,12,13,14};

        String[] tipler = {"SINEK","KARO","MACA","KUPA"};

        deste = new Kart[kart_sayisi];
        anlıkkart = 0;

        for (int i=0; i<deste.length;i++){
            deste[i]=new Kart(degerler[i%13],tipler[i/13]);
        }
    }

    public void Kar(){
        anlıkkart = 0;

        for (int ilk=0; ilk < deste.length; ilk++){
            int ikinci=Rastgele_Sayilar.nextInt(kart_sayisi);
            Kart temp = deste[ilk];
            deste[ilk] = deste [ikinci];
            deste[ikinci] = temp;
        }
    }

//    public Kart Kart_Dagıt(){
//
//        if (anlıkkart<deste.length){
//
//            return deste[anlıkkart++];
//        }
//        else
//            return null;
//    }

    public Kart  getDeste(int i) {
        return deste[i];
    }

    public void setDeste(Kart[] deste) {
        this.deste = deste;
    }
}

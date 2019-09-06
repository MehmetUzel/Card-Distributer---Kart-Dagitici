import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Masa {
    public static void main(String[] args){
        Deste myDeste = new Deste();
        myDeste.Kar();
        int oyuncusayisi = 4;

        ArrayList<Oyuncu> myOyuncular = new ArrayList<Oyuncu>();

        for (int n = 0; n < oyuncusayisi ; n++){
          // String[] yeniEl = new String[13];
          //  ArrayList<String> yeniEl = new ArrayList<String>();
           myOyuncular.add(new Oyuncu(n, new ArrayList<Kart>()));
        }

        for (int i = 0 ;i <= 51 ;i++){

            int a = i%4;
            switch (a){
                case 0 :
                    myOyuncular.get(0).getEl().add(myDeste.getDeste(i));
                    break;
                case 1 :
                    myOyuncular.get(1).getEl().add(myDeste.getDeste(i));
                    break;
                case 2 :
                    myOyuncular.get(2).getEl().add(myDeste.getDeste(i));
                    break;
                case 3 :
                    myOyuncular.get(3).getEl().add(myDeste.getDeste(i));
                    break;
            }
//            System.out.printf("%-18s",myDeste.Kart_Dagıt());
//                if (i%4==0)
//                    System.out.println();
        }

        for (int k=0; k<oyuncusayisi;k++) {
            Collections.sort(myOyuncular.get(k).getEl(), new Diz());
            Collections.sort(myOyuncular.get(k).getEl(), new CesitDiz());
            for (int l = 0; l < 13; l++) {
                System.out.println(myOyuncular.get(k).getEl().get(l));
            }
            System.out.println();
            }
        }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Masa {
    public static void main(String[] args){
        Deste myDeste = new Deste();
        myDeste.Kar();
        int oyuncusayisi = 3;

        ArrayList<Oyuncu> myOyuncular = new ArrayList<Oyuncu>();

        for (int n = 0; n < oyuncusayisi ; n++){
          // String[] yeniEl = new String[13];
          //  ArrayList<String> yeniEl = new ArrayList<String>();
           myOyuncular.add(new Oyuncu(n, new ArrayList<Kart>()));
        }

        for (int i = 0 ;i < myDeste.getDesteninkendi().length ;i++){
            myOyuncular.get(i%oyuncusayisi).getEl().add(myDeste.getDeste(i));
        }

        for (int k=0; k<oyuncusayisi;k++) {
            Collections.sort(myOyuncular.get(k).getEl(), new Diz());
            Collections.sort(myOyuncular.get(k).getEl(), new CesitDiz());
            System.out.println((k+1)+" Oyuncusunun Kartları :");
            for (int l = 0; l < myDeste.getDesteninkendi().length/oyuncusayisi; l++) {
                System.out.println(myOyuncular.get(k).getEl().get(l));
            }
            System.out.println();
            }
        }
}

import java.util.Comparator;
import java.util.*;

public class Diz implements Comparator <Kart> {

    public int compare(Kart a,Kart b){
        return a.deger - b.deger;
    }

}




import java.util.Comparator;

public class CesitDiz implements Comparator<Kart> {


    public int compare(Kart a, Kart b) {return a.getTipVal() - b.getTipVal();}
}
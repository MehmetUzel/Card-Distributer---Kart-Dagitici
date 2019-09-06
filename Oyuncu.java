import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Oyuncu {

    private int numara;
    private ArrayList<Kart> el;

    public Oyuncu(int numara, ArrayList<Kart> el){
        this.numara = numara;
        this.el = el;
    }

//    Collections.sort(el, new Diz());

    public int getNumara() {
        return numara;
    }

    public void setNumara(int newNumara){
        numara = newNumara;
    }



//    public void elidiz(){
//        Collections.sort(this.el, new Diz());
//
//    }

    public ArrayList<Kart> getEl() {
        return el;
    }

    public void setEl(ArrayList<Kart> newEl){
        el = newEl;
    }
}

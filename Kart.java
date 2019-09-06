import java.util.HashMap;

public class Kart {

    private String tip;
    int deger;

    public Kart(int deger, String tip){
        this.tip = tip;
        this.deger = deger;
    }

//    public int Compare(Kart kart){
//
//        int comp = tipMap.get(getTip()).compareTo(tipMap.get(kart.getTip()));
//        if (comp != 0) {
//            return comp;
//        } else {
//
//        }
//    }

    public String getTip(){
        return tip;
    }

    public int getTipVal() {

        HashMap<String,Integer> tipMap = new HashMap<String, Integer>();
        tipMap.put("SINEK", 0);
        tipMap.put("KARO", 1);
        tipMap.put("MACA", 2);
        tipMap.put("KUPA", 3);

        return tipMap.get(tip);
    }

    public void setTip(String newTip){
        tip = newTip;
    }

    public int getDeger(){
        return deger;
    }

    public void setDeger(int newDeger){
        deger = newDeger;
    }

    public String toString(){
        return this.tip+" "+this.deger;
    }

}

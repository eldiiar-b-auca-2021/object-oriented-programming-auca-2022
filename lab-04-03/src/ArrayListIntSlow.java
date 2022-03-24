import java.util.*;

public class ArrayListIntSlow {
    private int[] data;
    public ArrayListIntSlow(){
        data = new int[0];
    }
    public void add(int x) {
        int[] newData = new int[data.length +1];
            for (int i = 0; i < data.length; ++i){
                newData[i] = data[i];
            }
            newData[newData.length-1] = x;
            data = newData;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < data.length; i++){
            if (i != 0) {
                res.append(", ");
            }
            res.append(data[i]);
        }
        res.append("]");
        return res.toString();
    }
    public int size (){
        return data.length;
    }
    public int get (int index){
        return  data[index];
    }
    public void set(int index, int newValue){
        data[index] = newValue;
    }

}
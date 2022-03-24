public class ArrayListInt {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] data;
    private int length = 0;
    public ArrayListInt(){
        data = new int[DEFAULT_CAPACITY];
    }
    public void add(int x) {
        if (length == data.length) {
            int[] newData = new int[data.length + data.length/2];
            for (int i = 0; i < data.length; ++i) {
                newData[i] = data[i];
            }
           data = newData;
        }
        data[length] = x;
        ++length;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < length; i++){
            if (i != 0) {
                res.append(", ");
            }
            res.append(data[i]);
        }
        res.append("]");
        return res.toString();
    }
    public int size (){
        return length;
    }
    public int get (int index){
        return  data[index];
    }
    public void set(int index, int newValue){
        data[index] = newValue;
    }

}
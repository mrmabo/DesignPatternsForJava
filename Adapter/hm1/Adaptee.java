package Adapter.hm1;

public class Adaptee {
    private String[] data;
    private int start;
    private int end;

    public String startString(){
        return data[start];
    }

    public String endString(){
        return data[end];
    }

    public boolean empty(){
        return (end == -1);
    }

    public void add(String str){
        data[end] = str;
        end++;
    }
    public String get(int pos){
        return data[pos];
    }

    public void remove(int pos){
        for (int i = pos; i < end; i++) {
            data[i] = data[i+1];
        }
    }

    public int getEnd() {
        return end;
    }
}

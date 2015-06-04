package dynamicarray;

import java.io.IOException;
import java.util.Random;

public class DynamicArray {

    int[] Array;
    int[] largeArray;
    int cursor;

    public DynamicArray() {
        Array = new int[1];
        cursor = 0;
    }

    void resize() {
        int length = Array.length;
        largeArray = new int[length * 2];
        for (int i = 0; i < length; i++) {
            largeArray[i] = Array[i];
        }
        this.Array = largeArray;
    }

    void add(int value) {
        if (cursor == Array.length) {
            resize();
        }
        Array[cursor] = value;
        cursor++;
    }

    public static void main(String[] args) throws IOException {
        DynamicArray da = new DynamicArray();
        Random rand = new Random();
        int numOfElm;
        System.out.println("Kaç Eleman :");
        numOfElm = System.in.read();
        for (int i = 0; i < numOfElm; i++) {
            da.add(rand.nextInt(10));
        }
        for(int i = da.Array.length -1;i>=0;i--) {
            System.out.print(da.Array[i] + "-");
        }
    }

}

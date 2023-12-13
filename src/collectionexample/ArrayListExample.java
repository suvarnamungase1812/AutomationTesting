package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        arrayList.add("abhishek");
        arrayList.add("advik");
        arrayList.add("anay");
        arrayList.add("advay");
        arrayList.add("shitej");
        arrayList.add("advik");

        for (Object s:arrayList)
        {
            System.out.println(s);
        }
    }}



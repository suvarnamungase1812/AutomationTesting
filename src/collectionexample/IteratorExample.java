package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("raman");
        list.add("suman");
        list.add("nima");
        list.add("dipti");
        list.add("raghav");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

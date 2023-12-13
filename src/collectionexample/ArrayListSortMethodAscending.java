package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortMethodAscending {
    public static void main(String[] args) {
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("abhishek");
        arrayList2.add("advik");
        arrayList2.add("anay");
        arrayList2.add("advay");
        arrayList2.add("shitej");
        arrayList2.add("advik");

        {
            Collections.sort(arrayList2);
            System.out.println(arrayList2);
        }
    }
}



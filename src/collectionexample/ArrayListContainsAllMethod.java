package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsAllMethod {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("abhishek");
        arrayList1.add("advik");
        arrayList1.add("anay");
        arrayList1.add("advay");
        arrayList1.add("shitej");
        arrayList1.add("advik");

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("abhishek");
        arrayList2.add("advik");
        arrayList2.add("anay");
        arrayList2.add("advay");
        arrayList2.add("shitej");
        arrayList2.add("advik");

        {
            System.out.println(arrayList1.containsAll(arrayList2));
        }
    }
}




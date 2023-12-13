package collectionexample;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>();
linkedList.add("sonam");
linkedList.add("disha");
linkedList.add(null);
linkedList.add("amar");
linkedList.add(150);
linkedList.add(null);
linkedList.addFirst("sonu");
linkedList.addLast("sonu");
        System.out.println(linkedList);
    }
}

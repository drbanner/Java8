package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
        Example to sort collection with lambda expression using JAVA-8
 */
public class ListJava8Example {


    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(23);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(77);
        arrayList.add(12);
        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(77);
        list.add(23);
        list.add(4);
        list.add(12);

        System.out.println(list);
        Collections.sort(list, (l1, l2) -> (l1 > l2) ? -1 : (l1 < l2) ? +1 : 0);
        System.out.println(list);


    }
}

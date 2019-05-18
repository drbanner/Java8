package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListJava8Example {


    public static void main(String args[])
    {
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
        list.add(23);
        list.add(4);
        list.add(5);
        list.add(77);
        list.add(12);

        System.err.println(list);
        Collections.sort(list,(l1,l2)->(l1>l2)?-1:(l1<l2)?+1:0);
        System.err.println(list);



        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(67);
        hashSet.add(55);
        hashSet.add(12);
        hashSet.add(88);
        hashSet.add(55);
        hashSet.add(67);
        System.err.println(hashSet);




    }
}

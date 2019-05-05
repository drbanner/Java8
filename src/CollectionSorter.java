import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class CollectionSorter {

    public static void main(String args[]) {


        List<String> list = new ArrayList<String>();
        list.add("def ");
        list.add("efg ");
        list.add("fgh ");

        List<String> list1 = new ArrayList<String>();
        list1.add("abc ");
        list1.add("bcd ");
        list1.add("cde ");

        CollectionSorter collectionSorter = new CollectionSorter();
        System.out.println("Sort using Java 7 syntax: ");

        collectionSorter.sortUsingJava7(list);
        System.out.println(list);
        System.out.println("Sort using Java 8 syntax: ");

        collectionSorter.sortUsingJava8(list1);
        System.out.println(list1);
    }

    //sort using java 7
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
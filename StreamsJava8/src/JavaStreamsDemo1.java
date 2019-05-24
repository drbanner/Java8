import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsDemo1 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        System.out.println(integers);

        List<Integer> l1 = integers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer> l2 = integers.stream().map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3 = integers.stream().filter(integer -> integer % 2 == 0).map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(l3);

    }

}

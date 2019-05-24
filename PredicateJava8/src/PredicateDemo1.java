import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1
{

    public static void main(String[] args)
    {

        Predicate<Integer> predicate1 = i -> i > 50;

        System.out.println(predicate1.test(500));
        System.out.println(predicate1.test(10));

        Predicate<String> predicate2 = s -> s.length() > 5;
        System.out.println(predicate2.test("jane"));
        System.out.println(predicate2.test("janeDoe"));

        Predicate<Collection> predicate3 = c -> c.isEmpty();
        List<String> list = new ArrayList<>();
        list.add("test");
        System.out.println(predicate3.test(list));


        List<String> list1 = new ArrayList<>();
        System.out.println(predicate3.test(list1));


    }
}

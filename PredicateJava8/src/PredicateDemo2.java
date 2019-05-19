import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {


    public static void main(String[] args)
    {
        Predicate<String> predicate = s -> s!= null && s.length()!=0;
        String[] names = {"name1", "name4", null, "name12","", "name1111"};

        List<String> list = new ArrayList<>();

        for(String s:names)
        {
            if(predicate.test(s)) {
                list.add(s);
            }
            }
        System.out.println("List: "+ list);

    }


}

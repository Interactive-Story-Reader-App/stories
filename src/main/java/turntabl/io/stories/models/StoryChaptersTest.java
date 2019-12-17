package turntabl.io.stories.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StoryChaptersTest {
    public static void main(String[] args){

        List<String> path = new ArrayList<>();

        List<String> ca= Arrays.asList();
        List<String> cb= Arrays.asList("a", "b");
        List<String> cc= Arrays.asList("a", "c");
        List<String> cd= Arrays.asList("b", "d");
        List<String> ce= Arrays.asList("d", "c", "b", "e");
        List<String> cf= Arrays.asList("e", "f");
        List<String> cg= Arrays.asList("f", "g");
        List<String> ch= Arrays.asList("g", "h");
        List<String> ci= Arrays.asList("g", "i");

        List<List<String>> chapters = Arrays.asList(Logic.finalList(ci), Logic.finalList(ch), Logic.finalList(cg), Logic.finalList(cf), Logic.finalList(ce), Logic.finalList(cd), Logic.finalList(cc), Logic.finalList(cb), Logic.finalList(ca));

        for(List<String> arr: chapters){
            for (String a : arr){
                path.add(a);
            }
        }
        List<String> listDistinct = path.stream().distinct().collect(Collectors.toList());

        System.out.println(path);
        Collections.reverse(listDistinct);
        System.out.println(listDistinct);

    }
}

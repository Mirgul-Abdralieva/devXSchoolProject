package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ExcArrayList {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        System.out.println(actors.isEmpty());
        actors.add("Bred");
        actors.add("Dep");
        System.out.println(actors);
        System.out.println(actors.get(1));
        System.out.println(actors.remove(0));
        System.out.println(actors);
   //     actors.clear();
        System.out.println(actors);
        ArrayList<String> names = new ArrayList<>();
        names.add("Aisha");
        names.addAll(0,actors);
        System.out.println(names);
     //   names.add(1,"Aisha");
      //  System.out.println(names);


    }
}

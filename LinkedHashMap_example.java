import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class LinkedHashMap_example {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        Set set = lhmap.entrySet();

        System.out.println("Displaying all the elements in the linkedhashmap");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() +
                    "& Value is: "+me.getValue()+"\n");
        }
    }
}
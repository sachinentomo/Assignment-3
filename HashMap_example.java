import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMap_example {
    public static void main(String args[]) {


        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "JAVA");
        hmap.put(2, "PYTHON");
        hmap.put(3, "JAVASCRIPT");
        hmap.put(4, "C#");
        hmap.put(5, "RUBY");



        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        System.out.println("To check Specific Value in HashMap : "+hmap.containsValue("JAVA"));
        System.out.println("To check Specific Value in HashMap : "+hmap.containsKey(6));

        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);


        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}

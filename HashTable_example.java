import java.util.Hashtable;
import java.util.Enumeration;
public class HashTable_example {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable<String, String> hashtable =
                new Hashtable<String, String>();


        hashtable.put("Key1","JAVA");
        hashtable.put("Key2","PYTHON");
        hashtable.put("Key3","RUBY");
        hashtable.put("Key4","C#");
        hashtable.put("Key5","SPRING");

        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}
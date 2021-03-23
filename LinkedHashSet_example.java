import java.util.LinkedHashSet;
public class LinkedHashSet_example {
    public static void main(String[] args)
    {
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
        linkedset.add("JAVA");
        linkedset.add("PYTHON");
        linkedset.add("JAVASCRIPT");
        linkedset.add("C#");
        linkedset.add("PHP");
        linkedset.add("RUBY");

        System.out.println("Size of LinkedHashSet = " +
                linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
        System.out.println("Removing PHP from LinkedHashSet: " +
                linkedset.remove("PHP"));
        System.out.println("Trying to Remove SPRING which is not " +
                "present: " + linkedset.remove("SPRING"));
        System.out.println("Checking if A is present=" +
                linkedset.contains("PYTHON"));
        System.out.println("Updated LinkedHashSet: " + linkedset);
    }
}


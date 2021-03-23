import java.util.ArrayList;
class ArrayList_class {

    public static void array_list()
    {
        ArrayList<String> arlTest = new ArrayList<String>();
        System.out.println("Size of ArrayList at creation: " + arlTest.size());
        arlTest.add("E");
        arlTest.add("N");
        arlTest.add("T");
        arlTest.add("O");
        arlTest.add("M");
        arlTest.add("O");

        System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
        System.out.println("List of all elements: " + arlTest);
        arlTest.remove("O");
        System.out.println("See contents after removing one element: " + arlTest);
        arlTest.remove(2);
        System.out.println("See contents after removing element by index: " + arlTest);
        System.out.println("Size of arrayList after removing elements: " + arlTest.size());
        System.out.println("List of all elements after removing elements: " + arlTest);
        System.out.println(arlTest.contains("E"));
    }

    public static void main(String[] args) {
        array_list();
    }
}
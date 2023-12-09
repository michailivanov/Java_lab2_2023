package michail;
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> a = new MyArrayList<>();
        System.out.println(a.size());
        a.add("Apple");
        a.add("Banana");
        a.add("Orange");
        a.add("Mango");
        a.add("Pineapple");

        System.out.println(a.contains("Pineapple"));
        System.out.println(a.size());
        System.out.println(a);
        a.remove(2);
        System.out.println(a);

        System.out.println("Array:");
        for (String element : a) {
            System.out.println(element);
        }

    }
}
package JavaGenerics;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Hello");
//        list.add("World!");
//        System.out.println(list.get(0));
//
//        Box<Integer> box = new Box<>();
//
//        box.setValue(1);
//        System.out.println(box.getValue());

        Key_n_Value<String, Integer> pair = new Key_n_Value("Age", 17);

        String s = pair.getKey();
        System.out.println(s);

        System.out.println(pair.getValue());

    }
}

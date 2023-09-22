

public class TestNode {
    public static void main(String[] args) {
        Node<Integer> thing1 = new Node<>(4);
        Node<Integer> thing2 = new Node<>(4);
        Node<Integer> thing3 = new Node<>(3,thing1,thing2);
        System.out.println(thing1.toString());
        System.out.println(thing1.equals(thing2));
        System.out.println(thing3);
    }
}

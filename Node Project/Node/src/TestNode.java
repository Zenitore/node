

public class TestNode {
    public static void main(String[] args) {
        Node<Integer> thing1 = new Node<>(4);//creates new node obj called thing1 with value 4
        Node<Integer> thing2 = new Node<>(4);//creates new node obj called thing2 with value 4
        Node<Integer> thing3 = new Node<>(3,thing1,thing2);//creates new node obj called thing3 with value 3 & a parent of thing 1 and child of thing 2
        System.out.println(thing1.toString());//prints the value stored in thing 1
        System.out.println(thing1.equals(thing2));//prints the equivalancy statement betweeen thing 1 and thing 2
        System.out.println(thing3);//prints thing 3
    }
}

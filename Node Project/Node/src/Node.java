public class Node <T>{
    private T t;
    private Node parentNode;
    private Node childNode;


    public Node(){
        t = null;
        parentNode = null;
        childNode = null;
    }
    public Node(T t, Node parentNode, Node childNode){
        this.t = t;
        this.parentNode = parentNode;
        this.childNode = childNode;
    }
    public Node(T t){
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    public String toString() {return  "Node: " + get();}
    public boolean equals(Node <T> p){ return get() == p.get();}


    }

        

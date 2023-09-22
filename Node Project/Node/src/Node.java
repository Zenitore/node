/*
ETLA
9/22/23
LDO
google + the api ms hellman gave us
*/




public class Node <T>{
    private T t; // new type T variable t. T is defined when the object is created
    private Node parentNode; //new Node object that is the parent of this created node
    private Node childNode; //new Node object that is the child of this created node


    public Node(){
        t = null;//default sets all values to null. Values can be saved in later
        parentNode = null;
        childNode = null;
    }
    public Node(T t, Node parentNode, Node childNode){
        this.t = t;//three inputs allowing for all instance values to be set
        this.parentNode = parentNode;
        this.childNode = childNode;
    }
    public Node(T t){
        this.t = t;
    } // one input for allowance of the instance variable t to be set

    public void setNodeValue(T t) { this.t = t; }//sets the value inside the node object
    public T getNodeValue() { return t; }//returns the value inside the obj node
    public void setParentNode (Node parentNode){
        this.parentNode=parentNode;
    }//sets the parent node of the node obj
    public Node getParentNode(){return this.parentNode;}//returns the parent node of the node obj
    public void setChildNode(Node childNode){this.childNode=childNode;}//sets the child node of the node obj
    public Node getChildNode(){
        return this.childNode;
    }//returns the child node of the node obj
    public String toString() {return  "Node: " + getNodeValue();}//returns the String of Node then the value that has been saved in the node
    public boolean equals(Node <T> p){ return getNodeValue() == p.getNodeValue();}//checks to see if 2 values of the nodes are equivalent


    }

        

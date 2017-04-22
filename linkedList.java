import java.util.Random;

public class linkedList{
  
  //properties
  private Node head = null;
  private int size = 0;
  
  //default constructor
  public linkedList(){
    head = null;
  }
  
  
  //method getSize
  public int getSize(){
    return this.size;
  }
  
  //method isEmpty()
  public boolean isEmpty(){
    return head == null;
  }
  
  //method addNumber() add a node to the end of list
  public void addNumber(Node node){
    Node newNode = new Node(node.getNumber()); 
    if(isEmpty() == true){      //  if list is empty then add the node to head 
      head = newNode;
    }
    else{                       
      Node list = head;
      while(list.getNext() != null){   // loop add node
        list = list.getNext();
      }
      list.setNext(newNode);
    }
    size++;
  }
   //method populate 
  public void populateList(int length){
    Random random = new Random();
    for(int i = 0;i < length;i++){
      int n = random.nextInt(100);
      addNumber(new Node(n));
    }
   }
  // method swap
   public void swap(Node j, Node k){
    int temp = j.getNumber();
    j.setNumber(k.getNumber());
    k.setNumber(temp);
  }
  // method bubbleSort
    public void bubbleSort(){
    for(int i=0;i< size;i++){
      Node currentNode = head;
      Node nextNode = head.getNext();
      for(int j=0;j<size-1;j++){
        if(currentNode.getNumber() > nextNode.getNumber()){
          swap(currentNode,nextNode);
        }
        currentNode = nextNode;
        nextNode = nextNode.getNext();
      }
    }
  }
  
  
  
  
  
}
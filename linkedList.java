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
  public viod addNumber(Node node){
    Node newNode = new Node(node.getNumber()); 
    if(isEmpty() == true){      //  if list is empty then add the node to head 
      head = newNode;
    }
    else{                       
      Node list = head;
      while(list.getNext()! = null){   // loop add node
        list = list.getNext;
      }
      list.setNext(newNode);
    }
    size++;
  }

  
  
  
  
  
}
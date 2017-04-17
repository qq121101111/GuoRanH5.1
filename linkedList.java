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
  


}
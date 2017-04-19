
public class Node{

  private int number;
  private Node back;
  private Node next;
  
    //constroctor
      public Node(int number){
  
        this.number = number;
        this.next = null;

      }

    //setter and getter
      public int getNumber(){
        
         return number;
      }
      public Node getBack(){
         return back;
      }

      public Node getNext(){
        return next;
      }
      
      public void setNumber(int d){
        number = d;
      }
      
      public void setBack(Node n){
        back = n;
      }
      
      public void setNext(Node n)
      {
        next = n;
      }
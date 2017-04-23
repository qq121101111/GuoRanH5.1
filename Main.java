public class Main{

    public static void main(String[] args) { 
    LinkedList list1 = new LinkedList();
    
    list1.populateList(10);
    
    System.out.println("unsort");
    list1.print();
    System.out.println("after");
    list1.bubbleSort();
    list1.print();
    
    
  
  }

}
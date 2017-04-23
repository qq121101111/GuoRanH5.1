public class Main{

    public static void main(String[] args) { 
    linkedList list1 = new linkedList();
    
    list1.populateList(10);
    
    System.out.println("unsort");
    list1.print();
    System.out.println("after");
    list1.bubbleSort();
    list1.print();
    
    
  
  }

}
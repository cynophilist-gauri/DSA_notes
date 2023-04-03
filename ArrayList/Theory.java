/*Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.*/

/*The important points about the Java ArrayList class are:

* Java ArrayList class can contain duplicate elements.( Use HashSet to remove duplicate elements)

* Java ArrayList class maintains insertion order.

* Java ArrayList class is non synchronized.

* Java ArrayList allows random access because the array works on an index basis.

* In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.

* We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:
  ArrayList<int> al = ArrayList<int>(); // does not work  
  ArrayList<Integer> al = new ArrayList<Integer>(); // works fine 
*/

/*
 * ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
    list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object       or       //Traversing list through for-each loop  
      System.out.println(list);                        for(String fruit:list) 
                                                           System.out.println(fruit);    
 */
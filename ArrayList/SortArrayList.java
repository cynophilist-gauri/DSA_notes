import java.util.*;
class SortArrayList{
    public static void main(String args[]){
        //Creating a list of numbers
        ArrayList<Integer> sorted_array=new ArrayList<Integer>();
        sorted_array.add(10);
        sorted_array.add(20);
        sorted_array.add(30);
        sorted_array.add(40);

        //Sorting the list
        Collections.sort(sorted_array);

        //Traversing list through the for-each loop
        for(Integer number:sorted_array{
            System.out.println(number);
        })
    }
}
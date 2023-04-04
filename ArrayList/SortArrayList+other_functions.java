import java.util.*;
class SortArrayList{
    public static void main(String args[]){
        //Creating a list of numbers
        ArrayList<Integer> sorted_array=new ArrayList<Integer>();
        sorted_array.add(10);
        sorted_array.add(40);
        sorted_array.add(30);
        sorted_array.add(40);

        //Sorting the list
        Collections.sort(sorted_array); // O(nlog(n))

        //Other functions
        Collections.frequency(40);
        Collections.swap(sorted_array,2,3);
        Collections.reverseOrder(sorted_array);
        obj.get(1);
        obj.remove(3);
        obj.set(1,90);
        obj.size();

        //Traversing list through the for-each loop
        for(Integer number:sorted_array{
            System.out.println(number);
        })
    }
}
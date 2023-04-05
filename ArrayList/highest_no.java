import java.util.*;
public class highest_no{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int element;
        ArrayList<Integer> array = new ArrayList<Integer>();
        int n = read.nextInt();
        System.out.println("Type the elements of array");
        for(int i=0; i<n; i++){
            element = read.nextInt();
            array.add(element);
        }
        int highest = array.get(0);
        for(int j=0; j<array.size(); j++){
            if(array.get(j) > highest){
                highest = array.get(j);
            }
        }
        System.out.println(highest);
    }
}

//O(n)
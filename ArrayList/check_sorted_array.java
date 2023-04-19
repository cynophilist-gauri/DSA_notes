import java.util.*;
class check_sorted {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean flag = true;
        int element;
        ArrayList<Integer> array = new ArrayList<Integer>();
        int n = read.nextInt();
        for(int j=0; j<n; j++){
    		    element = read.nextInt();
    		    array.add(element);
		    }
        for(int i=1; i<=array.size(); i++){
            if( array.get(i) < array.get(i-1)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}

//O(n)

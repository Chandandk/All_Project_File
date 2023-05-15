package collection_frame;
import java.util.ArrayList;
import java.util.Collections;

public class DSA {
    public static void main(String[] args) {
     ArrayList<Integer> list= new ArrayList<>();

// add number
 list.add(50);
 list.add(20);
 list.add(10);
 list.add(0,90);
 System.out.println(list);

 // to get the element at index 3
 int d=list.get(3);
 System.out.println(d);

 // check element present in array list
 boolean g=list.contains(40);
System.out.println(g);

// size of array
int size=list.size();
System.out.println(size);

//remove 90 in the list
list.remove(0);
System.out.println(list);

// using loop function
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i));
}

//sorting
System.out.println();
Collections.sort(list);
System.out.println(list);
    }
} 
       

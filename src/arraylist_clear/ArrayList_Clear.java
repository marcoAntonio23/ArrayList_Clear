
package arraylist_clear;

import java.util.ArrayList;

public class ArrayList_Clear {

    public static void main(String[] args) {
         ArrayList<Integer> arrlist = new ArrayList<>(5);
          arrlist.add(20);
          arrlist.add(30);
          arrlist.add(10);
          arrlist.add(50);
          for (Integer number : arrlist) {
               System.out.println("Number = " + number);
          }  
          int retval = arrlist.size();
          System.out.println("La lista contiene "+ retval +" elementos");
          System.out.println("Aplicando la operacion ArrayList.Clear !!");
          arrlist.clear();
          retval = arrlist.size();
          System.out.println("La lista consise "+ retval +" elementos");
    }
    
}

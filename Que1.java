import java.util.*;
 class Que1 {
  public static void main(String[] args) {
     
        HashSet<String> H1 = new HashSet<String>(); // First empty HashSet

          // use add() method to add values in the hash set
          H1.add("wedges");
          H1.add("Ballerinas");
          H1.add("pumps");
          H1.add("trainers");
          System.out.println("\nFirst HashSet content: "+H1);

          //Second Empty HashSet
          HashSet<String>H2 = new HashSet<String>();
          H2.add("boots");
          H2.add("stilletoes");
          H2.add("gladiators");
          H2.add("flip flops");
          System.out.println("\nSecond HashSet content: "+H2);
          
          //Retain Elements
          H1.retainAll(H2);
          System.out.print("\nHashSet content:");
          System.out.print(H1);
     }
}
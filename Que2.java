import java.util.*;
class Ques2 {
  public static void main(String args[]) {
  HashMap<Integer,String> H1= new HashMap<Integer,String>();
  H1.put(1, "pumps");
  H1.put(2, "peeptoes");
  H1.put(3, "stilletoes");
  H1.put(4, "kittens");

   for(Map.Entry x:H1.entrySet()){
   System.out.println(x.getKey()+" "+x.getValue());
}
}
}
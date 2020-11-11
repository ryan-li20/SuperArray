import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    angriTests();
  }
  public static void doneTests(){
    SuperArray colours = new SuperArray();
    System.out.println();
    System.out.println("Size tests");
    colours.add("blueu");
    System.out.println(colours.size() == 1);
    System.out.println();
    System.out.println("Get tests");
    colours.add("orangeu");
    colours.add("redu");
    colours.add("pinku");
    colours.add("blacku");//{blueu, orangeu, redu, pinku, blacku}
    System.out.println(colours.get(3).equals("pinku"));
    System.out.println(colours.get(2).equals("redu"));
    System.out.println();
    System.out.println("Set tests");
    colours.set(1, "greenu");
    colours.set(0, "brownu");//brownu, greenu, redu, pinku,blacku
    System.out.println(colours.get(1).equals("greenu"));
    System.out.println(colours.get(0).equals("brownu"));
    System.out.println();
    System.out.println("isEmpty tests");
    SuperArray nothing = new SuperArray();
    System.out.println(nothing.isEmpty());
    System.out.println(!(colours.isEmpty()));
    nothing.add("something");
    System.out.println(!(nothing.isEmpty()));
    nothing.clear();
    System.out.println(nothing.isEmpty());
    System.out.println();
    System.out.println("Contains tests");
    System.out.println(colours.contains("pinku"));
    System.out.println(colours.contains("brownu"));
    System.out.println(colours.contains("greenu"));
    System.out.println(colours.contains("redu"));
    System.out.println(colours.contains("blacku"));
    System.out.println();
    System.out.println("OverAdd test");
    colours.add(0, "yellowu");
    colours.add(3, "purpleu");//yellowu, brownu, greenu, purpleu, redu, pinku, blacku
    System.out.println(colours.toString().equals("[yellowu, brownu, greenu, purpleu, redu, pinku, blacku]"));
    System.out.println();
    System.out.println("Remove test");
    System.out.println(colours.remove(2).equals("greenu"));
    System.out.println(colours.remove(4).equals("pinku"));//yellowu, brownu, purpleu, redu, blacku
    System.out.println(colours.remove(4).equals("blacku"));//new testing
    System.out.println(colours.remove(0).equals("yellowu"));
    System.out.println(colours.toString().equals("[brownu, purpleu, redu]"));
    System.out.println(colours.toString());
    System.out.println();
    System.out.println("indexOf tests");
    System.out.println(colours.indexOf("brownu") == 0);
    System.out.println(colours.indexOf("redu") == 2);
    System.out.println(colours.indexOf("Ok") == -1);
    System.out.println();
    System.out.println("toArray test");
    System.out.println(!(colours.toArray() == colours.toArray()));
    System.out.println(Arrays.toString(colours.toArray()).equals("[brownu, purpleu, redu]"));
  }

  public static void angriTests(){
    System.out.println();
    SuperArray things = new SuperArray();
    things.add("thing1");
    try{
      SuperArray thing = new SuperArray(-3);
    }
    catch(IllegalArgumentException e){
      System.out.println("Good job! You broke it successfully");
    }
    try{
      things.remove(3);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Good job! You broke it successfully");
    }
    try {
      things.set(4, "hi");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Good job! You broke it successfully");
    }
    try {
      things.add(4, "hi");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Good job! You broke it successfully");
    }
    try{
      things.get(4);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Good job! You broke it successfully");
    }
  }
}

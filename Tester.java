public class Tester{
  public static void main(String[] args){
    SuperArray colours = new SuperArray();
    //old stuff is HERE, up to remove(int index)
    // words.add("kani");
    // words.add("uni");
    // words.add("ebi");
    // for(int i = 0; i < words.size(); i++){
    //   System.out.println(words.get(i));
    // }
    //
    // System.out.println(words.set(1, "tato"));
    // System.out.println();
    //
    //
    // System.out.println("New Tests");
    // System.out.println(!(words.isEmpty()));
    // System.out.println(words.toString());
    // System.out.println(words.contains("kani"));
    // words.clear();
    // System.out.println(words.isEmpty());
    // System.out.println(words.toString());
    // System.out.println(!(words.contains("hi")));
    // System.out.println();
    // System.out.println(words.toString());
    // words.add(0, "hi");
    // System.out.println(words.toString());
    // System.out.println();
    //
    // words.add(0, "Hey");
    // System.out.println(words.toString());
    // words.add(0, "Hello");
    // System.out.println(words.toString());
    // words.add(0, "Howdy");
    // System.out.println(words.toString());
    // words.add(0, "Howyadoin");
    // System.out.println(words.toString());
    // System.out.println(words.remove(2));
    // System.out.println(words.toString());

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
    System.out.println(colours.toString().equals("[yellowu, brownu, purpleu, redu, blacku]"));

    System.out.println();
    System.out.println("indexOf tests");
    System.out.println(colours.indexOf("yellowu") == 0);
    System.out.println(colours.indexOf("purpleu") == 2);
    System.out.println(colours.indexOf("Ok") == -1);

    System.out.println();
    System.out.println("toArray test");
    System.out.println(!(colours.toArray() == colours.toArray()));
    System.out.println(Tester.toString(colours.toArray()).equals("[yellowu, brownu, purpleu, redu, blacku]"));
  }

  public static String toString(String[] arr){
    if(arr.length == 0){
      return "[]";
    }
    String output1 = "[" + arr[0];
    for(int i = 1; i < arr.length; i++){
      output1 = output1 + ", " + arr[i];
    }
    return output1 + "]";
  }
}

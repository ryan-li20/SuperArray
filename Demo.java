public class Demo{
  public static void removeDuplicates(SuperArray s){
    SuperArray once = new SuperArray();
    if(s.size() == 0){
      return;
    }
    for(int i = 0; i < s.size(); i++){
      if(once.contains(s.get(i))) {
        s.remove(i);
        i = i-1;
      }
      else{
        once.add(s.get(i));
      }
    }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}

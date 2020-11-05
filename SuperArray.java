public class SuperArray{
  private String[] data;
  private int size;

  private void resize(){
    String[] newguy = new String[data.length * 2];
    for(int i = 0; i < data.length; i++){
      newguy[i] = data[i];
    }
    data = newguy;
  }

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size == data.length){
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void clear(){
    size = 0;
    data = new String[10];
  }

  public boolean contains(String s){
    if (isEmpty()){
      return false;
    }
    for(int i = 0; i < size; i++){
      if(data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public String toString(){
    if(isEmpty()){
      return "[]";
    }
    String output1 = "[" + data[0];
    for(int i = 1; i < size; i++){
      output1 = output1 + ", " + data[i];
    }
    return output1 + "]";
  }

  public void add(int index, String element){
    if(size == data.length){
      resize();
    }
    if(size < index){
      return;
    }
    for(int i = size; i > index; i--){
      data[i] = data[i-1];
    }
    data[index] = element;
    // if(size == 0){
    //   add(element);
    // }

    size++;
  }

  public String remove(int index){
    String temp = data[index];
    for(int i = index; i < size-1; i++){
      resize();
      data[i] = data[i+1];
    }
    size--;
    return temp;
  }

  public int indexOf(String s){
    if (isEmpty()){
      return -1;
    }
    for(int i = 0; i < size; i++){
      if(data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] guy = new String[size];
    for(int i = 0; i < size; i++){
      guy[i] = data[i];
    }
    return guy;
  }

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
}

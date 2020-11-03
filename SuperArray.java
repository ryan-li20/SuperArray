public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
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

  private void resize(){
    String[] newguy = new String[data.length + 10];
    for(int i = 0; i < data.length; i++){
      newguy[i] = data[i];
    }
    data = newguy;
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
}

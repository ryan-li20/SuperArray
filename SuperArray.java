public class SuperArray{
  private String[] data;
  private int size;

  private void resize(){
    String[] newguy = new String[(size+1)*2];
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
    if(initialCapacity < 0){
      throw new IllegalArgumentException("Capacity" + initialCapacity + "cannot be negative");
    }
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
    if(index < 0){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be negative");
    }
    if(index >= size){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be greater than array length");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be negative");
    }
    if(index >= size){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be greater than array length");
    }
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
    if(index < 0){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be negative");
    }
    if(index > size){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be greater than array length");
    }
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
    if(index < 0){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be negative");
    }
    if(index >= size){
      throw new IndexOutOfBoundsException("Index" +index+ "cannot be greater than array length");
    }
    String temp = data[index];
    for(int i = index; i < size-1; i++){
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

  public int lastIndexOf(String value){
    if(isEmpty()){
      return -1;
    }
    int last = -1;
    for(int i = 0; i < size; i++){
      if(data[i].equals(value)){
        last = i;
      }
    }
    return last;
  }

  public boolean equals(SuperArray other){
    if(other.size() != this.size()){
      return false;
    }
    if(this.size() == 0){
      return false;
    }
    for(int i = 0; i < this.size(); i++){
       if(other.get(i) != this.get(i)){
         return false;
       }
    }
    return true;
  }
}

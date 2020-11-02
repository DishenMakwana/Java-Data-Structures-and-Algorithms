import java.util.*;
public class HashCodeAndEquals {
  
  public static void main(String[] args) {
    
    Pen pen1 = new Pen(10, "blue");
    Pen pen2 = new Pen(10, "blue");
    
    System.out.println(pen1);
    System.out.println(pen2);
    
//    System.out.println(pen1.equals(pen2));
    
    Set<Pen> pens = new HashSet<>();
    pens.add(pen1);
    pens.add(pen2);
    
    System.out.println(pens);
  }

}

class Pen {
  
  int price;
  String color;
  
  public Pen(int price, String color) {
    this.price = price;
    this.color = color;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + price;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pen other = (Pen) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (price != other.price)
      return false;
    return true;
  }
  
}

public class MainClass {
  
  public static void main(String[] args) {
  
//    Map<String, Integer> numbers = new HashMap<>();
//  
//    numbers.put("one", 1);
//    numbers.put("two", 2);
//    numbers.put("five", 5);
//    
//    numbers.remove("two", 4);
//    
//    System.out.println(numbers);
//    System.out.println(numbers.keySet());
//    System.out.println(numbers.values());
//    System.out.println(numbers.entrySet());
//    
//    Set<Entry<String, Integer>> entries = numbers.entrySet();
//    
//    for(Entry<String, Integer> entry: entries) {
//      entry.setValue(entry.getValue() * 100);
//    }
//    
//    System.out.println(numbers);
    
    System.out.println(getHash("GOD"));
  }
  
  public static int getHash(String s) {
    int hash = 0;
    for(int i = 0; i<s.length(); i++) {
      hash += s.charAt(i);
    }
    return hash;
  }
}
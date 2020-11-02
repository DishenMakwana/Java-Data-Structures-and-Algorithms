import java.util.*;

class Pen 
{
  int price;
  String color;
  public Pen(int price,String color) 
  {
     this.price=price;
     this.color=color;
  } 
  
  @Override
  public boolean equals(Object obj) 
  {
     Pen that = (Pen) obj;
     boolean isEqual = this.price==that.price && this.color.equals(that.color);
     return isEqual;
  }
  
  @Override
  public int hashCode() 
  {
    return price + color.hashCode();
  }
}

 class Dcoder
 {
   public static void main(String args[])
   { 
     Pen p1 = new Pen(10,"blue");
     Pen p2 = new Pen(10,"blue");
     System.out.println(p1.equals(p2));
     Set<Pen> pens=new HashSet<>();
     pens.add(p1);
     pens.add(p2);
     System.out.println(pens);
   }
 }
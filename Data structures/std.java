import java.util.*;

 public class student /*implements Comparable<student>*/
 {
   int marks;
   String name;
   student(int marks,String name) 
   {
     this.marks = marks;
     this.name = name;
   } 
   public String toString() 
   {
     return "Student [marks=" + marks + ", name=" + name + "]";
   } 
   public int compareTo(student obj) 
   {
      if(this.marks > obj.marks) return -1;
      else if(this.marks < obj.marks) return 1;
      return this.name.compareTo(obj.name);
   }
 }
 
 public class Main
 {
   public static void main(String args[])
   { 
     List<student> student = new ArrayList<>();
     student.add(new student(23,"Ram"));
     student.add(new student(35,"Shyam"));
     student.add(new student(83,"Aman"));
     student.add(new student(13,"Rohit"));
     student.add(new student(65,"Anuj"));
     
    /* Collections.sort(student,new Comparator<student>()
       {
          public int compare(student o1,student o2)
          {
            if(o1.name.equals(o2.name))
            {
               return o1.marks - o2.marks ;
            }
            else 
               return o1.name.compareTo(o2.name);
          }
       });
       */
     Collections.sort(student, (o1,o2) -> o1.name.compareTo(o2.name) );
     //Collections.sort(student, Comparator.comparing(student::getName)).thenComparing(student.getMarks).reversed();
     student.forEach(System.out::println);
   }
 }
 
/* class SortByName implements Comparator<student> 
 {
    public int compare(student o1,student o2)
    {
       if(o1.name.equals(o2.name))
       {
          return o1.marks - o2.marks ;
       }
       else 
          return o1.name.compareTo(o2.name);
    }
 }*/

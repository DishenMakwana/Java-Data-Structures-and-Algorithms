import java.util.*;

public class Student {

  int marks;
  String name;

  public Student(int marks, String name) {
    super();
    this.marks = marks;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [marks=" + marks + ", name=" + name + "]";
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int compareTo(Student obj) {
    return this.marks - obj.marks;
  }
}


public class MainClass {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student(23, "Ram"));
    students.add(new Student(35, "Shaym"));
    students.add(new Student(83, "Aman"));
    students.add(new Student(13, "Rohit"));
    students.add(new Student(65, "Anuj"));

//    Collections.sort(students); // It accept a List type argument which must extends comparable

    students.forEach(System.out::println); // LAMBDA FUNCTION

    Collections.sort(students, new SortByNameThenMarks());
    students.forEach(System.out::println); // LAMBDA FUNCTION

    Collections.sort(students, new Comparator<Student>() {

      @Override
      public int compare(Student o1, Student o2) {
        if (o1.name.equals(o2.name)) {
          return o1.marks - o2.marks;
        } else {
          return o1.name.compareTo(o2.name);
        }

      }

    });

    Collections.sort(students, (o1, o2) -> {

      if (o1.name.equals(o2.name)) {
        return o1.marks - o2.marks;
      } else {
        return o1.name.compareTo(o2.name);
      }
    });

    // IF WE WISH TO SORT IT ACCORDING TO NAME ONLY
    Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));

    // IF WE WISH TO SORT BY NAME USING KEY EXTRACTOR
    Collections.sort(students, Comparator.comparing(Student::getName)); // Comparator.comparing(keyExtractor)

    // IF WE WISH TO SORT BY NAME THEN MARKS
    Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

    // IF WE WANT TO REVERSE THE DEFINED SORTING ORDER WE CAN USE "reversed"    
    Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
  }

}

// COMPARATORS CLASS
class SortByNameThenMarks implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.name.equals(o2.name)) {
      return o1.marks - o2.marks;
    } else {
      return o1.name.compareTo(o2.name);
    }

  }

}

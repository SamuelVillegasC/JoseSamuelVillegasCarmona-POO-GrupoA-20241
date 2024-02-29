public class Person {
    public static void main(String[] args) {
      person pers1 = new person ("Jose",22,"Male");
      System.out.println (pers1.name);
      System.out.println(pers1.age);
      System.out.println(pers1.gender);
      System.out.println("______");
        person pers2 = new person ("Sarahi",19,"Female");
      System.out.println(pers2.name);
      System.out.println(pers2.age);
      System.out.println(pers2.gender);
      System.out.println("_______");
      person pers3 = new person ("Ricardo",35,"Male");
      System.out.println(pers3.name);
      System.out.println(pers3.age);
      System.out.println(pers3.gender);
      System.out.println("_______");
      person pers4 =new person ("Ana",47,"Female");
      System.out.println(pers4.name);
      System.out.println(pers4.age);
      System.out.println(pers4.gender);
    }
  
    
  }
  class person{
    String name;
    int age;
    String gender;
    public person (String name, int age, String gender){
      this.name = name;
      this.age = age;
      this.gender = gender;
      
    }
  }
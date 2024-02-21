public class libros {
    public static void main(String[] args) {
      libro libro1 = new libro ();
      System.out.println(libro1.title);
      System.out.println(libro1.author);
      System.out.println(libro1.year);
      System.out.println("______");
      libro libro2 = new libro ("El principito","Samuel Villegas",1943);
      System.out.println(libro2.title);
      System.out.println(libro2.author);
      System.out.println(libro2.year);
      System.out.println("______");
      libro libro3 = new libro ("Habitos Atomicos","Jean Paul",2020);
      System.out.println(libro3.title);
      System.out.println(libro3.author);
      System.out.println(libro3.year);
      System.out.println("______");
      libro libro4 = new libro ("El cuervo","Edgar Allan Poe",1975);
      System.out.println(libro4.title);
      System.out.println(libro4.author);
      System.out.println(libro4.year);
      System.out.println("______");
      
    }
  
  }
  class libro{
    String title = "La Odisea";
    String author = "Homero";
    int year = 1928;
  }
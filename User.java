import java.util.ArrayList;
import java.util.Scanner;
public class User {
    private String name;
    private String LastName;
    private ArrayList<Books> BkRented = new ArrayList<Books>();
    private boolean hasRented;

    public User(String name, String lastName) {
        this.name = name;
        this.LastName = LastName;
    }

    public void rentBook(ArrayList<Books> library){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("\t****LISTA DE LIBROS****");
        for (Books libros: library){
            System.out.println(i+". Libro: "+libros.getname());
          System.out.println("Autor: "+libros.getauthor());
            i++;
        }
        System.out.println("Ingresa el numero del libro que deseas rentar: ");
        int index = sc.nextInt();
        if (library.get(index).isRented()) {
            System.out.println("El libro seleccionado se encuentrea rentado");
            return;
        }
        library.get(index-1).setRented(true);
        library.get(index-1).setuser(this.name);
        this.BkRented.add(library.get(index-1));
        this.hasRented = true;
        System.out.println(name+" ha rentado: "+library.get(index-1).getname()+" correctamente");
    }

    public void returnBook(Library library){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        if (this.BkRented.isEmpty()) {
            System.out.println("Aun no renta libros");
            return;
        }
        System.out.println("Ingrese el numero del libro que desea devolver:");
        for(Books libros : this.BkRented){
            System.out.println("ID: "+i+" | Libro: "+libros.getname()+" | Autor: "+libros.getauthor());
        }
        int id = sc.nextInt();
        library.getBooks().get(id-1).setRented(false);
        library.getBooks().get(id-1).setUser("");
        this.BkRented.remove(id-1);
        if (this.  BkRented.isEmpty()) {
            this.hasRented = false;
        }
        System.out.println("Libro devuelto, gracias "+library.getBooks().get(id-1).getName());
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isHasRented() {
        return hasRented;
    }

    public ArrayList<Books> getBkRented() {
        return BkRented;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
public class Library {
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Books> books = new ArrayList<Books>();

    public void printUsers(){
        int i = 1;
        String hasRented = "";
        if (users.isEmpty()){
            System.out.println("Aun no se registran usuarios");
            return;
        }
        System.out.println("\t****LISTA DE USUARIOS****");
        for (User usuarios: this.users){
            if (usuarios.isHasRented()) {
                hasRented = "Si";
            } else {
                hasRented = "No";
            }
            System.out.println("ID: "+i);
           System.out.println("Nombre: "+usuarios.getName()+ " " +usuarios.getLastName());
          System.out.println("Ha rentado: "+hasRented);
            i++;
        }
        System.out.println();
    }

    public void printBooks(){
        int i = 1;
        String isRented = "";
        if (books.isEmpty()){
            System.out.println("Sin libros registrados");
            return;
        }
        System.out.println("\t****LISTA DE LIBROS****");
        for (Books libros: this.books){
            if (libros.isRented()) {
                isRented = "Si";
            } else {
                isRented = "No";
            }
            System.out.println(i+". Libro: "+libros.getName());
          System.out.println(" Autor: "+libros.getAuthor());
          System.out.println(" Esta rentado: "+isRented);
            i++;
        }
        System.out.println();
    }

    public void printRentedBooks(){
        int i = 1;
        int c = 0;
        for (Books libros: this.books){
            if (libros.isRented()) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("No hay libros rentados\n");
            return;
        }
        System.out.println("\t****LISTA DE LIBROS RENTADOS****");
        for (Books libros: this.books){
            if (libros.isRented()) {
                System.out.println(i + ". Libro: " + libros.getName());
              Syste.out.println(" Autor: " + libros.getAuthor());
              System.out.println("Rentado por: "+libros.getUser());
              
                i++;
            }
        }
        System.out.println();
    }
    public void printUsersWithBooks(){
        int i = 1;
        int c = 0;
        for (User usuarios: this.users){
            if (usuarios.isHasRented()) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Ningun usuarios tiene libros\n");
            return;
        }
        System.out.println("\t*****LISTA DE USUARIOS QUE HAN RENTADO*****");
        for (User usuarios: this.users){
            if (usuarios.isHasRented()) {
                System.out.println(i + ". Nombre: " + usuarios.getName() + " " + usuarios.getLastName());
                System.out.println("\tLibros que ha rentado "+usuarios.getName()+": ");
                for (Books libros : usuarios.getBooksRented()){
                    System.out.println("\t\tLibro: " + libros.getName() + " | Autor: " + libros.getAuthor());
                }
                i++;
            }
        }
        System.out.println();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library libreria = new Library();
        User u1 = new User("Sam", "Villegas");
      User u2 = new User("Josue", "Garcia");
        libreria.getUsers().add(u1);
        Books b1 = new Books("Maze Runner", "Dylan Raya", "Sam");
        libreria.getBooks().add(b1);
        Books b2 = new Books("El Cuervo", "Allan Poe", "Sam");
        libreria.getBooks().add(b2);
        boolean flag1 = true;
        boolean flag = true;
        System.out.println("\t----BIENVENIDO AL MENU DE LA BIBLIOTECA----\n");
        while (flag1){
            System.out.println("_____________________");
            System.out.println("  Ingrese la opcion que desea realizar: ");
            System.out.println("\t1. Registrar Usuario");
            System.out.println("\t2. Registrar Libro");
            System.out.println("\t3. Iniciar Sesion");
            System.out.println("\t4. Listas");
            System.out.println("\t5. Cerrar programa");
            System.out.println("________________________\n");

            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Ingrese el nombre de usuario: ");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Ingrese el apellido del usuario: ");
                    String lastName = sc.nextLine();
                    User user = new User(name, lastName);
                    libreria.getUsers().add(user);
                    System.out.println("Usuario "+name+" "+lastName+" se ha registrado con exito ");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del libro: ");
                    String libro = sc.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String author = sc.nextLine();
                    Books newBook = new Books(libro, author);
                    libreria.getBooks().add(newBook);
                    break;

                case 3:
                    libreria.printUsers();
                    System.out.println("Ingrese su ID para iniciar sesion: ");
                    int logIn = sc.nextInt();
                    System.out.println("Bienvenido "+libreria.getUsers().get(logIn-1).getName()+"!");
                    flag = true;
                    while (flag) {
                        System.out.println("*********************");
                        System.out.println("  Que desea realizar: ");
                        System.out.println("\t1. Ver sus libros rentados");
                        System.out.println("\t2. Rentar un libro");
                        System.out.println("\t3. Devolver libro");
                        System.out.println("\t4. Cerrar sesion");
                        System.out.println("**********************");

                        int opt2 = sc.nextInt();

                        switch (opt2){
                            case 1:
                                System.out.println("*****LIBROS RENTADOS POR: "+libreria.getUsers().get(logIn-1).getName()+"*****");
                                for (Books books : libreria.getUsers().get(logIn-1).getBooksRented()){
                                    System.out.println("Libro: " + books.getname() + " Autor: " + books.getauthor());
                                }
                                System.out.println();
                                break;

                            case 2:
                                libreria.getUsers().get(logIn-1).rentBook(libreria.getBooks());
                                break;

                            case 3:
                                libreria.getUsers().get(logIn-1).returnBook(libreria);
                                break;

                            case 4:
                                flag = false;
                                break;

                            default:
                                System.out.println("Ingrese una opcion listada");
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Que lista desea ver: ");
                    System.out.println("1. Lista de libros");
                    System.out.println("2. Lista de usuarios");
                    System.out.println("3. Lista de libros rentados");
                    System.out.println("4. Lista de usuarios que han rentado");

                    int opt2 = sc.nextInt();

                    switch (opt2){
                        case 1:
                            libreria.printBooks();
                            break;

                        case 2:
                            libreria.printUsers();
                            break;

                        case 3:
                            libreria.printRentedBooks();
                            break;

                        case 4:
                            libreria.printUsersWithBooks();
                            break;

                        default:
                            System.out.println("Ingreso una opcion incorrecta, intente de nuevo");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Gracias por su preferencia, Adios!");
                    flag1 = false;
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta!");
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }
}

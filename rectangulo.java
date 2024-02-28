public class Rectangulo {

    public double perimetro(double base, double altura){
        return 2*(base + altura);
    }

    public int perimetro(int base, int altura){
        return 2*(base + altura);
    }

    public double area(double base, double altura){
        return base * altura;
    }

    public int area(int base, int altura){
        return base * altura;
    }
}

public class Hw5 {
    public static void main(String[] args) {

  System.out.println("\t\tClase Rectangulo: ");
      Rectangulo rec1 = new Rectangulo();
     System.out.println("Area enteros: "+rec1.area(11, 2));
        System.out.println("Perimetro enteros: "+rec1.perimetro(11, 2));

        Rectangulo rec2 = new Rectangulo();
        System.out.println("Area doubles: "+rec2.area(9.54, 8.13));
        System.out.println("Perimetro doubles: "+rec2.perimetro(9.54, 8.13));
}
}
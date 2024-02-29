public class rectangulo {

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

public class rectangulo{
    public static void main(String[] args) {

  System.out.println("\t\tClase Rectangulo: ");
      rectangulo rec1 = new rectangulo();
     System.out.println("Area enteros: "+rec1.area(8, 3));
        System.out.println("Perimetro enteros: "+rec1.perimetro(13, 9));

        rectangulo rec2 = new rectangulo();
        System.out.println("Area doubles: "+rec2.area(3.14, 6.13));
        System.out.println("Perimetro doubles: "+rec2.perimetro(4.44, 3.33));
}
}
public class rectangulos {
    public static void main(String[] args) {
      rectangulo rectangulo1 = new rectangulo (4,5);
      System.out.println(rectangulo1.base);
      System.out.println(rectangulo1.altura);
      System.out.println(rectangulo1.area);
      System.out.println("______");
      rectangulo rectangulo2 = new rectangulo (10,4);
      System.out.println(rectangulo2.base);
      System.out.println(rectangulo2.altura);
      System.out.println(rectangulo2.area);
      System.out.println("______");
      rectangulo rectangulo3 = new rectangulo (12,15);
      System.out.println(rectangulo3.base);
      System.out.println(rectangulo3.altura);
      System.out.println(rectangulo3.area);
      System.out.println("______");
      rectangulo rectangulo4 = new rectangulo (9,6);
      System.out.println(rectangulo4.base);
      System.out.println(rectangulo4.altura);
      System.out.println(rectangulo4.area);
    }
  }
  class rectangulo{
    double base;
    double altura;
    double area;
    double perimetro;
    public rectangulo (double base, double altura){
      this.base = base;
      this.altura = altura;
    }
    public double area(){
      area = base * altura;
      return area;
    }
    public double perimetro(){
      perimetro = (base * 2) + (altura * 2);
      return perimetro;
    }
  }
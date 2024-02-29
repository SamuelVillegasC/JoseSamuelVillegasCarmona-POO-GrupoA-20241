
public class product {

    private String name;
    private int stock;
    private double price;

    public void increaseStock(int stock) {
        if (stock <= 0) {
            System.out.println("Aumento de stock nulo o negativo");
        } else {
            this.stock += stock;
        }
    }

    public void reduceStock(int stock) {
        if (stock <= 0 || stock >= this.stock) {
            System.out.println("Reduccion de stock imposible");
        } else {
            this.stock -= stock;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("")) {
            System.out.println("    El nombre no puede estar vacio");
        } else {
            this.name = name;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("No puede haber stock negativo");
        } else {
            this.stock = stock;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("El precio no puede ser negativo");
        } else {
            this.price = price;
        }
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 0;
    }

    public product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

}

public class product {

    public static void main(String[] args) {
        product p1 = new product("Termo",35,20);
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getStock());
        
        p1.setStock(15);
        System.out.println("Nuevo stock: "+p1.getStock());
        
        product p2 = new product("Cuchara",10,60);
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getStock());
        p2.increaseStock(30);
        
        product p3 = new product("Vaso",25.50,10)
        System.out.println(p3.getName());
        System.out.println(p3.getPrice());
        System.out.println(p3.getStock());
        p3.increaseStock(5);
    }

}

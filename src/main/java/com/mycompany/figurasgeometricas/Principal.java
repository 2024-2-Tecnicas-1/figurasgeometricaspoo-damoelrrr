package FiguraGeometrica;

import java.util.Scanner;

/**
 *
 * @author Daniel Rodriguez
 */
// Clase base FiguraGeometrica
//contante
public class FiguraGeometrica {

    //Atributos 
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Getters y setters
    /**
     * Obtiene el nombre de la figura. Complejidad temporal: O(1) Tiempo
     * constante.
     */
    public String getnombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la figura. Complejidad temporal: O(1) Tiempo
     * constante.
     */
    public void setNombre() {
        this.nombre = nombre;

    }

    /**
     * Obtiene el color de la figura. Complejidad temporal: O(1) Tiempo
     * constante.
     */
    public String getcolor() {
        return color;
    }

    /**
     * Establece el color de la figura. Complejidad temporal: O(1) Tiempo
     * constante.
     */
    public void setcolor() {
        this.color = color;
    }

    public int obtenerArea() {
        return 0;
    }

    public int obtenerPerimetro() {
        return 0;
    }
// Clase Circulo que hereda de FiguraGeometrica

    public static class Circulo extends FiguraGeometrica {

        private double radio;

        public Circulo(String nombre, String color, double radio) {
            super(nombre, color);
            this.radio = radio;
        }
        // Getter y setter para radio

        /**
         * Obtiene el radio del círculo. Complejidad temporal: O(1) Tiempo
         * constante.
         */
        public double getRadio() {
            return radio;
        }

        /**
         * Establece el radio del círculo. Complejidad temporal: O(1) Tiempo
         * constante.
         */
        public void setRadio(double radio) {
            this.radio = radio;
        }

        // Implementación de los métodos abstractos
        /**
         * Calcula el área del círculo. Fórmula: π * radio^2 Complejidad
         * temporal: O(1) Tiempo constante.
         */
        public int obtenerArea() {
            return (int) Math.round(Math.PI * Math.pow(radio, 2));

        }

        /**
         * Calcula el perímetro del círculo. Fórmula: 2 * π * radio Complejidad
         * temporal: O(1) Tiempo constante.
         */
        public int obtenerPerimetro() {
            return (int) Math.round(2 * Math.PI * radio);

        }

    }

    public static class Rectangulo extends FiguraGeometrica {

        private double lado1;
        private double lado2;

        public Rectangulo(String nombre, String color, double lado1, double lado2) {
            super(nombre, color);
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
        // Getters y setters para los lados

        /**
         * Obtiene el valor del lado 1 del rectángulo. Complejidad temporal:
         * O(1) Tiempo constante.
         */
        public double getLado1() {
            return lado1;
        }

        /**
         * Establece el valor del lado 1 del rectángulo. Complejidad temporal:
         * O(1) Tiempo constante.
         */
        public void setLado1(double lado1) {
            this.lado1 = lado1;
        }

        /**
         * Obtiene el valor del lado 2 del rectángulo. Complejidad temporal:
         * O(1) Tiempo constante.
         */
        public double getLado2() {
            return lado2;
        }

        /**
         * Establece el valor del lado 2 del rectángulo. Complejidad temporal:
         * O(1) Tiempo constante.
         */
        public void setLado2(double lado2) {
            this.lado2 = lado2;
        }
// Complejidad temporal: O(1) Tiempo constante.

        public int obtenerArea() {
            return (int) (lado1 * lado2);

        }
//Complejidad temporal: O(1) Tiempo constante.

        public int obtenerPerimetro() {
            return (int) (2 * (lado1 + lado2));

        }

    }

    public static class Triangulo extends FiguraGeometrica {

        private double base;
        private double altura;

        public Triangulo(String nombre, String color, double base, double altura) {
            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }
//Complejidad temporal: O(1) Tiempo constante.

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public int obtenerArea() {
            return (int) ((base * altura) / 2);
        }

        public int obtenerPerimetro() {
            return (int) (3 * base);

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String nombre = s.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = s.nextLine();
        System.out.println("Ingrese el tipo de figura(1: Circulo, 2: Rectángulo, 3: Triángulo)");
        int tipo = s.nextInt();

        FiguraGeometrica figura = null;

        switch (tipo) {
            case 1:
                System.out.println("ingrese el radio del circulo");
                double radio = s.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo”");
                double lado1 = s.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = s.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese la base del triángulo:");
                double base = s.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double altura = s.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                break;
        }
        if (figura != null) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }

    }

}

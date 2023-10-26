public class Rectangulo extends FiguraGeometrica {
    private final double lado1; // Atributo privado para el primer lado del rectángulo
    private final double lado2; // Atributo privado para el segundo lado del rectángulo

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color); // Llama al constructor de la clase base con nombre y color (Complejidad O(1))
        this.lado1 = lado1; // Asigna el valor del primer lado (Complejidad O(1))
        this.lado2 = lado2; // Asigna el valor del segundo lado (Complejidad O(1))
    }

    public double obtenerArea() {
        // Implementación específica para el rectángulo: área = lado1 * lado2 (Complejidad O(1))
        return lado1 * lado2;
    }

    public double obtenerPerimetro() {
        // Implementación específica para el rectángulo: perímetro = 2 * (lado1 + lado2) (Complejidad O(1))
        return 2 * (lado1 + lado2);
    }
}

public class Triangulo extends FiguraGeometrica {
    private final double base; // Atributo privado para la base del triángulo
    private final double altura; // Atributo privado para la altura del triángulo

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color); // Llama al constructor de la clase base con nombre y color (Complejidad O(1))
        this.base = base; // Asigna el valor de la base (Complejidad O(1))
        this.altura = altura; // Asigna el valor de la altura (Complejidad O(1))
    }

    public double obtenerArea() {
        // Implementación específica para el triángulo: área = (base * altura) / 2.0 (Complejidad O(1))
        return (base * altura) / 2.0;
    }

    public double obtenerPerimetro() {
        // Implementación específica para el triángulo
        // Para calcular el perímetro, necesitarías conocer el tipo de triángulo (equilátero, isósceles, escaleno).
        // Supongamos que es un triángulo equilátero en este ejemplo.

        double hipotenusa = Math.sqrt(base * base + altura * altura); // Cálculo de la longitud de la hipotenusa (Complejidad O(1))
        return 3 * hipotenusa; // Perímetro de un triángulo equilátero (Complejidad O(1))
    }
}

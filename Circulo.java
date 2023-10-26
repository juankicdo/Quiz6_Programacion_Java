public class Circulo extends FiguraGeometrica {
    private double radio; // Atributo privado para el radio del círculo

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color); // Llama al constructor de la clase base FiguraGeometrica con los valores nombre y color. Complejidad O(1).
        this.radio = radio; // Asigna el valor del radio proporcionado al atributo privado radio. Complejidad O(1).
    }

    public void setRadio(double radio) {
        this.radio = radio; // Asigna el valor del radio proporcionado al atributo privado radio. Complejidad O(1).
    }

    public double obtenerArea() {
        return Math.PI * radio * radio; // Calcula el área del círculo utilizando la fórmula matemática. Complejidad O(1).
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio; // Calcula el perímetro del círculo utilizando la fórmula matemática. Complejidad O(1).
    }
}

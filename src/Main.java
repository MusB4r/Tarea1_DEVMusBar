public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = sumar(a, b, c);
        System.out.println("La suma de los tres números es: " + sum);

        Coche miCoche = new Coche(3);
        miCoche.addPuerta();
        int numPuertas = miCoche.getNpuertas();
        System.out.println("\nEl coche tiene " + numPuertas + " puertas.");
    }

    public static int sumar(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}


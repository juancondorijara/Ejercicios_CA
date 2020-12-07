public class Calculadora {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ing. el 1er. nro");
        int nro1 = lectura.nextInt();

        System.out.println("Ing. el 2do. nro");
        int nro2 = lectura.nextInt();

        System.out.println("El operador: 1-suma, 2-resta, 3-multi, 4-divi");
        int operador = lectura.nextInt();

        switch (operador) {
            case 1: System.out.println("La suma es: " + (nro1 + nro2)); break;
            case 2: System.out.println("La resta es: " + (nro1 - nro2)); break;
            case 3: System.out.println("La multi es: " + (nro1 * nro2)); break;
            case 4: System.out.println("La divi es: " + (nro1 / nro2)); break;
            default: System.out.println("Escoge 1,2,3 o 4 | No seas menso");
        }

    }
public class PrimosPerfectos2 {
    public static void main(String[] args) {
        
        System.out.println("Nros. primos y perfectos");        
        Scanner leer = new Scanner(System.in);
        // Nro. primo: 2 divisores: 1 y el nro. | 19: 1 , 19
        // Nro. perfecto: suma divisores = nro | 6 = 1 + 2 + 3
        System.out.println("Ingresa el nro");
        int nro = leer.nextInt();
        int cantDiv=1,sumDiv = 0;
        
        for (int i = 1; i < nro; i++) { // i = i + 1
            if (nro % i == 0) { // residuo cero para ser divisible
                cantDiv += 1; // cantDiv = cantDiv + 1
                sumDiv += i; // sumDiv = sumDiv + i
            }
        }
        if (cantDiv == 2) {
            System.out.println("esto es un nro. primo");
        } else {
            System.out.println("No es primo");
        }
        if (sumDiv == nro){
            System.out.println("Es perfecto");      
        }else{
            System.out.println("No eres perfecto");      
        }    

    }
}
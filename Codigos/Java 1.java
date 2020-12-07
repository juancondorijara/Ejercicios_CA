public class Java1 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
        String alumno;
        double notafinal;
        double np;
        double npro;
        double nt;
        System.out.println(“Introduce el nombre del alumno”);
        alumno=bufEntrada.readLine();
    
        while (!alumno.equals(“”)) {
        System.out.println(“Introduce la nota practica”);
        np=Double.parseDouble(bufEntrada.readLine());
        System.out.println(“Introduce la nota de problemas”);
        npro=Double.parseDouble(bufEntrada.readLine());
        System.out.println(“Introduce la nota de teoria”);
        nt=Double.parseDouble(bufEntrada.readLine());
    
        if ((np<=10 && np>=0) && (npro<=10 && npro>=0) && (nt<=10 && nt>=0)) {
            System.out.println(“El alumno “+alumno);
            System.out.println(“La nota practica es “+np);
            System.out.println(“La nota de problemas es “+npro);
            System.out.println(“La nota de teoria es “+nt);
            np=np*0.1;
            npro=npro*0.5;
            nt=nt*0.4;
            notafinal=np+npro+nt;
    
        System.out.println(“La nota final es “+notafinal);
    } else {
        System.out.println(“Has escrito una nota incorrecta, vuelve a intentarlo”);
    }
        System.out.println(“Introduce el nombre de otro alumno”);
        alumno=bufEntrada.readLine();
    
    }
    
    }
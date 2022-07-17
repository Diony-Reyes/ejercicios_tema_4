public class Main {
    public static void main(String[] args) {
        numeroIf();
        numeroWhile();
        numeroDo();
        numeroFor();
        estacion("verano");
    }

    public static void numeroIf() {
        int numeroIf = 0;

        if(numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        } else if(numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println("numeroIf es 0");
        }
    }

    public static void numeroWhile() {
        int numeroWhile = 0;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile igual a " + numeroWhile);
        }
    }

    public static void numeroDo() {
        int numeroDo = 2;

        do {
            numeroDo++;
            System.out.println("numeroDo igual a " + numeroDo);
        } while (numeroDo < 3);
    }

    public  static void numeroFor() {
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor es igual a " + numeroFor);
        }
    }

    public static void estacion(String estacion) {
        String textoBase = "Estamos en ";

        switch (estacion.toLowerCase()) {
            case "primavera":
                textoBase = textoBase + "Primavera";
                break;
            case "verano":
                textoBase = textoBase + "Verano";
                break;
            case "otoño":
                textoBase = textoBase + "Otoño";
                break;
            case "invierno":
                textoBase = textoBase + "Invierno";
                break;
            default:
                textoBase = estacion + " no es una estación del año";
        }

        System.out.println(textoBase);
    }
}
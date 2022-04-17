public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(">>>control if");
        int numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("es positivo");
        }
        else if (numeroIf < 0) {
            System.out.println("es negativo");
        }
        else
            System.out.println("es cero");
        System.out.println(">>>control while");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println(">>>control do-while");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 4);
        System.out.println(">>>control for");
        int numeroFor;
        for (numeroFor=0;numeroFor<=3;numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println(">>>control switch");
        String estacion = "caca";
        switch(estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es ninguna estación");
        }
    }
}

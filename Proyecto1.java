package preWork.Proyecto1;

import java.util.Scanner;

public class Proyecto1 {
   private static final int minNuss = 100000, maxNuss = 999999, minOpcion = 0, maxOpcion = 3, minFiebre = 27,
            maxFiebre = 45, minProridad = 0, maxProridad = 5;

    private static final String[] sintomas = {"Dolor", "Lesion Traumatica", "Fiebre alta", "Confusion/Desorientacion"};
    private static final String[] exploDolor = {"Dolor torácico", "Dolor abdominal", "Dolor de cabeza", "Migraña"};
    private static final String[] exploLesionTrauma = {"Fractura ósea", "Herida de bala", "Quemadura", "Lesión cerebral traumática"};
    private static final String[] exploFiebre = {"Neumonía", "Meningitis", "Infección viral", "Reacción alérgica"};
    private static final String[] exploConfusion = {"Intoxicación por drogas o alcohol", "Deshidratación severa", "Accidente cerebrovascular", "Hipoglucemia severa"};

    private static int nuss;
    private static int opcionSintoma;
    private static int opcionExploracion;
    private static String exploracion = "";
    private static int fiebre;
    private static int prioridad;

   static int numeroValido(Scanner sc, int x, int y, String str) {
        int numIngresado = 0;
        boolean verificador = true;
        while (verificador) {
            System.out.println("Ingrese " + str + ":");
            if (sc.hasNextInt()) {
                numIngresado = sc.nextInt();
                if (numIngresado >= x && numIngresado <= y) {
                    verificador = false;
                } else {
                    System.out.println("Opción/número ingresado no válido.");
                }
            } else {
                System.out.println("Por favor, ingrese un número entre " + x + " y " + y + ".");
                sc.next();
            }
        }
        System.out.println(str + " ingresado/a es válido\n");
        return numIngresado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nuss = numeroValido(sc, minNuss, maxNuss, "NUSS");

        System.out.println("""
                Seleccione el número correspondiente a sus síntomas:
                0.Dolor
                1.Lesion Traumatica
                2.Fiebre alta
                3.Confusion o Desorientacion\n""");

        opcionSintoma = numeroValido(sc, minOpcion, maxOpcion, "opción");

        System.out.println("Ingrese tipo de exploración.");

        switch (opcionSintoma) {
            case 0:
                System.out.println("""
                        Seleccione exploración correspondiente: 
                        0.Dolor torácico
                        1.Dolor abdominal
                        2.Dolor de cabeza
                        3.Migraña\n""");
                opcionExploracion = numeroValido(sc, minOpcion, maxOpcion, "opción de exploración");
                exploracion = exploDolor[opcionExploracion];
                break;
            case 1:
                System.out.println("""
                        Seleccione exploración correspondiente: 
                        0.Fractura osea 
                        1.Herida de bala
                        2.Quemadura
                        3.Lesión cerebral traumática\n""");
                opcionExploracion = numeroValido(sc, minOpcion, maxOpcion, "opción de exploración");
                exploracion = exploLesionTrauma[opcionExploracion];
                break;
            case 2:
                System.out.println("""
                        Seleccione exploración correspondiente: 
                        0.Neumonía
                        1.Meningitis
                        2.Infección viral 
                        3.Reacción alérgica\n""");
                opcionExploracion = numeroValido(sc, minOpcion, maxOpcion, "opción de exploración");
                exploracion = exploFiebre[opcionExploracion];
                break;
            case 3:
                System.out.println("""
                        Seleccione exploración correspondiente: 
                        0.Intoxicación por drogas o alcohol 
                        1.Deshidratación severa
                        2.Accidente cerebrovascular
                        3.Hipoglucemia severa\n""");
                opcionExploracion = numeroValido(sc, minOpcion, maxOpcion, "opción de exploración");
                exploracion = exploConfusion[opcionExploracion];
                break;
        }

        fiebre = numeroValido(sc, minFiebre, maxFiebre, "Temperatura corporal (27-45)");

        prioridad = numeroValido(sc, minProridad, maxProridad, "Nivel de prioridad (0-5)");

        System.out.println();
        System.out.printf("%-10s %-30s  %-30s  %-20s %-20s%n", "NUSS", "SINTOMA", "EXPLORACION","PRIORIDAD","TEMPERATURA CORPORAL");
        System.out.println();
        System.out.printf("%-10d %-30s  %-30s  %-20d %-20d%n",nuss, sintomas[opcionSintoma], exploracion, prioridad, fiebre);
        sc.close();
    }
}
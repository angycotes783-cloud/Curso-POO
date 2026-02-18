public class Sesion2 {

    public static void main(String[] args) {

        // TITULO GENERAL
        System.out.println("==================================");
        System.out.println("        PRACTICA SEMANA 2");
        System.out.println("==================================\n");


        // ===============================
        // EJERCICIO 2.10
        // ===============================
        System.out.println("EJERCICIO 2.10");
        System.out.println("Calculo de la superficie de un triangulo");
        System.out.println("----------------------------------------");

        double base = 10.0;
        double altura = 6.0;
        double superficie = (base * altura) / 2.0;

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("La superficie del triangulo es: " + superficie + " unidades cuadradas");

        System.out.println("\n");


        // ===============================
        // EJERCICIO 2.11
        // ===============================
        System.out.println("EJERCICIO 2.11");
        System.out.println("Calculo de la longitud de la circunferencia y el area de un circulo");
        System.out.println("---------------------------------------------------------------");

        double radio = 5.0;
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Radio: " + radio);
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Area del circulo: " + area);

        System.out.println("\n");


        // ===============================
        // EJERCICIO 2.12
        // ===============================
        System.out.println("EJERCICIO 2.12");
        System.out.println("Calculo del salario semanal de un trabajador");
        System.out.println("--------------------------------------------");

        double tarifaHora = 10000.0;
        double horasDiarias = 8.0;
        int diasSemana = 5;

        double horasSemanales = horasDiarias * diasSemana;
        double salarioSemanal = tarifaHora * horasSemanales;

        System.out.println("Tarifa por hora: $" + tarifaHora);
        System.out.println("Horas trabajadas por dia: " + horasDiarias);
        System.out.println("Horas trabajadas en la semana: " + horasSemanales);
        System.out.println("Salario semanal: $" + salarioSemanal);

        System.out.println("\n");


        // ===============================
        // EJERCICIO 3.4
        // ===============================
        System.out.println("EJERCICIO 3.4");
        System.out.println("Evaluacion de la expresion: 3*A - 4*B / A^2");
        System.out.println("---------------------------------------------");

        double valorA = 2.0;
        double valorB = 5.0;

        double resultado34 = 3 * valorA - (4 * valorB) / Math.pow(valorA, 2);

        System.out.println("Valor de A: " + valorA);
        System.out.println("Valor de B: " + valorB);
        System.out.println("Resultado: " + resultado34);

        System.out.println("\n");


        // ===============================
        // EJERCICIO 3.5
        // ===============================
        System.out.println("EJERCICIO 3.5");
        System.out.println("Evaluacion de la expresion");
        System.out.println("4 / 2 * 3 / 6 + 6 / 2 / 1 / 5^2 / 4 * 2");
        System.out.println("-----------------------------------------");

        double resultado35 = 4.0 / 2.0 * 3.0 / 6.0 +
                6.0 / 2.0 / 1.0 / Math.pow(5.0, 2.0) / 4.0 * 2.0;

        System.out.println("Resultado: " + resultado35);

        System.out.println("\n");


        // ===============================
        // EJERCICIO 3.6
        // ===============================
        System.out.println("EJERCICIO 3.6");
        System.out.println("Expresiones algebraicas a algoritmicas");
        System.out.println("--------------------------------------");

        double a = 2.0, b = 3.0, c = 4.0, d = 5.0;
        double x = 6.0, y = 7.0, z = 8.0;
        double x1 = 1.0, x2 = 4.0, y1 = 2.0, y2 = 6.0;
        double r = 5.0;

        double resA = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double resB = (Math.pow(x, 2) + Math.pow(y, 2)) / Math.pow(z, 2);
        double resC = (3 * x + 2 * y) / (2 * z);
        double resD = (a + b) / (c - d);
        double resE = 4 * Math.pow(x, 2) - 2 * x + 7;
        double resF = (x + y) / (x - (3 * x / 5));
        double resG = a / (b * c);
        double resH = x * y * z;
        double resI = (y2 - y1) / (x2 - x1);
        double resJ = 2 * Math.PI * r;
        double resK = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double resL = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("a) " + resA);
        System.out.println("b) " + resB);
        System.out.println("c) " + resC);
        System.out.println("d) " + resD);
        System.out.println("e) " + resE);
        System.out.println("f) " + resF);
        System.out.println("g) " + resG);
        System.out.println("h) " + resH);
        System.out.println("i) " + resI);
        System.out.println("j) " + resJ);
        System.out.println("k) " + resK);
        System.out.println("l) " + resL);

    }
}


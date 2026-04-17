import java.util.Scanner;

public class TodosOsExercicios {

    public static void main(String[] args) {
        // -------Professor Para testar cada excercicio precisa somente apagar o // do ex que quer verificar.-----------
        // -------Professor Para testar cada excercicio precisa somente apagar o // do ex que quer verificar.-----------
        // -------Professor Para testar cada excercicio precisa somente apagar o // do ex que quer verificar.-----------



        // ex_um_tres();
        // ex_quatro();
        // ex_cinco();
        // ex_seis();
        // ex_sete();
        // ex_oito();
        // ex_nove();
        // ex_dez();
        // ex_onze();
        // ex_doze();
        // ex_treze();
        // ex_quatorze();
        // ex_quinze();
        // ex_dezesseis();
        // ex_dezessete();
        // ex_dezoito();
        // ex_dezenove();
        // ex_vinte();
        // ex_vinte_um();
        // ex_vinte_dois();
        // ex_vinte_tres();
        // ex_vinte_quatro();
        // ex_vinte_cinco();
        // ex_vinte_seis();
        // ex_vinte_sete();
        // ex_vinte_oito();
        // ex_vinte_nove();
        // ex_trinta();
        // ex_trinta_um();
        // ex_trinta_dois();
        // ex_trinta_tres();
        // ex_trinta_quatro();
        // ex_trinta_cinco();
        // ex_trinta_seis();
        // ex_trinta_sete();
        // ex_trinta_oito();
        // ex_trinta_nove();
        // ex_quarenta();
        // ex_quarenta_um();
        // ex_quarenta_dois();
        // ex_quarenta_tres();
        // ex_quarenta_quatro();
        // ex_quarenta_cinco();
        // ex_quarenta_seis();
        // ex_quarenta_sete();
        // ex_quarenta_oito();
        // ex_quarenta_nove();
        // ex_cinquenta();
        // ex_cinquenta_um();
        // ex_cinquenta_dois();
        // ex_cinquenta_tres();
    }

    public static void ex_um_tres() {
        Scanner sc = new Scanner(System.in);
        int n1 = -2;
        System.out.println(n1);
        double n2 = 0;
        System.out.println(n2);
        System.out.println("Digite 3 numeros inteiros");
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        System.out.println("Resultado" +(n3+n4+n5));
    }

    public static void ex_quatro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        System.out.println("Resultado" +(n1*n1));
    }

    public static void ex_cinco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        System.out.println("Resultado" +(n1)/5);
    }

    public static void ex_seis() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Converter graus Celsius para Fahrenheit\n digite abaixo a temperatura em Celsius");
        double n1 = sc.nextDouble();
        System.out.println(n1*(9.0/5.0)+32);
    }

    public static void ex_sete() {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        System.out.println(5.0*(n1-32.0)/9.0);
    }

    public static void ex_oito() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de Graus kelvin Para Celsius");
        double n1 = sc.nextDouble();
        System.out.println(n1 - 273.15);
    }

    public static void ex_nove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversão de Graus Celsius em graus kelvin" );
        double sixseven = sc.nextDouble();
        System.out.println(sixseven+273.15);
    }

    public static void ex_dez() {
        Scanner sc = new Scanner(System.in);
        Double n1 = sc.nextDouble();
        System.out.println("Conversão de Km/h para m/s" + (n1/3.6));
    }

    public static void ex_onze() {
        Scanner sc = new Scanner(System.in);
        double nm1 = sc.nextDouble();
        System.out.println("m/s convertida em km/h." + (nm1*3.6));
    }

    public static void ex_doze() {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        System.out.println(1.61 * m1);
    }

    public static void ex_treze() {
        Scanner sc = new Scanner(System.in);
        System.out.println("conversor de milhas para quilômetro");
        double v1 = sc.nextDouble();
        System.out.println("resultado:" + (v1)/ 1.61);
    }

    public static void ex_quatorze() {
        Scanner sc = new Scanner(System.in);
        double v1 = sc.nextDouble();
        System.out.println("Conversor graus para radianos"+ (v1*3.14)/180);
    }

    public static void ex_quinze() {
        Scanner sc = new Scanner(System.in);
        double v1 = sc.nextDouble();
        System.out.println(v1 * 180 / 3.14);
    }

    public static void ex_dezesseis() {
        Scanner sc = new Scanner(System.in);
        double p1 = sc.nextDouble();
        System.out.println(p1 * 2.54);
    }

    public static void ex_dezessete() {
        Scanner sc = new Scanner(System.in);
        double c1 = sc.nextDouble();
        System.out.println(c1 / 2.54);
    }

    public static void ex_dezoito() {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        System.out.println(1000 * m1);
    }

    public static void ex_dezenove() {
        Scanner sc = new Scanner(System.in);
        double l1 = sc.nextDouble();
        System.out.println(l1 / 1000);
    }

    public static void ex_vinte() {
        Scanner sc = new Scanner(System.in);
        double k1 = sc.nextDouble();
        System.out.println(k1 / 0.45);
    }

    public static void ex_vinte_um() {
        Scanner sc = new Scanner(System.in);
        double l1 = sc.nextDouble();
        System.out.println(l1 * 0.45);
    }

    public static void ex_vinte_dois() {
        Scanner sc = new Scanner(System.in);
        double j1 = sc.nextDouble();
        System.out.println(0.91 * j1);
    }

    public static void ex_vinte_tres() {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        System.out.println(m1 / 0.91);
    }

    public static void ex_vinte_quatro() {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        System.out.println(m1 * 0.000247);
    }

    public static void ex_vinte_cinco() {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        System.out.println(a1 * 4048.58);
    }

    public static void ex_vinte_seis() {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        System.out.println(m1 * 0.0001);
    }

    public static void ex_vinte_sete() {
        Scanner sc = new Scanner(System.in);
        double h1 = sc.nextDouble();
        System.out.println(h1 * 10000);
    }

    public static void ex_vinte_oito() {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println((n1*n1) + (n2*n2) + (n3*n3));
    }

    public static void ex_vinte_nove() {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        System.out.println("Resultado" + (n1+n2+n3+n4)/4);
    }

    public static void ex_trinta() {
        Scanner sc = new Scanner(System.in);
        double reais = sc.nextDouble();
        double cotacao = sc.nextDouble();
        System.out.println(reais / cotacao);
    }

    public static void ex_trinta_um() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(n1 - 1);
        System.out.println(n1 + 1);
    }

    public static void ex_trinta_dois() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(((n1*3)+1) + ((n1*2)-1));
    }

    public static void ex_trinta_tres() {
        Scanner sc = new Scanner(System.in);
        double lado = sc.nextDouble();
        System.out.println(lado * lado);
    }

    public static void ex_trinta_quatro() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(3.141592 * (r*r));
    }

    public static void ex_trinta_cinco() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Math.sqrt((a*a) + (b*b)));
    }

    public static void ex_trinta_seis() {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.println(3.141592 * (r*r) * h);
    }

    public static void ex_trinta_sete() {
        Scanner sc = new Scanner(System.in);
        double v1 = sc.nextDouble();
        System.out.println(v1 * 0.88);
    }

    public static void ex_trinta_oito() {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        System.out.println(salario * 1.25);
    }

    public static void ex_trinta_nove() {
        double premio = 780000.00;
        System.out.println(premio * 0.46);
        System.out.println(premio * 0.32);
        System.out.println(premio * 0.22);
    }

    public static void ex_quarenta() {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        System.out.println((dias * 30.0) * 0.92);
    }

    public static void ex_quarenta_um() {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        double horas = sc.nextDouble();
        System.out.println((valor * horas) * 1.10);
    }

    public static void ex_quarenta_dois() {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println(base + (base * 0.05) - (base * 0.07));
    }

    public static void ex_quarenta_tres() {
        Scanner sc = new Scanner(System.in);
        double v1 = sc.nextDouble();
        System.out.println(v1 * 0.90);
        System.out.println(v1 / 3.0);
        System.out.println((v1 * 0.90) * 0.05);
        System.out.println(v1 * 0.05);
    }

    public static void ex_quarenta_quatro() {
        Scanner sc = new Scanner(System.in);
        double alturaDesejada = sc.nextDouble();
        double alturaDegrau = sc.nextDouble();
        System.out.println(alturaDesejada / alturaDegrau);
    }

    public static void ex_quarenta_cinco() {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        System.out.println((char)(letra + 32));
    }

    public static void ex_quarenta_seis() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int c = n1 / 100;
        int d = (n1 % 100) / 10;
        int u = n1 % 10;
        System.out.println(u + "" + d + "" + c);
    }

    public static void ex_quarenta_sete() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(n1 / 1000);
        System.out.println((n1 % 1000) / 100);
        System.out.println((n1 % 100) / 10);
        System.out.println(n1 % 10);
    }

    public static void ex_quarenta_oito() {
        Scanner sc = new Scanner(System.in);
        int seg = sc.nextInt();
        System.out.println(seg / 3600);
        System.out.println((seg % 3600) / 60);
        System.out.println(seg % 60);
    }

    public static void ex_quarenta_nove() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int duracao = sc.nextInt();
        int totalSeg = (h * 3600) + (m * 60) + s + duracao;
        System.out.println(totalSeg / 3600);
        System.out.println((totalSeg % 3600) / 60);
        System.out.println(totalSeg % 60);
    }

    public static void ex_cinquenta() {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int ano = sc.nextInt();
        System.out.println(ano - idade);
    }

    public static void ex_cinquenta_um() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(Math.sqrt((x*x) + (y*y)));
    }

    public static void ex_cinquenta_dois() {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double premio = sc.nextDouble();
        double total = a1 + a2 + a3;
        System.out.println((a1 / total) * premio);
        System.out.println((a2 / total) * premio);
        System.out.println((a3 / total) * premio);
    }

    public static void ex_cinquenta_tres() {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double l = sc.nextDouble();
        double p = sc.nextDouble();
        System.out.println(2 * (c + l) * p);
    }
}
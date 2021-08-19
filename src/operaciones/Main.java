package operaciones;

public class Main {

    public static void main(String[] args) {
        Aritmetica arit = new Aritmetica();

        arit.a = 10;
        arit.b = 5;
        arit.Sumar();
        int resultado = arit.SumarRetorno();
        System.out.println(resultado);

        System.out.println(arit.SumarConArgumentos(5,20));
    }
}

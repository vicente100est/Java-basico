package operaciones;

public class Aritmetica {
    int a;
    int b;

    public void Sumar(){
        int result = a +b;
        System.out.println("El resultado es: " + result);
    }

    public int SumarRetorno(){
        int reu = a+b;
        return reu;
    }

    public int SumarConArgumentos(int arg1, int agr2){
        this.a = arg1;
        this.b = agr2;
        return (a +b);
    }
}

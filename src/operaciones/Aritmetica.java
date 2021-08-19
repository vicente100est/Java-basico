package operaciones;

public class Aritmetica {
    int a;
    int b;

    //Constructor
    public Aritmetica(){}

    //Sobre carga de constructores
    public Aritmetica( int arg1, int arg2 ){
        this.a = arg1;
        this.b = arg2;
    }

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

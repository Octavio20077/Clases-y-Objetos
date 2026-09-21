public class Aritmetica {
int operando1;
int operando2;

public Aritmetica(int op1, int op2){
    System.out.println("***Ejecutando conatructor***");
    operando1 = op1;
    operando2 = op2;
}

void sumar(){
    int resutado = operando1 + operando2;
    System.out.println("Resultado suma: " + resutado);
}
void resta(){
    int resultado = operando1 - operando2;
    System.out.println("Resultado resta: " + resultado);
}

    public static void main(String[] args) {
        System.out.println("***Ejemplo Aritmetica***");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        // aritmetica1.operando1 = 5;
        // aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.resta();

    }
}

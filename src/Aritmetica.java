public class Aritmetica {
int operando1;
int operando2;

//constructor vacio
public Aritmetica(){
}

public Aritmetica(int operando1, int operando2){
    System.out.println("***Ejecutando constructor***");
    this.operando1 = operando1;
    this.operando2 = operando2;
    System.out.println("Operador this: " + this);
}

void sumar(){
    int resutado = this.operando1 + this.operando2;
    System.out.println("Resultado suma: " + resutado);
}
void resta(){
    int resultado = this.operando1 - this.operando2;
    System.out.println("Resultado resta: " + resultado);
}

    public static void main(String[] args) {
        System.out.println("***Ejemplo Aritmetica***");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        aritmetica1.sumar();
        aritmetica1.resta();
        System.out.println("dir. de memomira de obj1: " + aritmetica1);
        System.out.println();
        //creamos un objeto
        Aritmetica aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
        System.out.println("Dir. Memoria obj2: " + aritmetica2);
    }
}

package aritmetica;

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
}

 public void sumar(){
    int resutado = this.operando1 + this.operando2;
    System.out.println("Resultado suma: " + resutado);
}
public void resta(){
    int resultado = this.operando1 - this.operando2;
    System.out.println("Resultado resta: " + resultado);
   }
   public int getOperando1(){
    return this.operando1;
   }

   public void setOperando1(int operando1){
    this.operando1 = operando1;
   }

   public int getOperando2(){
    return this.operando2;
   }
   public void setOperando2(int operando2){
    this.operando2 = operando2;
   }

}

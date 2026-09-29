package animales;

public class Animal {
    protected void hacerSonidos(){
        System.out.println("El animal hace un sonido");
    }

    protected void hacerSonido() {

    }
}
class Perro extends Animal {
    @Override
    protected void hacerSonido() {
        System.out.println("el perro hace wuof");
    }
}
class Gato extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("El gato maulla");
    }
}

class PruebaAnimal {
//metodo polimorfico
     static void imprimirSonido(Animal animal){
    animal.hacerSonido();
    }



    public static void main(String[] args) {
        //objeto de la clase padre (animal)
       // Animal animal = new Animal();
        Animal animal = new Perro();
        imprimirSonido(animal);

    }
}


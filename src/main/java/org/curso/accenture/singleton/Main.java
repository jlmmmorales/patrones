package org.curso.accenture.singleton;

public class Main {

  public static void main(String[] args) {
    System.out.println("Resultados con clase Counter.");
    Counter counter = new Counter();
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());

    counter = new Counter();
    // Al crear una nueva instancia pierdo el contador
    // y yo quiero que siga por el contador
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    
    System.out.println("Resultados con patron en la clase SingletonCounter.");
    // Hago lo mismo con la clase SingletonCounter
    // No me permite hacer lo siguiente
    //SingletonCounter sCounter = new SingletonCounter();
    SingletonCounter sCounter = SingletonCounter.getInstance();
    System.out.println(sCounter.getCounter());
    System.out.println(sCounter.getCounter());
    System.out.println(sCounter.getCounter());
    System.out.println(sCounter.getCounter());
    
    SingletonCounter sCounter2 = SingletonCounter.getInstance();
    System.out.println(sCounter2.getCounter());
    System.out.println(sCounter2.getCounter());
    

  }

}

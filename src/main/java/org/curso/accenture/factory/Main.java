package org.curso.accenture.factory;

public class Main {

  public static void main(String[] args) {
    // Creo la fábrica
    Factory factory = new MediaFactory();
    
    // Creo diferentes instancias de dicha fábrica
    MultimediaFile mp3 = factory.createMedia("mp3");
    mp3.play();
    
    MultimediaFile wav = factory.createMedia("wav");
    wav.play();
  }

}

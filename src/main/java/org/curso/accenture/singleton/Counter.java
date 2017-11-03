package org.curso.accenture.singleton;

/*
 * Class implementing a counter object.
 * 
 * @author José Luis Martin Morales
 */
public class Counter {
  private int counter;
  
  public Counter() {
    counter =0;
  }
  
  public int getCounter() {
    return counter ++;
  }
}

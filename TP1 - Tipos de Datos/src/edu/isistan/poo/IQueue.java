package edu.isistan.poo;

public interface IQueue{
  /**
  Retorna el siguiente objeto en la estructura
  */
  public Object pop();
  /**
  Retorna true si la estructura est� vacia
  */
  public boolean isEmpty();
  /**
  Retorna true si la estructura est� llena
  */
  public boolean isFull();
  /**
  Agrega un nuevo elemento en la estructura
  */
  public void push(Object o);
}
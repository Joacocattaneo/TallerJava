package edu.isistan.poo;

public class ClaseC extends ClaseA {
  
  @override
  public String metodo2(){
         return "ClaseC.metodo2() llama a super "+super.metodo2()+"\n\t tambi�n llama: "+this.metodo1();
  }

  @override
  public String metodo3(){
    return "ClaseC.metodo3()";
  }

}
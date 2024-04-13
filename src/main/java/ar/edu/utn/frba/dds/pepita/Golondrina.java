package ar.edu.utn.frba.dds.pepita;

public class Golondrina {

  public int energia;

  public Golondrina(int energiaNueva){

    this.energia = energiaNueva;

  }

  public void volar(){

    this.energia = this.energia - 10;

  }

  public void comer( int alpiste){
    this.energia= this.energia + (alpiste * 3);

  }

  public int getEnergia() {
    return energia;
  }

}

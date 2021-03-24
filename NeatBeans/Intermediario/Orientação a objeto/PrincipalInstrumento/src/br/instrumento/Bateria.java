
package br.instrumento;

public class Bateria {
 
 public String cor;
 private String modelo;
 private boolean pedalDuplo ;
 private String tamanho;
 private boolean pratos;
 private boolean caixa ;
 private boolean surdo;
 private boolean toms;
 private boolean baquetas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPedalDuplo() {
        return pedalDuplo;
    }

    public void setPedalDuplo(boolean pedalDuplo) {
        this.pedalDuplo = pedalDuplo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPratos() {
        return pratos;
    }

    public void setPratos(boolean pratos) {
        this.pratos = pratos;
    }

    public boolean isCaixa() {
        return caixa;
    }

    public void setCaixa(boolean caixa) {
        this.caixa = caixa;
    }

    public boolean isSurdo() {
        return surdo;
    }

    public void setSurdo(boolean surdo) {
        this.surdo = surdo;
    }

    public boolean isToms() {
        return toms;
    }

    public void setToms(boolean toms) {
        this.toms = toms;
    
    }

    public boolean isBaquetas() {
        return baquetas;
    }

    public void setBaquetas(boolean baquetas) {
        this.baquetas = baquetas;
    }
 public void tocar(){
     System.out.println(" tocando bateria !!!");
     System.out.println("..-.-.-..-.-");  
 }
 
 public void relatorioBateria(){
     System.out.println("\n=========================");
     System.out.println("Relatorio sobre a bateria \n"+this.getModelo());
     System.out.println("=========================");
     System.out.println("|A cor : "+this.getCor()+"  ");
     System.out.println("|Modelo: "+this.getModelo()+" ");
      System.out.println("=========================");
     System.out.println("Complementos para Bateria:");
     System.out.println("=========================");
     System.out.println("|Pedal duplo: "+this.isPedalDuplo()+"      |");
     System.out.println("|Caixa: "+this.isCaixa()+"            |");
     System.out.println("|Baqueta: "+this.isBaquetas()+"          |");
     System.out.println("|Pratos: "+this.isPratos()+"           |");
     System.out.println("|Surdo: "+this.isSurdo()+"           |");
     System.out.println("|Toms: "+this.isToms()+"             |");   
 }
    
}

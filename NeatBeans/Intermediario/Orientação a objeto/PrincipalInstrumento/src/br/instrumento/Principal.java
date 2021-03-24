package br.instrumento;

/**
 *
 * @author Leandro Luiz Pereira
 */
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
  
        String cor;
        String modelo;
        boolean pedalDuplo;
        String tamanho;
        boolean pratos;
        boolean caixa;
        boolean surdo;
        boolean toms;
        boolean baquetas;

    Scanner ler = new Scanner(System.in);
    Bateria b1 = new Bateria();

    System.out.println ("Digite a cor da bateria !");
        cor  = ler.nextLine();
    System.out.println ("Digite o modelo da bateria !");
        modelo  = ler.nextLine();
    System.out.println ("Descreva o tamanho da bateria ");
        tamanho = ler.nextLine();
    System.out.println ("Digite se vai ter pedal duplo, true ou false !");
        pedalDuplo = ler.nextBoolean();
    System.out.println ("Digite se vai ter pratos, true ou false !");
        pratos = ler.nextBoolean();
        
    b1.setCor (cor);
    b1.setModelo(modelo);
    b1.setTamanho(tamanho);
    b1.setPedalDuplo(pedalDuplo);
    b1.setPratos (pratos);
    b1.setBaquetas (true);
    b1.setCaixa (true);
    b1.setToms (true);
    b1.relatorioBateria ();

}

}


/*   
        int vet[] = {2, 3, 4, 2};
for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite:");
            vet[i] = ler.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
*/

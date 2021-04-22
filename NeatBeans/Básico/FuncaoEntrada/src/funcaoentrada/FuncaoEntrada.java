
package funcaoentrada;
import java.util.Scanner;
public class FuncaoEntrada {
    public static void main(String[] args) {     
        Scanner ler = new Scanner(System.in);      
        System.out.println("Digite um número");
        int n = ler.nextInt();
        for(int i=0;i<11;i++){
        int mult = n*i;     
            System.out.println(" "+n+" X "+i+" "+mult);      
    }  
    }
}

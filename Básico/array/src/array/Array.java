
package array;

import java.util.Scanner;
public class Array {


    public static void main(String[] args) {

Scanner ler =new Scanner (System.in);
int array [] ={2,3,4};

for (int i= 0;i<3;i++){
System.out.println("Digite um valor :");
array[i] =ler.nextInt();

}
for (int i=0;i<array.length;i++){
System.out.println(array[i]);
}


}
}
    
    

package repositorio.github;

import java.util.Scanner;

public class RepositorioGithub {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
                
        int n, aux=0,cont=0;
        int ar [] = {1,3,5,7,9,11,13,17,23};
        
        System.out.println("Digite um número: ");
        n = leitor.nextInt();

        for(int i=0;i<ar.length;i++){ 
            n = n-ar[i];
            if(n>=0){
                cont = cont + 1;
                 System.out.println(n+" "+cont);
            }         
        }
        
        
    }   
}

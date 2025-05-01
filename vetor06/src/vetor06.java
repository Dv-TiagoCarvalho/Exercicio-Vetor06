import java.util.Arrays;
import java.util.Scanner;

public class vetor06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[]vetor = {1,2,3,4,5,6,7,8,9,10};
       
        System.out.println("Digite um numero para remover");
        int nmremover= scanner.nextInt();
        scanner.close();
        int indiceremover =-1;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor [i] == nmremover) {
                indiceremover =i;
                break;  
            }  
        }
        if (indiceremover != -1) {

            int [] vetor2 = new int[vetor.length -1];
            int nvindice =0;

            for (int i = 0; i < vetor.length; i++) {
                if ( i != indiceremover) {
                    vetor2[nvindice] = vetor[i];
                    nvindice++; 
                }
            }

            System.out.println("Vetor original: " + Arrays.toString(vetor));
            System.out.println("Novo vetor sem o numero" + nmremover + ": " + Arrays.toString(vetor2));

        } else {
            System.out.println("O número " + nmremover + " não foi encontrado no vetor.");
            
        }

       

       
    }
}

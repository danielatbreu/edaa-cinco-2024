import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
        int[] arr = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296, 
            306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
            355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
            391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
            429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
            483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
            511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
            554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
            613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
            652, 654, 655, 662, 667, 671, 673, 674, 695, 696 };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número você está buscando?");
        int buscado = scanner.nextInt();

        int indice = buscaBinaria(arr, buscado);
        
        if (indice != -1) {
            System.out.println("O número " + buscado + " foi encontrado na posição: " + (indice + 1));
        } else {
            System.out.println("O número " + buscado + " não foi encontrado na lista.");
        }
    }

    public static int buscaBinaria(int[] arr, int buscado) {
        int inicio = 0;
        int fim = arr.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (arr[meio] == buscado) {
                return meio;
            } else if (arr[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return -1;
    }
}

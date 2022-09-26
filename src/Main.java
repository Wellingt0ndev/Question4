

public class Main {
    public static void main(String[] args) {

        //Criando a matriz 10x10
        int[][] matriz = new int[10][10];
        int[][] segMatriz = new int[4][4];
        int valor = 200;
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
        //Exibe a matriz 10x10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        //Percorre a matriz 10 x 10 para encontrar os números primos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (ehPrimo(matriz[i][j])) {
                    for (int k = 0; k < segMatriz.length; k++) {
                        for (int l = 0; l < segMatriz[k].length; l++) {
                            num = matriz[i][j]+i+j;
                            segMatriz[k][l] = num;

                        }
                    }
                }
            }
        }
        //Exibe a matriz de 4x4
        for (int k = 0; k < segMatriz.length; k++) {
            for (int l = 0; l < segMatriz[k].length; l++) {
                System.out.print(segMatriz[k][l] + " ");
            }
            System.out.println("");
        }
    }

//método para saber se o número é primo
    private static boolean ehPrimo(int numero) {
        for (int k = 2; k < numero; k++) {
            if (numero % k == 0)
                return false;
        }
        return true;
    }
}
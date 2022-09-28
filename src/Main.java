

public class Main {
    public static void main(String[] args) {

        //Criando a matriz 10x10
        int[][] matriz = new int[10][10];
        int valor = 200;
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
        System.out.println();


        //Percorre a matriz 10 x 10 para encontrar os números primos
        int contador = 0;
        int index = 0;
        int matrizNumber;
        boolean primeNumberCheck;
        int finalNumberSum;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                index++;
                matrizNumber = matriz[i][j];
                primeNumberCheck = ehPrimo(matrizNumber);
                if (primeNumberCheck == true) {
                    finalNumberSum = (matrizNumber + index - 1);
                    contador++;
                    System.out.print(finalNumberSum + " ");
                    if (contador == 4){
                        System.out.println();
                        contador = 0;

                        }
                    }
                }
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
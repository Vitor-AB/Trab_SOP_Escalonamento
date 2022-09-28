import java.util.ArrayList;
import java.util.Arrays;

public class Escalonamento {
    public static void main(String[] args) {

        int[] P1 = {1, 2, -1, 1, -2, 1, 2};
        int[] P2 = {2, 5, 1, -4, -7, -1,3};
        int[] P3 = {1, 5, 6, -2, -4, -1,1};

        int[][] filaPronto = {P1,P2,P3};
        System.out.println("Fifo:");
        //Fifo
        for (int i = 0; i < filaPronto.length; i++) {
            for (int j = 0; j < (filaPronto[i].length - 1); j++) {
                if(filaPronto[i][j] == 0) {
                    continue;
                }else {
                    while (filaPronto[i][j] != 0) {
                        if (filaPronto[i][j] < 0) {
                            filaPronto[i][j] += 1;
                        } else {
                            filaPronto[i][j] -= 1;
                        }
                    }
                }
            }
            System.out.println(Arrays.deepToString(filaPronto));
        }

        int[] P4 = {1, 2, -1, 1, -2, 1, 2};
        int[] P5 = {2, 5, 1, -4, -7, -1,3};
        int[] P6 = {1, 5, 6, -2, -4, -1,1};

        filaPronto = new int[][]{P4, P5, P6};

        System.out.println("SJF:");
        //SJF
        int aux = 0;
        int aux1 = 0;
        for (int i = 0; i < (filaPronto.length - 1); i++) {
            for (int j = 0; j < (filaPronto[i].length - 1); j++) {
                aux += filaPronto[i][j];
                aux1 += filaPronto[i+1][j];

            }
            if (aux > aux1) {
                int[] aux3 = filaPronto[i];
                filaPronto[i] = filaPronto[i+1];
                filaPronto[i+1] = aux3;
            }
        }

        for (int i = 0; i < filaPronto.length; i++) {
            for (int j = 0; j < (filaPronto[i].length - 1); j++) {
                if(filaPronto[i][j] == 0) {
                    continue;
                }else {
                    while (filaPronto[i][j] != 0) {
                        if (filaPronto[i][j] < 0) {
                            filaPronto[i][j] += 1;
                        } else {
                            filaPronto[i][j] -= 1;
                        }
                    }
                }
            }
            System.out.println(Arrays.deepToString(filaPronto));
        }

        int[] P7 = {1, 2, -1, 1, -2, 1, 3};
        int[] P8 = {2, 5, 1, -4, -7, -1,1};
        int[] P9 = {1, 5, 6, -2, -4, -1,2};

        filaPronto = new int[][]{P7, P8, P9};

        System.out.println("Prioridade:");
        for (int i = 0; i < (filaPronto.length - 1); i++) {
            if(filaPronto[i][filaPronto[i].length - 1] > filaPronto[i+1][filaPronto[i].length - 1]){
                int[] aux3 = filaPronto[i];
                filaPronto[i] = filaPronto[i+1];
                filaPronto[i+1] = aux3;
            }
        }
        for (int i = 0; i < filaPronto.length; i++) {
            for (int j = 0; j < (filaPronto[i].length - 1); j++) {
                if(filaPronto[i][j] == 0) {
                    continue;
                }else {
                    while (filaPronto[i][j] != 0) {
                        if (filaPronto[i][j] < 0) {
                            filaPronto[i][j] += 1;
                        } else {
                            filaPronto[i][j] -= 1;
                        }
                    }
                }
            }
            System.out.println(Arrays.deepToString(filaPronto));
        }

    }

}

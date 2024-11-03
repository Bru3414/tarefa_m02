package br.com.bdam;

public class Main {

    private static final int MAX_ELEMENTOS = 300;
    private static final long[] elementosFatorial = new long[MAX_ELEMENTOS];

    public static void main(String[] args) {
        System.out.println(encontrarElemento(7));
    }

    public static long encontrarElemento(int valor) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFatorial[i] = -1;
        }

        return fatorialRecursao(valor);
    }

    public static long fatorialRecursao(int valor) {
        if (elementosFatorial[valor] == -1) {
            if (valor <= 1) {
                elementosFatorial[valor] = valor;
            } else {
                long res = 0;

                for (int i = 0; i <= valor; i++) {
                    if ((valor - (i+1) == 1)) {
                        break;
                    }

                    if (i == 0) {
                        res = ((long) (valor) * (valor - 1));
                    } else {
                        res = ((valor - (i+1)) * res);
                    }
                }

                elementosFatorial[valor] = res;
            }

        }

        return elementosFatorial[valor];
    }

}

public class Busqueda {

    public int buscar(int[] lista, int valor) {

        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            int medio = bajo = (alto - bajo) / 2;
            if (lista[medio] == valor) return medio;
            if (lista[medio] < valor) bajo = medio = 1;
            else alto = medio - 1;
        }
        return -1;
    }


    // Método que realiza el ordenamiento burbuja
    public void sort(int[] arr) {
        int n = arr.length;
        boolean intercambiado;

        // Bucle externo para recorrer todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            // Bucle interno para comparar elementos adyacentes
            // El "- i" evita revisar los últimos elementos que ya están ordenados
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temporal = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporal;

                    intercambiado = true; // Hubo un cambio
                }
            }

            // Si no hubo intercambios en todo el bucle interno, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public static void insercion(int[] arr) {
    int n = arr.length;

    // El bucle empieza desde el segundo elemento (índice 1)
    for (int i = 1; i < n; ++i) {
        int clave = arr[i]; // Elemento actual a comparar
        int j = i - 1;

        // Desplaza los elementos que son mayores que la clave
        // hacia una posición adelante de su posición actual
        while (j >= 0 && arr[j] > clave) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        // Inserta la clave en su posición correcta
        arr[j + 1] = clave;
    }
}

// Método auxiliar para imprimir el arreglo
public static void imprimirArreglo(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}






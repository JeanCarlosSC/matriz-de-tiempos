import lib.sRAD.logic.component.Matriz;

public class Main {
    public static void main(String[] args) {
        double[][] matriz = {
                {0.9, 0.05, 0.05},
                {0.05, 0.85, 0.1},
                {0.1, 0.07, 0.83}
        };

        double[] estadoEstable = Matriz.estadoEstable(matriz);
        System.out.println("Estado estable");
        System.out.println(Matriz.toString(estadoEstable));

        double[][] matrizDeTiempos = Matriz.calcularTiempos(estadoEstable, matriz);
        System.out.println("Matriz de tiempos");
        System.out.println(Matriz.toString(matrizDeTiempos));
    }
}

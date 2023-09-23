package practicoVectores;

public class Principal {
    public static void main(String[] args){
        Vectoru util = new Vectoru();
        int vector[] = util.generarVector(10);
        String texto = util.vectorAtexto(vector);
        System.out.println("Vector: " + texto);
        double promedio = util.promedio(vector); 
        System.out.println("Promedio: " + promedio);
        int maximo = util.maximo(vector);
        System.out.println("Maximo: " + maximo);
        int minimo = util.minimo(vector);
        System.out.println("Minimo: " + minimo);
        int rango = util.rango(vector);
        System.out.println("Rango: " + rango);
        int valor = util.valor(vector);
        System.out.println("Valor: " + valor);
    }
}

package practicoVectores;

import java.util.Random;

public class Vectoru {
    public int[] generarVector(int n){

        Random rnd = new Random();
        int[] vector = new int[n];

        for(int i = 0 ; i < n; i++){
            vector[i] = rnd.nextInt(100);
        } 
        return vector;
    }
    public String vectorAtexto(int Vector[]){
        String s = " ";
        for(int i = 0; i < Vector.length; i++){
            s = s + Vector[i] + " ";
        }
        return s;
    }
    public double promedio(int[] vector) {
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            suma += vector[i];
        }
        double promedioSuma = suma/10;
        return promedioSuma;
    }
    public int maximo(int[] vector){
        int max = 0;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > max){
                max = vector[i];
            }
        }
        return max;
    }
    public int minimo(int[] vector){
       int min = vector[0];
       for(int i = 0; i < vector.length; i++){
           if(vector[i] < min){
               min = vector[i];
           }
       }
       return min;
    }
    public int rango(int[] vector){
        int inicio = minimo(vector);
        int fin = maximo(vector);
        for (int i = inicio; i <= fin; i++){
        }
        return fin - inicio;
    }
    public int valor(int[] vector){
        int valor = vector[0];
        for (int i = 0; i < vector.length; i++){
            if(vector[i] == valor){
                return i;
            }
        }
        return -1;
    }  
} 
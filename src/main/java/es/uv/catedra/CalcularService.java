package es.upv.charla;


public class CalcularService {

    public Integer sumar(Integer a, Integer b){
        return a+b;
    }

    public Integer restar(Integer a, Integer b){
        throw new UnsupportedOperationException();
    }
}

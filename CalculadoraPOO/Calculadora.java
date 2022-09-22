public class Calculadora {
    private double resultado = 0;

    public double getResultado() {
        return resultado;
        
    }

    public double somar(double num1, double num2){
        return num1+num2;
        
    }

    public double subtrair(double num1, double num2){
        return num1 - num2;
        
    }
    
    public double divisao(double num1, double num2){
    	return num1/num2;

    }
    
    public double multiplicar(double num1,double num2){
       return num1 * num2;
        
    }

    public double porcentagem(double num1, double num2){
    	return num1 * (num2/100);
        
    }

    public double potenciacao(double num1, double num2){
    	return Math.pow(num1, num2);
        
    }

    public double raiz(double num1){
    	return Math.sqrt(num1);
        
    }

    public double voltar(){
        return  0;
        
    }
}
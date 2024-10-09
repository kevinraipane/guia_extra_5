import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorGeneral gestor = new GestorGeneral();
        //Resolucion
        //1.
        try{
            System.out.println("Ingrese el primer numero: ");
            int num1 = gestor.solicitarNumero();
            System.out.println("Ingrese el segundo numero: ");
            int num2 = gestor.solicitarNumero();

            float resultado = gestor.calcularDivision(num1,num2);
            System.out.println("El resultado de la division es: " +resultado);
        }catch (ArithmeticException e){
            System.out.println("Error: " +e.getMessage());
        }
    }
}
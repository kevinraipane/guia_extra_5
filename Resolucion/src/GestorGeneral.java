import java.util.Scanner;

public class GestorGeneral {

    public float calcularDivision(int numero1,int numero2)
        throws ArithmeticException{
        if(numero2 == 0){
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        return (float) numero1/numero2;
    }
    public int solicitarNumero(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        //Creo un bucle que pida numeros hasta que sea uno valido.
        while(!numeroValido){
            System.out.print("--> ");
            String input = scanner.next(); //Leo la entrada como una cadena, asi dps lo casteo a int lo que ingrese

            try{
                numero = Integer.parseInt(input);
                numeroValido = true;
            }catch (NumberFormatException e){
                System.out.println("Error. Ingrese un numero valido.");
            }
        }
        return numero;
    }
}

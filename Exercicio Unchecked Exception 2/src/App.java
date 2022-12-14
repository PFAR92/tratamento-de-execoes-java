import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for(int i = 0; i < denominador.length; i++){

            try{
                if(numerador[i] % 2 != 0) 
                    throw new DivisaoNaoExataExeption("Divisão não exata!", numerador[i], denominador[i]);
            
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);

            }catch(DivisaoNaoExataExeption e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Não é possiver dividir um número por 0");
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Índice não encontrado");
            }

            System.out.println("O programa continua...");
        }
    }
}


package padrao;

/**
 *
 * @author João Enrique
 */
public class Principal 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Poupanca poupanca = new Poupanca();
        
        poupanca.calcularJuros();
        
        poupanca.exibirResultado();
    }
    
}

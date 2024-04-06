# Interface_Java
Programa com interface em Java que calcula a conta poupança.
<div align="center">
  <!--<img height="150em" src="https://user-images.githubusercontent.com/87030375/139111032-39937772-f875-4436-8137-0681dc5358bf.png"/>-->

![Poupanca1](https://user-images.githubusercontent.com/87030375/139111032-39937772-f875-4436-8137-0681dc5358bf.png)

![Poupanca2](https://user-images.githubusercontent.com/87030375/139111034-240bdb57-8332-4e5a-986f-039d0505e967.png)

![Poupanca3](https://user-images.githubusercontent.com/87030375/139111024-1ed2eb72-5011-43a1-9f31-87226df25685.png)

![Poupanvca4](https://user-images.githubusercontent.com/87030375/139111031-ae8845e0-3c53-4e38-8c5d-7d426054d660.png)

</div>

# Classe Poupanca
```java
package padrao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author João Enrique
 */
public class Poupanca 
{//VARIAVEIS
  private double C = 0;
  private double I = 0;
  private double T = 0;
  private double M = 0;
  private double L = 0;
  private final DecimalFormat df = new DecimalFormat ("0.00");
  
  public Poupanca()
  {
   
  }
  
//============================ METODOS SET E GET ===============================
  //metodo set e get Capital
  public double getC()
  {
    return C; 
  }
  
  public void setC(double C)
  {
    this.C = C;
  }
  
  //metodo set e get juros
  public double getI()
  {
    return I;
  }
  
  public void setI(double I)
  {
    this.I = I;
  }
  
  //metodo set e get tempo
  public double getT()
  {
    return T;
  }
  
  public void setT(double T)
  {
    this.T = T;
  }
  
  
  //metodo set e get montante
  public double getM()
  {
    return M;
  }
  
  public void setM(double M)
  {
    this.M = M;
  }
  
  //metodo set e get lucro
  public double getL()
  {
    return L;
  }
  
  public void setL(double L)
  {
    this.L = L;
  }
  
//========================== CALCULAR O JUROS ==================================                     
  public void calcularJuros()
  {
     
      try
      {
        this.setC(Double.parseDouble(JOptionPane.showInputDialog("Controle a sua conta poupança!\n\nInforme o capital inicial: ")));
      }
      catch (Exception erro) 
      {
        JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"CAPITAL\"\nDETALHE: " + erro);
        System.exit(0);
      }
      
      try
      {
        this.setI(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da taxa de juros: ")));
      }
      catch (Exception erro)
      {
        JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"JUROS\"\nDETALHE: " + erro);
        System.exit(0);
      }
      
      try
      {
        this.setT(Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo investido em meses: ")));
      }
      catch (Exception erro)
      {
        JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"MÊS\"\nDETALHE: " + erro);
        System.exit(0);
      }
      
      M = Math.pow(C*(1+(I/100)), T);//montante
      L = M - C;//lucro
  }
  
  
//=========================== MOSTRAR RESULTADO ================================
  public void exibirResultado()
  {
    try
    {
      JOptionPane.showMessageDialog(null, "\nO saldo da poupança é de: R$ " + df.format(this.getM()).toString() + "\nO lucro da poupança é de: R$ " + df.format(this.getL()).toString());
    }
    catch (Exception erro) 
    {
      System.out.println("ERRO: Ocorreu um erro ao exibir os dados.\nDETALHE: " + erro);
      System.exit(0);
    }
  }
  
}
```


# Classe Principal
```java
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
```

import java.util.Scanner;


public class 
{
    
    private String Nome; 
    private int Nascimento; 
    private float Altura;
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
        
    public void setNascimento(int Nascimento){
        this.Nascimento = 2021 - Nascimento;
    }
        
    public void setAltura(int Altura){
        this.Altura = Altura;
    }
    
    public String getNome(){
        return this.Nome;
    }
            
    public int getNascimento(){
        return this.Nascimento;
    } 
            
    public float getAltura(){
        return this.Altura;
    }
    
    public static void main(String[] args) {
      //Nome
	    Scanner input = new Scanner ( System.in );
	    System.out.println("Informe o nome da pessoa: ");
    	String Name = input.next();
    	
    	//Ano de Nascimento
    	Scanner input1 = new Scanner ( System.in );
	    System.out.println("Informe o ano de nascimento da pessoa: ");
    	String Ano = input1.next();
    	int Nasce = Integer.parseInt(Ano);
    	
    	//Altura
    	Scanner input2 = new Scanner ( System.in );
	    System.out.println("Informe a altura da pessoa: ");
    	String Alt = input2.next();
    	float Altur = Integer.parseInt(Alt);
    	
	    Main pessoa = new Main();
	    pessoa.Nome = Name;
	    pessoa.Nascimento = 2021 - Nasce;
	    pessoa.Altura = Altur;
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getNascimento());
		System.out.println(pessoa.getAltura());
	}

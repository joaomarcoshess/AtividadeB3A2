import java.util.Scanner;


public class Pessoa
{
    
    private String Nome; 
    private int Nascimento; 
    private float Altura;
    
    public void setNome(String Nome){
        Scanner input = new Scanner ( System.in );
	    System.out.println("Informe o nome da pessoa: ");
    	String Name = input.next();
        this.Nome = Name;
    }
        
    public void setNascimento(int Nascimento){
        Scanner input1 = new Scanner ( System.in );
        System.out.println(" ");
	    System.out.println("Informe o ano de nascimento da pessoa: ");
    	String Ano = input1.next();
    	int Nasce = Integer.parseInt(Ano);
        this.Nascimento = 2021 - Nasce;
    }
        
    public void setAltura(int Altura){
        Scanner input2 = new Scanner ( System.in );
        System.out.println(" ");
	    System.out.println("Informe a altura da pessoa: ");
    	String Alt = input2.next();
    	float Altur = Integer.parseInt(Alt);
    	Altur = Altur / 100;
        this.Altura = Altur;
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
	    Pessoa pessoa = new Pessoa();
	    pessoa.setNome("Alex");
	    pessoa.setNascimento(1);
	    pessoa.setAltura(1);
	    System.out.println(" ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getNascimento());
		System.out.println("Altura: " + pessoa.getAltura());
	}
}

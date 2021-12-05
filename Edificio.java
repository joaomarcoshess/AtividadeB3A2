import java.util.Scanner;

public class Edificio
{
    
    private int capacidade, totalandar, andar = 0, pessoasnoelevador = 0;
    Scanner input = new Scanner ( System.in );
	Scanner input1 = new Scanner ( System.in );
    
    public void Inicializa(int capacidad, int totalanda){
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Informe a capacidade de pessoas no elevador: ");
        String pessoal = input.next();
        capacidad = Integer.parseInt(pessoal);
        this.capacidade = capacidad;
        
        System.out.println("Informe o total de andares do edifício: ");
        String andando = input1.next();
        totalanda = Integer.parseInt(andando);
        this.totalandar = totalanda;
        System.out.println(" ");
    }
    
    public void Entra(){
        if(this.pessoasnoelevador < this.capacidade){
            this.pessoasnoelevador = this.pessoasnoelevador + 1;
        }else{
            System.out.println("Não há mais espaço no elevador...");
        }    
    }
    
    public void Sai(){
        if(this.pessoasnoelevador > 0){
            this.pessoasnoelevador = this.pessoasnoelevador - 1;
        }else{
            System.out.println("Não há pessoas para saírem do elevador...");
        }  
    }
    
    public void Sobe(){
        if(this.andar < this.totalandar){
            this.andar = this.andar + 1;
        }else{
            System.out.println("Você chegou no último andar...");
        }
    }
    
    public void Desce(){
        if(this.andar > 0){
            this.andar = this.andar - 1;
        }else{
            System.out.println("Você está no térreo...");
        }
        
    }
    
    public void Status(){
        System.out.println(" ");
        System.out.println("Total de andar do edifício: ");
        System.out.println(this.totalandar);
        System.out.println(" ");
        System.out.println("Capacidade de pessoas no elevador: ");
        System.out.println(this.capacidade);
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Pessoas no elevador: ");
        System.out.println(this.pessoasnoelevador);
        System.out.println(" ");
        System.out.println("Andar atual: ");
        System.out.println(this.andar);
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
    }
    
    
    public int getAndar(){
        return andar;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public int getTotalandar(){
        return totalandar;
    }
    
    public int getPessoas(){
        return pessoasnoelevador;
    }
    
    public void setAndar(){
        this.totalandar = this.totalandar;
    }
    
    public void setCapacidade(){
        this.capacidade = this.capacidade;
    }
    
    public void setTotalandar(){
        this.totalandar = this.totalandar;
    }
    
    public void setPessoas(){
        this.pessoasnoelevador = this.pessoasnoelevador;
    }
    
	public static void main(String[] args) {
	    Edificio elevador = new Edificio();
	    System.out.println("Bem vindo a este edifício! ");
	    elevador.Inicializa(1, 2);
	    //Fazer switch case:
	    while(true){
    	    Scanner inserircase = new Scanner ( System.in );
    	    System.out.println("----------------------------------------");
    	    System.out.println(" ");
    	    System.out.println("Aqui estão algumas operações a serem realizadas:");
    	    System.out.println("1 - Pessoa entrando no elevador. ");
    	    System.out.println("2 - Pessoa saindo no elevador. ");
    	    System.out.println("3 - Elevador subindo de andar. ");
    	    System.out.println("4 - Elevador descendo de andar. ");
    	    System.out.println("5 - Encerrar operação. ");
    	    System.out.println(" ");
    	    elevador.Status();
    	    String operacao = inserircase.next();
    	    int operar = Integer.parseInt(operacao);
    	    switch(operar){
    	        case 1:
    	            elevador.Entra();
    	            System.out.flush();
    	            break;
    	        case 2:
    	            elevador.Sai();
    	            System.out.flush();
    	            break;
    	        case 3:
    	            elevador.Sobe();
    	            System.out.flush();
    	            break;
    	        case 4:
    	            elevador.Desce();
    	            System.out.flush();
    	            break;
    	        case 5:
    	            System.exit(0);
    	            break;
    	    }  
    	    elevador.Status();
    	        
	    }
	}
	
}

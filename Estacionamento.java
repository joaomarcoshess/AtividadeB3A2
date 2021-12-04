import java.util.Scanner;

public class Estacionamento
{
    private double horaentrada = 0, horasaida = 0, calculo = 0, aux = 0, preco = 0; 
    private int placa = 0;
    private String modelo = "Corsa";
    Scanner input = new Scanner ( System.in );
    
    public void setplaca(int placa){
        System.out.println("Informe a placa de seu veículo: ");
        String aplaca = input.next();
        int plaquinha = Integer.parseInt(aplaca);
        this.placa = plaquinha;
    }
    
    public void setmodelo(String modelo){
        System.out.println(" ");
        System.out.println("Informe o modelo de seu veículo: ");
        String omodelo = input.next();
        this.modelo = omodelo;
    }
    
    public void setCalculaHora(double horaentrada, double horasaida, double calculo, double preco, double aux){
        System.out.println(" ");
        System.out.println("Informe o horário de entrada do seu veículo: ");
        String horaentra = input.next();
        int horae = Integer.parseInt(horaentra);
        this.horaentrada = horae;
        System.out.println(" ");
        System.out.println("Informe o horário de saída do seu veículo: ");
        String horasai = input.next();
        int horas = Integer.parseInt(horasai);
        this.horasaida = horas;
        if(this.horaentrada > 23 || this.horasaida > 23){
            System.out.println("Não é possível informar um horário maior que o sistema de 24 horas. ");
        }
        if(this.horaentrada < this.horasaida){
            this.calculo = this.horasaida - this.horaentrada;
            this.preco = this.calculo * 1.5;
        }else{
            this.aux = 24 - this.horaentrada;
            this.calculo = this.aux + this.horasaida;
            this.preco = this.calculo * 1.5;
        }
        
    }
    
    
    public int getplaca(){
        return this.placa;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public double gethoraentrada(){
        return this.horaentrada;
    }
    
    public double gethorasaida(){
        return this.horasaida;
    }
    
    public double gethoras(){
        return this.calculo;
    }
    
    public double getpreco(){
        return this.preco;
    }
    
	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento();
		estacionamento.setplaca(1);
		estacionamento.setmodelo("Corsa");
		estacionamento.setCalculaHora(1,2,3,4,5);
		System.out.println(" ");
		System.out.println("Placa: " + estacionamento.getplaca());
		System.out.println(" ");
		System.out.println("Modelo: " + estacionamento.getmodelo());
		System.out.println(" ");
		System.out.println("Horário de entrada: " + estacionamento.gethoraentrada());
		System.out.println(" ");
		System.out.println("Horário de saída: " + estacionamento.gethorasaida());
		System.out.println(" ");
		System.out.println("Horas ocupadas no estacionamento: " + estacionamento.gethoras());
		System.out.println(" ");
		System.out.println("Valor total a ser pago: R$" + estacionamento.getpreco() + " reais");
	}
}

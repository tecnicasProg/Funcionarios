package main.java.tecnicas.Funcionarios;

public class Funcionario {
	int matricula, nroDependentes;
	String nome;
	double salarioBase;
	boolean insalubridade;
	
	
    public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {   
    	this.matricula = matricula;
    	this.nome = nome;
    	this.salarioBase = salarioBase;
    	this.nroDependentes = nroDependentes;
    	this.insalubridade = insalubridade;
    	
    }
    public int getMatricula() { 
    	return matricula;
    }
    public String getNome() {
    	return nome;
    }
    public double getSalarioBase() {   
    	return salarioBase;
    }
    public int getNroDependentes() {  
    	return nroDependentes;
    }
    public boolean getInsalubridade() {    
    	return insalubridade;
    }
    public double getSalarioBruto() {  
    	double salarioBruto = salarioBase;
    	if(insalubridade) {
    		salarioBruto = salarioBruto*1.1;
    	}
    	salarioBruto = salarioBruto*(1+(nroDependentes/100));
    	return salarioBruto;
    }
    public double getSalarioLiquido() {  
    	double inss = salarioBase*0.045;
    	double impostoR = 0;
    	if(inss>5000) {
    		inss = 5000;
    	}
    	if(salarioBase>2000) {
    		impostoR = salarioBase*0.12;
    	}
    	if(salarioBase>5000) {
    		impostoR = salarioBase*0.275;
    	}
    	return getSalarioBruto()-inss-impostoR;
    }
}
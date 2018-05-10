package br.com.ex3.teste;

public class Pessoa {

	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String nome;
	int idade;
	double peso;
	double altura;
	
	
	public Pessoa(String string, int int1, double double1, double double2) {
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	


public double ICM (double altura, double peso) {
	
	double resultado;
	resultado=( getAltura()*getAltura())/getPeso();
	
	return resultado;
	 
}
@Override
public String toString() {
	return "Pessoa [id="+id+"nome="+nome+"idade="+idade+"altura= "+altura+"peso= "+peso+"]";
}

}

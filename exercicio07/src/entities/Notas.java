package entities;

public class Notas {
	
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double faltamPontos() {
		return 60 - mediaNota();
	}

}

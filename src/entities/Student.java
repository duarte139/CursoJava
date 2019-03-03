package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalNota() {
		return nota1 + nota2 + nota3;
	}
	public double missingPoints() {
		if(finalNota()<60.00) {
			return 60.00 - finalNota();
		}else {
			return 0.00;
		}
	}
}

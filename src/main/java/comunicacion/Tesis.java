package comunicacion;

import java.util.*;

public class Tesis extends Escrito {
	
	private String idea;
	private String [] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas,
			String idea, String [] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.setIdea(idea);
		this.setArgumentos(argumentos);
		this.setConclusion(conclusion);
		this.setReferencias(referencias);
		this.setInterpretacion(interpretacion);
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String [] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String [] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return getPaginas() * palabrasPagina * 5;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" +
				this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
	}

}

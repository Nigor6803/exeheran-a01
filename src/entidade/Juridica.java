package entidade;

public class Juridica extends Contribuinte {
	
	private Integer numeroDeEmpregados;
	
	public Juridica() {
		super();
	}
	
	public Juridica(String nome,double rendimentoAnual, int numeroDeEmpregados) {
		super(nome,rendimentoAnual);
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
	
	public int getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}
	
	public void setNumeroDeEmpregados(int numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}
	
	@Override
	public double taxa() {
		double taxaBasica = (numeroDeEmpregados > 10) ? getRendimentoAnual()*0.14 : getRendimentoAnual()*0.16;
		
		return taxaBasica;
	};
}

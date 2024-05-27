package entidade;

public class Individual extends Contribuinte {
	
	private Double despesaComSaude;
	
	public Individual() {
		super();
	}
	
	public Individual(String nome, double RendimentoAnual,double despesaComSaude) {
		super(nome,RendimentoAnual);
		this.despesaComSaude = despesaComSaude;
	}
	
	public double getDespesaComSaude() {
		return despesaComSaude;
	}
	
	public void setDespesaComSaude(double despesaComSaude) {
		this.despesaComSaude = despesaComSaude;
	}
	
	@Override
	public double taxa() {
		return (getRendimentoAnual()/4)-(despesaComSaude/2);
	};
}

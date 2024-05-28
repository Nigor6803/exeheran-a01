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
		
		//double taxaBasica = (getRendimentoAnual() < 20000.0) ? getRendimentoAnual()*0.15 : getRendimentoAnual()*0.25;
		
		double taxaBasica;
		if (getRendimentoAnual()<20000.0) {
			taxaBasica = getRendimentoAnual()*0.15;
		}
		else {
			taxaBasica = getRendimentoAnual()*0.25;
		}
		
		taxaBasica = taxaBasica - (getDespesaComSaude()*0.50);
		if(taxaBasica < 0) {
			return 0.0;
		}
		else {
			return taxaBasica;
		}
	};
}

package br.com.testeobjeto;

public class Filtros {
	
	private Boolean filtrarContasVencidas;
	private Boolean filtrarContasPagas;
	private Boolean filtrarContasNaoPagas;
	private Boolean filtrarContasNaoVencidas;
	
	public Boolean getFiltrarContasVencidas() {
		return filtrarContasVencidas;
	}
	public void setFiltrarContasVencidas(Boolean filtrarContasVencidas) {
		this.filtrarContasVencidas = filtrarContasVencidas;
	}
	public Boolean getFiltrarContasPagas() {
		return filtrarContasPagas;
	}
	public void setFiltrarContasPagas(Boolean filtrarContasPagas) {
		this.filtrarContasPagas = filtrarContasPagas;
	}
	public Boolean getFiltrarContasNaoPagas() {
		return filtrarContasNaoPagas;
	}
	public void setFiltrarContasNaoPagas(Boolean filtrarContasNaoPagas) {
		this.filtrarContasNaoPagas = filtrarContasNaoPagas;
	}
	public Boolean getFiltrarContasNaoVencidas() {
		return filtrarContasNaoVencidas;
	}
	public void setFiltrarContasNaoVencidas(Boolean filtrarContasNaoVencidas) {
		this.filtrarContasNaoVencidas = filtrarContasNaoVencidas;
	}
	

}

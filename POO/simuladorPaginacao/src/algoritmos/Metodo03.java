package algoritmos;

import java.util.Random;

public class Metodo03 {
	long memFisica[];
	long arrayAcessos[];
	long memVirtual[];
	public double taxaOtimo;
	public String dados="";

	public Metodo03(long memFisica[], long memVirtual[], long arrayAcessos[]) {
		this.memFisica=memFisica;
		this.memVirtual=memVirtual;
		this.arrayAcessos=arrayAcessos;
	}

	public  void inicializarMemoria() {
		for(int i=0; i<memFisica.length; i++) {
			memFisica[i]= -1;
		}
	}

	//CORRETO
	public void algoritmoOtimo() {
		long start = System.currentTimeMillis();
		taxaOtimo=0;
		int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		int[] arrayTempos = new int[memFisica.length];
		for(int w=0; w<memFisica.length; w++) arrayTempos[w]=0;

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					encontrou = true;
					arrayTempos[j] = i;
					//arrayTempos[j] = j;
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[ultimaPosic] == -1) {
					//arrayTempos[ultimaPosic] = i;
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					int maiorTempo=0, maiorTempoPosic=0;
					for(int q=0; q<memFisica.length; q++) arrayTempos[q]=0;

					for(int z=0; z<memFisica.length; z++) {
						for(int x=i; x<arrayAcessos.length; x++) {
							if(arrayAcessos[x] == memFisica[z]) {
								arrayTempos[z] = x;
								break;
							}
						}
					}
					for(int m=0; m<memFisica.length; m++) {
						if(maiorTempo < arrayTempos[m]) {
							maiorTempo = arrayTempos[m];
							maiorTempoPosic = m;
						}
					}
					memFisica[maiorTempoPosic] = arrayAcessos[i];
					miss++;
					substituidas++;
					ultimaPosic++;
				}
			}
			encontrou = false;
		}
		taxaOtimo=hit;
		long end = System.currentTimeMillis();
		
		System.out.println("\n_ALGORITMO ÓTIMO_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("PÁGINAS SUBSTITUIDAS: "+substituidas);
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+ "%");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
		"<html>"
			+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:20px;'>"
				+ "<h3 style='text-align:center;text-decoration: underline;'>ALGORITMO ÓTIMO</h3>"
				+ "<p style='color:green'>HIT: "+hit+"</p>"
				+ "<p style='color:red'>MISS: "+miss+"</p>"
				+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
				+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
				+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
			+ "</div>"
		+ "</html>";
	}
	
	//CORRETO
	public void algoritmoAleatorio() {
		long start = System.currentTimeMillis();
		int hit=0, miss=0, aux=0, ultimaPosic=0, substituidas=0;
		inicializarMemoria();

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic == memFisica.length)ultimaPosic=0;
			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					aux = 1;
					break;
				}
			}
			if(aux==0) {
				if(memFisica[ultimaPosic] == -1) {
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					Random random = new Random();
					int posic = random.nextInt(memFisica.length);

					memFisica[posic] = arrayAcessos[i];
					miss++;
					substituidas++;
					ultimaPosic++;
				}
			}
			aux = 0;
		}
		long end = System.currentTimeMillis();

		System.out.println("\n_ALEATÓRIO_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+"%");
		double gapNum =(100-(hit*100/taxaOtimo));
		String gap=String.format("%.2f", gapNum);
		System.out.printf("GAP: %.2f", gapNum);System.out.print("% pior que o ÓTIMO\n");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
				"<html>"
					+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:10px;'>"
						+ "<h3 style='text-align:center;text-decoration: underline;'>ALGORITMO ALEATÓRIO</h3>"
						+ "<p style='color:green'>HIT: "+hit+"</p>"
						+ "<p style='color:red'>MISS: "+miss+"</p>"
						+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
						+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
						+ "<p style='color:black'>GAP: "+gap+ "%</p>"
						+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
					+ "</div>"
				+ "</html>";
	}

	//CORRETO
	public void FIFO() {
		long start = System.currentTimeMillis();
		int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					encontrou = true;
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[ultimaPosic] == -1) {
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
					substituidas++;
				}
			}
			encontrou = false;
		}
		long end = System.currentTimeMillis();
		System.out.println("\n_FIFO_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+"%");
		double gapNum =(100-(hit*100/taxaOtimo));
		String gap=String.format("%.2f", gapNum);
		System.out.printf("GAP: %.2f", gapNum);System.out.print("% pior que o ÓTIMO\n");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
				"<html>"
					+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:10px;'>"
						+ "<h3 style='text-align:center;text-decoration: underline;'>ALGORÍTMO FIFO</h3>"
						+ "<p style='color:green'>HIT: "+hit+"</p>"
						+ "<p style='color:red'>MISS: "+miss+"</p>"
						+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
						+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
						+ "<p style='color:black'>GAP: "+gap+ "%</p>"
						+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
					+ "</div>"
				+ "</html>";
	}

	//CORRETO
	public void segundaChance() {
		long start = System.currentTimeMillis();
		int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		int[] arrayReferencia = new int[memFisica.length];
		for(int i=0; i<memFisica.length; i++) {
			arrayReferencia[i]=0;
		}

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					encontrou = true;
					arrayReferencia[j]=1;
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[ultimaPosic] == -1) {
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					//int k=0;
					while(arrayReferencia[ultimaPosic] == 1) {
						arrayReferencia[ultimaPosic] = 0;
						ultimaPosic++;
						if(ultimaPosic==arrayReferencia.length)ultimaPosic=0;
					}
					memFisica[ultimaPosic] = arrayAcessos[i];
					ultimaPosic++;
					substituidas++;
					miss++;
				}
			}
			encontrou = false;
		}
		long end = System.currentTimeMillis();
		System.out.println("\n_SEGUNDA CHANCE_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+"%");
		double gapNum =(100-(hit*100/taxaOtimo));
		String gap=String.format("%.2f", gapNum);
		System.out.printf("GAP: %.2f", gapNum);System.out.print("% pior que o ÓTIMO\n");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
				"<html>"
					+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:10px;'>"
						+ "<h3 style='text-align:center;text-decoration: underline;'>SEGUNDA CHANCE</h3>"
						+ "<p style='color:green'>HIT: "+hit+"</p>"
						+ "<p style='color:red'>MISS: "+miss+"</p>"
						+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
						+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
						+ "<p style='color:black'>GAP: "+gap+ "%</p>"
						+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
					+ "</div>"
				+ "</html>";
	}

	//REZETAR OS BYTES
	public void naoUsadaRecentemente() {
		long start = System.currentTimeMillis();
		int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		int[] arrayReferencia = new int[memFisica.length];
		int[] arrayModifica = new int[memFisica.length];

		for(int i=0; i<memFisica.length; i++) {
			arrayReferencia[i]=0;
			arrayModifica[i]=0;
		}

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					arrayReferencia[j]=1;
					encontrou = true;
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[ultimaPosic] == -1) {
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					int[] arrayClasse = new int[memFisica.length];
					int achouClasse=0, aux=0;

					if(achouClasse==0) {
						for(int k=0; k<memFisica.length; k++) {
							//CLASSE 0
							if(arrayReferencia[k]==0 && arrayModifica[k]==0) {
								arrayClasse[aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(int k=0; k<memFisica.length; k++) {
							//CLASSE 1
							if(arrayReferencia[k]==0 && arrayModifica[k]==1) {
								arrayClasse[aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(int k=0; k<memFisica.length; k++) {
							//CLASSE 2
							if(arrayReferencia[k]==1 && arrayModifica[k]==0) {
								arrayClasse[aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(int k=0; k<memFisica.length; k++) {
							//CLASSE 3
							if(arrayReferencia[k]==1 && arrayModifica[k]==1) {
								arrayClasse[aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}

					Random random = new Random();
					int posic = random.nextInt(arrayClasse.length);
					arrayModifica[arrayClasse[posic]] = 1;
					memFisica[arrayClasse[posic]] = arrayAcessos[i];
					miss++;
					substituidas++;
					ultimaPosic++;
				}
			}
			encontrou = false;
		}

		long end = System.currentTimeMillis();
		System.out.println("\n_NÃO USADA RECENTEMENTE_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+"%");
		double gapNum =(100-(hit*100/taxaOtimo));
		String gap=String.format("%.2f", gapNum);
		System.out.printf("GAP: %.2f", gapNum);System.out.print("% pior que o ÓTIMO\n");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
				"<html>"
					+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:10px;'>"
						+ "<h3 style='text-align:center;text-decoration: underline;'>NÃO USADA RECENTEMENTE</h3>"
						+ "<p style='color:green'>HIT: "+hit+"</p>"
						+ "<p style='color:red'>MISS: "+miss+"</p>"
						+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
						+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
						+ "<p style='color:black'>GAP: "+gap+ "%</p>"
						+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
					+ "</div>"
				+ "</html>";
	}

	//VERIFRICAR HITS
	public void menosRecentementeUsada() {
		long start = System.currentTimeMillis();
		int hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		int[] arrayTempos = new int[memFisica.length];

		for(int i=0; i<memFisica.length; i++) {
			arrayTempos[i]=0;
		}

		for(int i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[j] == arrayAcessos[i]) {
					hit++;
					encontrou = true;
					arrayTempos[j] = j;
					//arrayTempos[j] = i;
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[ultimaPosic] == -1) {
					arrayTempos[ultimaPosic] = i;
					memFisica[ultimaPosic] = arrayAcessos[i];
					miss++;
					ultimaPosic++;
				}
				else {
					int maiorTempo=0, maiorTempoPosic=0;
					for(int k=0; k<memFisica.length; k++) {
						if(maiorTempo < arrayTempos[k]) {
							maiorTempo = arrayTempos[k];
							maiorTempoPosic = k;
						}
					}
					memFisica[maiorTempoPosic] = arrayAcessos[i];
					miss++;
					substituidas++;
					ultimaPosic++;
				}
			}
			encontrou = false;
		}
		long end = System.currentTimeMillis();
		System.out.println("\n_MENOS RECENTEMENTE USADA_");
		System.out.println("HIT: "+hit);
		System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
		System.out.println("TAXA: "+hit*100/arrayAcessos.length+"%");
		double gapNum =(100-(hit*100/taxaOtimo));
		String gap=String.format("%.2f", gapNum);
		System.out.printf("GAP: %.2f", gapNum);System.out.print("% pior que o ÓTIMO\n");
		System.out.println("TEMPO: "+(end-start)+"ms");
		
		dados =
				"<html>"
					+ "<div style='font-weight: lighter;color:black;border:1px solid black;border-radius:100px;padding:10px;'>"
						+ "<h3 style='text-align:center;text-decoration: underline;'>MENOS RECENTEMENTE USADA</h3>"
						+ "<p style='color:green'>HIT: "+hit+"</p>"
						+ "<p style='color:red'>MISS: "+miss+"</p>"
						+ "<p style='color:black'>SUBSTITUIDAS: "+substituidas+"</p>"
						+ "<p style='color:black'>TAXA: "+hit*100/arrayAcessos.length+ "%</p>"
						+ "<p style='color:black'>GAP: "+gap+ "%</p>"
						+ "<p style='color:black'>TEMPO: "+(end-start)+"ms</p>"
					+ "</div>"
				+ "</html>";
	}

}

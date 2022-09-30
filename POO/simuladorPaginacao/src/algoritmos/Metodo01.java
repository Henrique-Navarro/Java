package algoritmos;

import java.util.Random;

public class Metodo01 {
	long memFisica[];
	long arrayAcessos[];
	long memVirtual[];
	double taxaOtimo;
	int vezes=0,i=0,j=0, hit = 0, miss = 0, ultimaPosic = 0, substituidas=0, aux=0, passo=0;

	public Metodo01(long memFisica[], long memVirtual[], long arrayAcessos[]) {
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
		if(i<arrayAcessos.length) {
			while(passo==0){
				boolean encontrou=false;

				int[] arrayTempos = new int[memFisica.length];
				for(int w=0; w<memFisica.length; w++) arrayTempos[w]=0;

				if(ultimaPosic==memFisica.length) ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						encontrou = true;
						arrayTempos[j] = i;
						//arrayTempos[j] = j;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(!encontrou) {
					if(memFisica[ultimaPosic] == -1) {
						//arrayTempos[ultimaPosic] = i;
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						passo=1;
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
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				encontrou = false;
				i++;
			}
		}
		else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}

	//CORRETO
	public void algoritmoAleatorio() {
		if(i<arrayAcessos.length) {
			while(passo==0) {
				if(ultimaPosic == memFisica.length)ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						aux = 1;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(aux==0) {
					if(memFisica[ultimaPosic] == -1) {
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						passo=1;
						Random random = new Random();
						int posic = random.nextInt(memFisica.length);

						memFisica[posic] = arrayAcessos[i];
						miss++;
						substituidas++;
						ultimaPosic++;

						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				i++;
				aux = 0;
			}
		}
		else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}

	//CORRETO
	public void FIFO() {
		if(i<arrayAcessos.length) {

			while(passo==0) {
				boolean encontrou=false;
				if(ultimaPosic==memFisica.length) ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						encontrou = true;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(!encontrou) {
					if(memFisica[ultimaPosic] == -1) {
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						passo=1;
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						substituidas++;
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				encontrou = false;
				i++;
			}
		}else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}

	//CORRETO
	public void segundaChance() {

		if(i<arrayAcessos.length) {
			while(passo==0) {
				boolean encontrou=false;
				int[] arrayReferencia = new int[memFisica.length];
				for(int m=0; m<memFisica.length; m++) {
					arrayReferencia[m]=0;
				}


				if(ultimaPosic==memFisica.length) ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						encontrou = true;
						arrayReferencia[j]=1;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(!encontrou) {
					if(memFisica[ultimaPosic] == -1) {
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						//int k=0;
						passo=1;
						while(arrayReferencia[ultimaPosic] == 1) {
							arrayReferencia[ultimaPosic] = 0;
							ultimaPosic++;
							if(ultimaPosic==arrayReferencia.length)ultimaPosic=0;
						}
						memFisica[ultimaPosic] = arrayAcessos[i];
						ultimaPosic++;
						substituidas++;
						miss++;
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				encontrou = false;
				i++;
			}
		}else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}

	//REZETAR OS BYTES
	public void naoUsadaRecentemente() {

		if(i<arrayAcessos.length) {
			while(passo==0) {
				boolean encontrou=false;

				int[] arrayReferencia = new int[memFisica.length];
				int[] arrayModifica = new int[memFisica.length];

				for(int m=0; m<memFisica.length; m++) {
					arrayReferencia[m]=0;
					arrayModifica[m]=0;
				}
				if(ultimaPosic==memFisica.length) ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						arrayReferencia[j]=1;
						encontrou = true;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(!encontrou) {
					if(memFisica[ultimaPosic] == -1) {
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						passo=1;
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
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				encontrou = false;
				i++;
			}
		}else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}

	//VERIFRICAR HITS
	public void menosRecentementeUsada() {

		if(i<arrayAcessos.length) {
			while(passo==0) {

				boolean encontrou=false;

				int[] arrayTempos = new int[memFisica.length];

				for(int m=0; m<memFisica.length; m++) {
					arrayTempos[m]=0;
				}
				if(ultimaPosic==memFisica.length) ultimaPosic=0;

				for(int j=0; j<memFisica.length; j++) {
					if(memFisica[j] == arrayAcessos[i]) {
						hit++;
						encontrou = true;
						arrayTempos[j] = j;
						//arrayTempos[j] = i;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
						break;
					}
				}
				if(!encontrou) {
					if(memFisica[ultimaPosic] == -1) {
						arrayTempos[ultimaPosic] = i;
						memFisica[ultimaPosic] = arrayAcessos[i];
						miss++;
						ultimaPosic++;
						/*System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");*/
					}
					else {
						passo=1;
						
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
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					}
				}
				encontrou = false;
				i++;
			}
		}
		else {
			System.out.println("COMPLETO");
		}
		passo=0;
	}
}

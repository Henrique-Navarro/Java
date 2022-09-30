package algoritmos;

import java.util.Random;

public class Metodo02 {
	long memFisica[];
	long arrayAcessos[];
	long memVirtual[];
	double taxaOtimo;

	public Metodo02(long memFisica[], long memVirtual[], long arrayAcessos[]) {
		this.memFisica=memFisica;
		this.memVirtual=memVirtual;
		this.arrayAcessos=arrayAcessos;
	}

	public  void inicializarMemoria() {
		for(long i=0; i<memFisica.length; i++) {
			memFisica[(int)i]= -1;
		}
	}

	//CORRETO
	public void algoritmoOtimo() {
		System.out.println("\n_ALGORITMO ÓTIMO_");
		taxaOtimo=0;
		long hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		long[] arrayTempos = new long[(int)memFisica.length];
		for(long w=0; w<memFisica.length; w++) arrayTempos[(int)w]=0;

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(long j=0; j<memFisica.length; j++) {
				if(memFisica[(int)j] == arrayAcessos[(int)i]) {
					hit++;
					encontrou = true;
					arrayTempos[(int)j] = i;
					//arrayTempos[j] = j;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[(int)ultimaPosic] == -1) {
					//arrayTempos[ultimaPosic] = i;
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					long maiorTempo=0;
					long maiorTempoPosic=0;
					for(long q=0; q<memFisica.length; q++) arrayTempos[(int)q]=0;

					for(long z=0; z<memFisica.length; z++) {
						for(long x=i; x<arrayAcessos.length; x++) {
							if(arrayAcessos[(int)x] == memFisica[(int)z]) {
								arrayTempos[(int)z] = x;
								break;
							}
						}
					}
					for(long m=0; m<memFisica.length; m++) {
						if(maiorTempo < arrayTempos[(int)m]) {
							maiorTempo = arrayTempos[(int)m];
							maiorTempoPosic = m;
						}
					}
					memFisica[(int)maiorTempoPosic] = arrayAcessos[(int)i];
					miss++;
					substituidas++;
					ultimaPosic++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			encontrou = false;
		}
		taxaOtimo=hit;
	}

	//CORRETO
	public void algoritmoAleatorio() {
		System.out.println("\n_ALEATÓRIO_");
		long hit=0, miss=0, aux=0, ultimaPosic=0, substituidas=0;
		inicializarMemoria();

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic == memFisica.length)ultimaPosic=0;
			for(int j=0; j<memFisica.length; j++) {
				if(memFisica[(int)j] == arrayAcessos[(int)i]) {
					hit++;
					aux = 1;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(aux==0) {
				if(memFisica[(int)ultimaPosic] == -1) {
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					Random random = new Random();
					int posic = random.nextInt(memFisica.length);

					memFisica[posic] = arrayAcessos[(int)i];
					miss++;
					substituidas++;
					ultimaPosic++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			aux = 0;
		}
	}

	//CORRETO
	public void FIFO() {
		System.out.println("\n_FIFO_");
		long hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(long j=0; j<memFisica.length; j++) {
				if(memFisica[(int)j] == arrayAcessos[(int)i]) {
					hit++;
					encontrou = true;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[(int)ultimaPosic] == -1) {
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					substituidas++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			encontrou = false;
		}
	}

	//CORRETO
	public void segundaChance() {
		System.out.println("\n_SEGUNDA CHANCE_");
		long hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		long[] arrayReferencia = new long[memFisica.length];
		for(long i=0; i<memFisica.length; i++) {
			arrayReferencia[(int)i]=0;
		}

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(long j=0; j<memFisica.length; j++) {
				if(memFisica[(int)j] == arrayAcessos[(int)i]) {
					hit++;
					encontrou = true;
					arrayReferencia[(int)j]=1;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[(int)ultimaPosic] == -1) {
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					//int k=0;
					while(arrayReferencia[(int)ultimaPosic] == 1) {
						arrayReferencia[(int)ultimaPosic] = 0;
						ultimaPosic++;
						if(ultimaPosic==arrayReferencia.length)ultimaPosic=0;
					}
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					ultimaPosic++;
					substituidas++;
					miss++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			encontrou = false;
		}
	}

	//REZETAR OS BYTES
	public void naoUsadaRecentemente() {
		System.out.println("\n_NÃO USADA RECENTEMENTE_");
		long hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		long[] arrayReferencia = new long[memFisica.length];
		long[] arrayModifica = new long[memFisica.length];

		for(long i=0; i<memFisica.length; i++) {
			arrayReferencia[(int)i]=0;
			arrayModifica[(int)i]=0;
		}

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(long j=0; j<memFisica.length; j++) {
				if(memFisica[(int)j] == arrayAcessos[(int)i]) {
					hit++;
					arrayReferencia[(int)j]=1;
					encontrou = true;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[(int)ultimaPosic] == -1) {
					memFisica[(int)ultimaPosic] = arrayAcessos[(int)i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					long[] arrayClasse = new long[memFisica.length];
					long achouClasse=0, aux=0;

					if(achouClasse==0) {
						for(long k=0; k<memFisica.length; k++) {
							//CLASSE 0
							if(arrayReferencia[(int)k]==0 && arrayModifica[(int)k]==0) {
								arrayClasse[(int) aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(long k=0; k<memFisica.length; k++) {
							//CLASSE 1
							if(arrayReferencia[(int) k]==0 && arrayModifica[(int) k]==1) {
								arrayClasse[(int) aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(long k=0; k<memFisica.length; k++) {
							//CLASSE 2
							if(arrayReferencia[(int) k]==1 && arrayModifica[(int) k]==0) {
								arrayClasse[(int) aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}
					if(achouClasse==0) {
						for(long k=0; k<memFisica.length; k++) {
							//CLASSE 3
							if(arrayReferencia[(int) k]==1 && arrayModifica[(int) k]==1) {
								arrayClasse[(int) aux] = k;
								achouClasse=1;
								aux++;
							}
						}
					}

					Random random = new Random();
					long posic = random.nextInt(arrayClasse.length);
					arrayModifica[(int) arrayClasse[(int) posic]] = 1;
					memFisica[(int) arrayClasse[(int) posic]] = arrayAcessos[(int) i];
					miss++;
					substituidas++;
					ultimaPosic++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			encontrou = false;
		}
	}

	//VERIFRICAR HITS
	public void menosRecentementeUsada() {
		System.out.println("\n_MENOS RECENTEMENTE USADA_");
		long hit = 0, miss = 0, ultimaPosic = 0, substituidas=0;
		boolean encontrou=false;
		inicializarMemoria();

		long[] arrayTempos = new long[memFisica.length];

		for(long i=0; i<memFisica.length; i++) {
			arrayTempos[(int) i]=0;
		}

		for(long i=0; i<arrayAcessos.length; i++) {
			if(ultimaPosic==memFisica.length) ultimaPosic=0;

			for(long j=0; j<memFisica.length; j++) {
				if(memFisica[(int) j] == arrayAcessos[(int) i]) {
					hit++;
					encontrou = true;
					arrayTempos[(int) j] = j;
					//arrayTempos[j] = i;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
					break;
				}
			}
			if(!encontrou) {
				if(memFisica[(int) ultimaPosic] == -1) {
					arrayTempos[(int) ultimaPosic] = i;
					memFisica[(int) ultimaPosic] = arrayAcessos[(int) i];
					miss++;
					ultimaPosic++;
					/*try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+") (pageFault: "+pageFault+")");
					} catch (InterruptedException e) {e.printStackTrace();}*/
				}
				else {
					long maiorTempo=0, maiorTempoPosic=0;
					for(long k=0; k<memFisica.length; k++) {
						if(maiorTempo < arrayTempos[(int) k]) {
							maiorTempo = (int) arrayTempos[(int) k];
							maiorTempoPosic = (int) k;
						}
					}
					memFisica[(int) maiorTempoPosic] = arrayAcessos[(int) i];
					miss++;
					substituidas++;
					ultimaPosic++;
					try {
						Thread.sleep(1000);
						System.out.println("\nHIT: "+hit);
						System.out.println("MISS: "+miss+" (substituidas: "+substituidas+")");
					} catch (InterruptedException e) {e.printStackTrace();}
				}
			}
			encontrou = false;
		}
	}
}

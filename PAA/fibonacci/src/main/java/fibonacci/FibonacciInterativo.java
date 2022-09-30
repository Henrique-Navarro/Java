package fibonacci;
public class FibonacciInterativo {
    
    int atual, anterior;

    FibonacciInterativo(int n) {
        atual = 0;anterior = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
        }
        System.out.println("_Fibonacci Interativo_\n" + atual);
    }
}

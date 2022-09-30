package fibonacci;
public class FibonacciRecursivo {

    int n;

    FibonacciRecursivo(int n) {
        this.n = n;
        System.out.println("_Fibonacci Recursivo\n" + calcularFibo(n));
    }

    public int calcularFibo(int n) {
        return (n < 2) ? n : calcularFibo(n - 1) + calcularFibo(n - 2);
    }
}

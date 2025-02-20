package operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x = 4, y = 7, z = 12;
        
        boolean r = (x < y ^ y < z);
        
        System.out.println(r);
    }
}

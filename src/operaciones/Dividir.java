package operaciones;

public class Dividir {
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void dividir(int numero1, int numero2) {
        try {
            this.setResultado(numero1 / numero2);
            System.out.println("Resultado: " + this.getResultado());
        } catch (Exception e) {
            System.err.println("Error: " + e);
        } finally {
            System.out.println("Fin de la operación");
        }
        
    }
}

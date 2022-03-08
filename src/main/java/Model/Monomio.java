package Model;

public class Monomio {
    protected int coeficiente;
    protected int grado;


    public Monomio(int coeficiente, int grado) {
        this.coeficiente = coeficiente;
        this.grado = grado;
    }


    public Monomio() {

    }
    

    public int getCoeficiente() {
        return this.coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString (){
        String c, g;
        c=String.valueOf(this.coeficiente);
        g=String.valueOf(this.grado);
        return c + "x^" + g;
    }

}

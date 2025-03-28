package main.Servidor_React.reportes;

/**
 *
 * @author marco
 */
public class Ocurrencia {

    String operador;
    String op1;
    String op2;

    public Ocurrencia(String operador, String op1, String op2) {
        this.operador = operador;
        this.op1 = op1;
        this.op2 = op2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

}

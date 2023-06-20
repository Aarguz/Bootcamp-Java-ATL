package claseDiez.ejDos;

public class Cuenta {
    String titular;
    float saldo;

    public Cuenta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public void ingresarSaldo(float salto) {
        if (saldo > 0) {
            setSaldo(getSaldo() + saldo);
        }
    }

    public void retirarSaldo(float saldo) {
        if (saldo > getSaldo()) {
            System.out.println("Saldo insuficiente. El saldo actual es de: " + getSaldo());
        } else {
            setSaldo(getSaldo() - saldo);
            System.out.println("El saldo actual es de: " + getSaldo());
        }
    }
}

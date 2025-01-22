package robson.bank;

public class Conta {
    private static final int MAX_LENGTH = 12;

    private String agencia;
    private String conta;
    private String nome;
    private double balanco;
    private Log titular;


    public Conta(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);
        titular = new Log();
    }

    public void setNome(String nome) {
        if (nome.length() > MAX_LENGTH) {
            this.nome = nome.substring(0, MAX_LENGTH);
        } else {
            this.nome = nome;

        }

    }
    public void Depositar(double valor){
        balanco = balanco + valor;
        titular.Saida("Depósito realizado: R$ " + valor + " seu saldo é de:R$ "+ balanco);
    }

    public boolean Sacar(double valor) {
        if (balanco < valor) {
            titular.Saida("Saque: R$ "+ valor+ " Seu saldo atual é de: R$ "+ balanco);
            return false;
        } else {
            balanco = balanco - valor;
            titular.Saida("Saque realizado: R$ " + valor + " Seu saldo é de:R$ "+ balanco);
            return true;
        }

    }

    @Override
    public String toString() {
        String resultado = "CONTA " + this.nome+ " " + this.conta + "/"+ this.agencia +"\n"+ "Saldo R$ " + balanco;
        return resultado;
    }
}


/*
@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv7contabancaria.model;

public abstract class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria() {
        super();
    }

    public void sacar(float valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

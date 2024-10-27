/*
@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv7contabancaria.model;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        }
    }
}

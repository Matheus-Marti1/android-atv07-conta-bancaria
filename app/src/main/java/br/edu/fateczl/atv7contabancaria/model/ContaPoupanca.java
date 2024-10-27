/*
@author:<Matheus Augusto Marti>
*/

package br.edu.fateczl.atv7contabancaria.model;

public class ContaPoupanca extends ContaBancaria {

    private int diaDeRendimento;

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public void calcularNovoSaldo(float taxaDeRendimento){
        float novoSaldo = getSaldo() + (getSaldo() * taxaDeRendimento);
        setSaldo(taxaDeRendimento);
    }
}

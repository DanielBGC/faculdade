/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimogasolina1;

/**
 *
 * @author EDYA
 */
class Carro {

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private Motor motor;
    private Tanque tanque;
    private int consumoCombustivel = 10; //10km com 1litro

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public int getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(int consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
}

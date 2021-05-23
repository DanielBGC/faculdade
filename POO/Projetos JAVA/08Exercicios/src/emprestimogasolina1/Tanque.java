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
class Tanque {
    private int volumeMax;
    private int volumeAtual = 0;
    
    void adicionaCombustivel(int quantidadeCombustivel) {
        if (this.volumeAtual + quantidadeCombustivel >= this.volumeMax) {
            this.volumeAtual = this.volumeMax;
        } else {
            this.volumeAtual += quantidadeCombustivel;
        }
    }
    void setVolumeMaximo(int volume) {
        this.volumeMax = volume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
}

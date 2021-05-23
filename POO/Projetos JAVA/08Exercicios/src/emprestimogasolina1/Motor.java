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
class Motor {
    private int potencia;
    private String tipo;
    
    void fundeMotor() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ihhhhhhhhhhhhhhhhhhh...\n");
        builder.append("Perdeu playboy...\n\n");
        builder.append("Motor fundiu...");
        System.out.println(builder.toString());
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

package br.com.fiap.bean;

public class ArCondicionado {
    //Ar Condicionado
    private int temperatura;
    private String modo;

    //Métodos getters e setters ( Alt + Insert )

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        try {
            if ( temperatura >= 15 && temperatura <= 26){
                this.temperatura = temperatura;
            } else {
                throw new Exception("Temperatura fora do permitido.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        try {
            if ()
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

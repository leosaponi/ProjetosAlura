package br.com.alura.forum.controller.dto;

public class ErroFormDto {
    private String Campo;
    private String erro;

    public ErroFormDto(String campo, String erro) {
        Campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return Campo;
    }

    public void setCampo(String campo) {
        Campo = campo;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}

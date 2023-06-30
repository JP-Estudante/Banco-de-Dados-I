package main;

public class Configuracao {
    private int codigo;
    private String emailAlerta;

    // Construtor
    public Configuracao(int codigo, String emailAlerta) {
        this.codigo = codigo;
        this.emailAlerta = emailAlerta;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmailAlerta() {
        return emailAlerta;
    }

    public void setEmailAlerta(String emailAlerta) {
        this.emailAlerta = emailAlerta;
    }
}

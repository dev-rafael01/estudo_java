package entities;

public class aluguel {

    private String nome;
    private String email;

    public aluguel(String nome, String email)
    {
        this.nome = nome;
        this.email = email;
    }

    public String getName()
    {
        return nome;
    }

    public void setNome(String nomeNovo)
    {
        this.nome = nomeNovo;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String emailNovo)
    {
        this.email = emailNovo;
    }

    public String toString()
    {
        return nome + ", " + email;
    }
    
}

public class Pessoa {
    private String nome;
    private String RG;
    private String CPF;
    private String email;
    private Integer idade;

    public Pessoa(String nome, String RG, String CPF, String email, Integer idade) {
        this.nome = nome;

        if (CPF.length() < 11){
            this.CPF = "Inválido";
        } else {
            this.CPF = CPF;
        }

        if (RG.length() < 6){
            this.RG = "inválido";
        } else {
            this.RG = RG;
        }

        if(email.contains("@")) {
            this.email = email;
        } else {
            this.email = "inválido";
        }

        if(idade < 18) {
            this.idade = null;
        }else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        if (RG.length() < 6){
            this.RG = "inválido";
        } else {
            this.RG = RG;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if (CPF.length() < 11){
            this.CPF = "Inválido";
        } else {
            this.CPF = CPF;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")) {
            this.email = email;
        } else {
            this.email = "inválido";
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade < 18) {
            this.idade = null;
        }else {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", RG='" + RG + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void verificaCPFValido(){
        Pessoa p = new Pessoa("Ari", "123", "12345678912", "ari.thomazini", 15);

        Assert.assertEquals("12345678912", p.getCPF());
    }

    @Test
    public void verificaCPFInvalido(){
        Pessoa p = new Pessoa("Ari", "123", "12345678", "ari.thomazini", 15);

        Assert.assertEquals("inválido", p.getCPF());
    }

    @Test
    public void verificaRGValido(){
        Pessoa p = new Pessoa("Ari", "123456", "12345678912", "ari.thomazini", 15);

        Assert.assertEquals("123456", p.getRG());
    }

    @Test
    public void verificaRGInvalido(){
        Pessoa p = new Pessoa("Ari", "123", "12345678", "ari.thomazini", 15);

        Assert.assertEquals("inválido", p.getRG());
    }

    @Test
    public void verificaEmailInvalido(){
        Pessoa p = new Pessoa("Ari", "123", "123", "ari.thomazini", 15);

        Assert.assertEquals("inválido", p.getEmail());
    }

    @Test
    public void verificaEmailValido(){
        Pessoa p = new Pessoa("Ari", "123", "123", "ari.thomazini@sp.senac.br", 15);

        Assert.assertEquals("ari.thomazini@sp.senac.br", p.getEmail());
    }

    public void verificaIdadeValida(){
        Pessoa p = new Pessoa("Ari", "123", "123", "ari.thomazini@sp.senac.br", 18);

        Assert.assertEquals(String.valueOf(18), p.getIdade());
    }

    public void verificaIdadeInvalida(){
        Pessoa p = new Pessoa("Ari", "123", "123", "ari.thomazini@sp.senac.br", 1);

        Assert.assertEquals(null, p.getIdade());
    }

}

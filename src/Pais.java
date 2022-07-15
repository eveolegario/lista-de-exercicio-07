import java.util.HashSet;
import java.util.Set;
public class Pais {
    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private Set<Pais> listaDePais = new HashSet<>();

    public Pais(String codigoIso, String nome, int populacao, double dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }
     public void paisVizinho(Pais pais){
         if(this.listaDePais.contains(pais)){
             System.out.println(pais.getNome() + "é vizinho");
         }else{
             System.out.println(pais.getNome() + "não é vizinho");
         }
     }
     public double densidadePopulacional(){
        return populacao/dimensao;
     }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}

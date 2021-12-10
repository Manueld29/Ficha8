public class Empresa {
    private String nome;
    private String nmrFiscal;
    private int nmrF =0;
    Funcionario[] arr;

    public Empresa(String nome, String nmrFiscal) {
        this.nome = nome;
        this.nmrFiscal = nmrFiscal;
    }

    public void adiciona(Funcionario x){
        this.arr[nmrF]=x;
        nmrF ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNmrFiscal() {
        return nmrFiscal;
    }

    public void setNmrFiscal(String nmrFiscal) {
        this.nmrFiscal = nmrFiscal;
    }

    @Override
    public String toString() {
        return " Nome Empresa " +nome +" NUmero Fiscal " + nmrFiscal +"\n";
    }
}

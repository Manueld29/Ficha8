public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dtEntrada;
    private String bi;
    private int id=0;

    public Funcionario() {
    }

    public Funcionario(double salario) {
        this.salario = salario;
        id=id++;
    }

    public recebeAumento(double x) {
        salario=salario+x;

    }

    public calcGanhoAno() {
        double x= salario * 12;
        return x;
    }

    public calcHoraExtra(int x) {
        double y;
        return y;
    }

    public getBonificaçao();{
    double x;
    return x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}





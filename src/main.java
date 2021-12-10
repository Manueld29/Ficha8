public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa","123456789");
        empresa.arr = new Funcionario[10];
        Funcionario f1 = new Funcionario("Rui");
        Funcionario f2 = new Funcionario("Zé");
        Funcionario f3 = new Funcionario("Pedro");
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
    }
}

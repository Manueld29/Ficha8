import org.junit.Test;

public class Teste {
        Empresa empresa = new Empresa("Empresa","123456789");
        empresa.arr = new Funcionario[10];
        Funcionario f1 = new Funcionario("Rui");
        Funcionario f2 = new Funcionario("Zé");
        Funcionario f3 = new Funcionario("Pedro");
        Funcionario f4 = new Funcionario("Paulo");
        Funcionario f5 = new Funcionario("Andre");
        Funcionario f6 = new Funcionario("Gonçalo");
        Funcionario f7 = new Funcionario("Ana");
        Funcionario f8 = new Funcionario("Inacio");



        @Test

        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        }

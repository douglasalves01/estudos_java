package teste_exercicio1;

import exercicio_1.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario=new Funcionario();
        funcionario.nome="douglas";
        funcionario.idade=20;
        funcionario.salarios=new double[]{1200,9800,2000};

        funcionario.imprime();
    }
}

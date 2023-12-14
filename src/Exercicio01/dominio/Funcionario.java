package Exercicio01.dominio;
//crie uma classe Funcionário com os seguintes atributos

//nome
//idade
//salario -> 3 salarios devem ser guardados

//crie dois metodos
//1- para imprimir os dados
//2- para tirar a media dos salarios e imprimir o resultado
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario:salarios) {
            System.out.print(salario + " ");
        }
    }
    public void imprimeMediaSalario(){
        double media=0;
        for (double salario:salarios) {
            media+=salario;
        }
        media/=salarios.length;
        System.out.println("\nMédia salarial " + media);
    }
}

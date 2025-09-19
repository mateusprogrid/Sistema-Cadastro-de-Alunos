package sistema;
public class Cadastro {
    public static void main(String[] args) {
        // Criando um aluno de exemplo
        Aluno aluno1 = new Aluno(
            "Lucas Sampaio",   //nome
            12345,           //matrícula
            "123.456.789-00",//cpf
            'M',             //sexo
            7.5,             //nota P1
            5.0,             //nota P2
            8.0              //P3
        );

        //Imprime todos os dados do aluno
        System.out.println("===== Dados do Aluno =====");
        aluno1.ImprimeAluno();

        //Imprime o sexo do aluno
        System.out.println("\n===== Sexo do Aluno =====");
        aluno1.ImprimeSexo();

        //Calcula e mostra a média
        System.out.println("\n===== Média =====");
        System.out.println("Média (duas maiores notas): " + aluno1.MediaAluno());

        //Mostra se foi aprovado ou reprovado
        System.out.println("\n===== Resultado =====");
        System.out.println(aluno1.Resultado());
    }
}


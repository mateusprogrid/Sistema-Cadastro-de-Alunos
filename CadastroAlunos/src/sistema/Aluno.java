package sistema;
public class Aluno {
    
    //Atributos
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_N1;
    private double nota_N2;
    private double nota_N3;
    
    //Construtor
    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_N1, double nota_N2, double nota_N3) {
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_N1 = nota_N1;
        this.nota_N2 = nota_N2;
        this.nota_N3 = nota_N3;
    }
    
    //MétodoS
    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Nota P1: " + nota_N1);
        System.out.println("Nota P2: " + nota_N2);
        System.out.println("Nota P3: " + nota_N3);
    }

    public void ImprimeSexo() {
        if (sexo == 'M' || sexo == 'm') {
            System.out.println(nome + " - Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println(nome + " - Feminino");
        } else {
            System.out.println(nome + " - Sexo não informado corretamente");
        }
    }

    public double MediaAluno() {
        double n1 = nota_N1, n2 = nota_N2, n3 = nota_N3;
        double menor = Math.min(n1, Math.min(n2, n3));
        double soma = n1 + n2 + n3 - menor; // soma das duas maiores
        return soma / 2.0;
    }

    public String Resultado() {
        double media = MediaAluno();
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}

/**
*
* @autor tathiany.marquesani
 */
public class PrimeiraClasse {

    public static void main(String args[]){
        System.out.println("Bem vindo a agenda!");
        Agenda ano = new Agenda();
        ano.cadastrarAno(2023);
        System.out.println(ano.getAno());
    }
}

package main.java.Map.OperacoesBasicas;


import java.util.HashMap;
import java.util.Map;


public class AgendaContatos {
    //atributos
    private  Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adcionarContato(String name, Integer telefone){
        agendaContatoMap.put(name, telefone);
    }

    public  void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void  exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public  Integer pesquisarPorNome(String nome){
        Integer numeroPorNome =null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new  AgendaContatos();

        agendaContatos.adcionarContato("Camila", 123456);
        agendaContatos.adcionarContato("Camila", 5665);
        agendaContatos.adcionarContato("Camila Cavalcante", 1111111111);
        agendaContatos.adcionarContato("Camila DIO", 654987);
        agendaContatos.adcionarContato("Maria Silva", 1111111111);
        agendaContatos.adcionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

    }

}

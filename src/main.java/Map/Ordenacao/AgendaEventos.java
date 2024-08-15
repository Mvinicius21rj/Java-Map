package main.java.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void  adicionarEvento(LocalDate data, String nome, String atracao){
       // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();



        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data" + proximaData);
                break;
            }
        }
    }

    public  static  void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println(LocalDate.now());

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atraçao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 9), "Evento 2", "Atraçao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 10), "Evento 3", "Atraçao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento 53", "Atraçao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 25), "Evento 9", "Atraçao 6");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }

}

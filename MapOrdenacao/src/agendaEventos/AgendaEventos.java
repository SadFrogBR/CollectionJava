package agendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	Map<LocalDate, Eventos> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void AdicionarEvento(LocalDate data, String nome, String atracao) {
		this.eventosMap.put(data, new Eventos(nome, atracao));
		
	}
	
	public void exibirAgenda(){
		Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(this.eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		//Set<LocalDate> dataSet = this.eventosMap.keySet();
		//Collection<Eventos> values = this.eventosMap.values();
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(this.eventosMap);
		for(Map.Entry<LocalDate, Eventos> e : eventosTreeMap.entrySet()) {
			if(e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual)) {
				System.out.println("O proximo evento : " + e.getValue() + " Acontecera: " + e.getKey());
				break;
			}
		}
	}
}
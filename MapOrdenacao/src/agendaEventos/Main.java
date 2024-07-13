package agendaEventos;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		AgendaEventos a = new AgendaEventos();
		
		a.AdicionarEvento(LocalDate.of(2022, Month.JULY, 15), "bolsonaro2026", "Bolsonaro");
		a.AdicionarEvento(LocalDate.of(2025, Month.JULY, 15), "comicom", "stan lee");
		a.AdicionarEvento(LocalDate.of(2024, Month.JULY, 29), "animesp", "uns esquisitos");
		a.AdicionarEvento(LocalDate.of(2024, Month.JULY, 22), "encontro dos famosinhos", "na regua");
		a.AdicionarEvento(LocalDate.of(2024, Month.JULY, 11), "jujutsu kaisen", "gomen");
		
		a.exibirAgenda();
		a.obterProximoEvento();
	}

}

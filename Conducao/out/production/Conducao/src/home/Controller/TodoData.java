package home.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TodoData {
    public static List<DataExame> getDataExames() {
        return DataExames;
    }

    private static List<DataExame> DataExames;
    private DateTimeFormatter formatter;

    public TodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public  List<DataExame> getTodoItems() {
        return DataExames;
    }

    public static void addTodoItem(DataExame item) {
        DataExame.add(item);
    }

    public  void initialize() {
        DataExame item1 = new DataExame("Enviar presente aniversário", "Compre um presente para aniversário para Maira ",
                LocalDate.of(2021, Month.APRIL, 25));
        DataExame item2 = new DataExame("Consulta médica", "Consulta de rotina",
                LocalDate.of(2021, Month.MAY, 23));
        DataExame item3 = new DataExame("Concluir proposta de design", "Concluir proposta de design para cliente e ter protótipo pronto até sexta-feira 27 de Junho",
                LocalDate.of(2021, Month.JUNE, 27));
        DataExame item4 = new DataExame("Ir buscar Clara no cais", "Clara está chegando no dia 30 no barco das 5:00 ",
                LocalDate.of(2021, Month.JUNE, 23));
        DataExame item5 = new DataExame("Ir fazer revisão mecânica", "Revisão obrigatória do automovel",
                LocalDate.of(2021, Month.JULY,20));

        DataExames = new ArrayList<DataExame>();
        DataExames.add(item1);
        DataExames.add(item2);
        DataExames.add(item3);
        DataExames.add(item4);
        DataExames.add(item5);
    }

}

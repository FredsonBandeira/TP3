package home.Controller;

import java.time.LocalDate;

public class DataExame {
    private String descri;
    private String detalhes;
    private LocalDate deadline;

    public DataExame(String descri, String detalhes, LocalDate deadline) {
        this.descri = descri;
        this.detalhes = detalhes;
        this.deadline = deadline;
    }

    public static void add(DataExame item) {
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return descri;
    }




    public void initialize() {
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    // RETORNA LISTA DE CONSULTAS
    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public void addConsulta(Consulta consulta) {
        if (consulta == null) throw new IllegalArgumentException("Consulta inválida");
        consultas.add(consulta);
    }

    public void removeConsulta(Consulta consulta) {
        if (consulta == null) throw new IllegalArgumentException("Consulta inválida");
        consultas.remove(consulta);
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<RecetaMedica> getRecetasMedicas() {
        return recetasMedicas;
    }

    public void setRecetasMedicas(List<RecetaMedica> recetasMedicas) {
        this.recetasMedicas = recetasMedicas;
    }
}

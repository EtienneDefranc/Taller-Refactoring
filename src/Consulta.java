import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consulta {
    private int dia;
    private int mes;
    private int año;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;
    private List<String> examenesMedicos = new ArrayList<>();

    public Consulta(int dia, int mes, int año, String hora, Paciente paciente, Medico medico, ServicioMedico servicioMedico, String diagnostico, String tratamiento, List<String> examenesMedicos) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.servicioMedico = servicioMedico;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    // RETORNA LISTA DE EXAMENES MEDICOS
    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }

    public void addExamenMedico(String examen) {
        if (examen == null || examen.isBlank()) throw new IllegalArgumentException("Examen inválido");
        examenesMedicos.add(examen);
    }

    public boolean removeExamenMedico(String examen) {
        return examenesMedicos.remove(examen);
    }

    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    public String getFecha() {
        return dia + "/" + mes + "/" + año;
    }

}

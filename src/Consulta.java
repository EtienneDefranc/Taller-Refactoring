import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consulta {
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;
    private List<String> examenesMedicos = new ArrayList<>();

    private Consulta(LocalDateTime fechaHora, Paciente paciente, Medico medico, ServicioMedico servicioMedico, String diagnostico, String tratamiento, List<String> examenesMedicos) {
        this.fechaHora = fechaHora;
        this.servicioMedico = servicioMedico;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
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


}

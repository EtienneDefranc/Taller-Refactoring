import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public Consulta(int dia, int mes, int año, String hora, Paciente paciente, Medico medico, ServicioMedico servicioMedico, String diagnostico, String tratamiento, List<String> examenesMedicos) {
        this.fechaHora = LocalDateTime.of(año, mes, dia, parseHour(hora)[0], parseHour(hora)[1]);
        this.servicioMedico = servicioMedico;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
    }

    public String getHora() {
    return fechaHora != null ? fechaHora.format(DateTimeFormatter.ofPattern("HH:mm")) : null;
    }

    public void setHora(String hora) {
        int[] hm = parseHour(hora);
        if (this.fechaHora != null) {
            this.fechaHora = this.fechaHora.withHour(hm[0]).withMinute(hm[1]);
        } else {
            LocalDateTime now = LocalDateTime.now();
            this.fechaHora = LocalDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), hm[0], hm[1]);
        }
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
        return fechaHora != null ? fechaHora.format(DateTimeFormatter.ofPattern("d/M/yyyy")) : null;
    }

    private static int[] parseHour(String hora) {
        if (hora == null || hora.isBlank()) return new int[]{0,0};
        String[] parts = hora.split(":");
        try {
            int h = Integer.parseInt(parts[0]);
            int m = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
            return new int[]{h, m};
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
    }

}

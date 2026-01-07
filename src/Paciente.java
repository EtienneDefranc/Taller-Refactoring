import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paciente extends Persona {
    private HistorialMedico historialMedico;
    private List<Consulta> consultas;

    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
        this.consultas = new ArrayList<>();
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public boolean esAdultoMayor(){
        return super.getEdad()>=65;
    }

    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
}
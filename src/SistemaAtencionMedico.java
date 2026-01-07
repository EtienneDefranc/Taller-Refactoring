import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SistemaAtencionMedico {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta) {
        double costoConsulta = consulta.getServicioMedico().getCosto();
        int edadPaciente = paciente.getEdad();

        costoConsulta = calcularValorFinalConsulta(costoConsulta, edadPaciente);

        System.out.println("Se han cobrado " + costoConsulta + " dolares de su tarjeta de credito");

        paciente.getHistorialMedico().getConsultas().add(consulta);
    }

    public double calcularValorFinalConsulta(double costoConsulta, int edadPaciente) {
        double valorARestar = 0;
        if (edadPaciente >= 65) {
            valorARestar = costoConsulta * 0.25;
        }
        return costoConsulta - valorARestar;
    }

    private <T> T obtenerPorNombre(List<T> lista, Function<T, String> getNombre, String nombre) {
        for (T item : lista) {
            if (getNombre.apply(item).equals(nombre)) {
                return item;
            }
        }
        return null;
    }

    public Paciente obtenerPaciente(String nombrePaciente) {
        return obtenerPorNombre(pacientes, Paciente::getNombre, nombrePaciente);
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        return obtenerPorNombre(serviciosMedicos, ServicioMedico::getNombre, nombreServicio);
    }

    public Medico obtenerMedico(String nombreMedico) {
        return obtenerPorNombre(medicos, Medico::getNombre, nombreMedico);
    }
}

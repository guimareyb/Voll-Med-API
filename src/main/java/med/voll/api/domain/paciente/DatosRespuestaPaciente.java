package med.voll.api.domain.paciente;

import med.voll.api.domain.direccion.DatosDireccion;
import med.voll.api.domain.medico.Medico;

public record DatosRespuestaPaciente(
        Long id,
        String nombre,
        String documento,
        String email,
        String telefono,
        DatosDireccion direccion){
    public DatosRespuestaPaciente(Paciente paciente){
        this(
                paciente.getId(),
                paciente.getNombre(),
                paciente.getEmail(),
                paciente.getTelefono(),
                paciente.getDocumento(),
                new DatosDireccion(
                        paciente.getDireccion().getCalle(),
                        paciente.getDireccion().getDistrito(),
                        paciente.getDireccion().getCiudad(),
                        paciente.getDireccion().getNumero(),
                        paciente.getDireccion().getComplemento()
                )
        );
    }
}

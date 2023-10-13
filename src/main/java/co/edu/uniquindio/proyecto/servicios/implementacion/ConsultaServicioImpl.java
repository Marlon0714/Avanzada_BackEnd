package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Consulta;
import co.edu.uniquindio.proyecto.servicios.interfaces.ConsultaServicio;

public class ConsultaServicioImpl implements ConsultaServicio {
    //Contrato de los servicios de consulta
    boolean registrarConsulta(Consulta consulta) throws Exception;
    boolean actualizarConsulta(Consulta consulta) throws Exception;
    void eliminarConsulta(String id) throws Exception;
    Consulta obtenerConsulta(String id) throws Exception;
}

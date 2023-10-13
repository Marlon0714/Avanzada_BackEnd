package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.EPS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EPSRepo extends JpaRepository<EPS, String> {
}

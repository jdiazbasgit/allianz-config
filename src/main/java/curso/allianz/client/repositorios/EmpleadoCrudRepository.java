package curso.allianz.client.repositorios;

import org.springframework.data.repository.CrudRepository;

import curso.allianz.client.enitidaddes.Empleado;

public interface EmpleadoCrudRepository extends CrudRepository<Empleado, Integer> {

}

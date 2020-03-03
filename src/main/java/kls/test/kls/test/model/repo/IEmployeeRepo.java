package kls.test.kls.test.model.repo;
import kls.test.kls.test.model.dto.Emploee;
import kls.test.kls.test.model.dto.PersonKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface IEmployeeRepo extends CassandraRepository<Emploee, PersonKey> {
}

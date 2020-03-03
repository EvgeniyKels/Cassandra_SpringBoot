package kls.test.kls.test.model.repo;

import kls.test.kls.test.model.dto.Child;
import kls.test.kls.test.model.dto.PersonKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface IChildRepo  extends CassandraRepository <Child, PersonKey> {
}

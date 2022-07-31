package se.ds.ba.prophet.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import se.ds.ba.prophet.infrastructure.entity.ColaDO;

/**
 * @author SE.COLA
 */

@Component
public interface ColaRepository extends CrudRepository<ColaDO, Integer>{

}

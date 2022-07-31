package se.ds.ba.prophet.infrastructure.gatewayimpl;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import se.ds.ba.prophet.infrastructure.ColaRepository;
import se.ds.ba.prophet.infrastructure.entity.ColaDO;
import se.ds.ba.prophet.domain.bo.ColaBO;
import se.ds.ba.prophet.domain.gateway.ColaTemplateGateway;


/**
 * @author SE.COLA
 */
@Component
public class ColaTemplateGatewayImpl implements ColaTemplateGateway {

  @Autowired
  private ColaRepository colarepository;
  /**
   * @param
   * @return
   */
  @Override
  public List<ColaBO> findAll(){
    Iterable<ColaDO> it = colarepository.findAll();
    List<ColaDO> l = new ArrayList<ColaDO>();
    it.forEach(i -> l.add(i));

    return l.stream().map(e ->{
      ColaBO bo = new ColaBO();
      BeanUtils.copyProperties(e, bo);
      return bo;
    }).collect(Collectors.toList());
  }
}

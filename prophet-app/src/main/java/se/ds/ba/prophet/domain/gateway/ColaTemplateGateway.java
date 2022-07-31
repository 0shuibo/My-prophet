package se.ds.ba.prophet.domain.gateway;

import lombok.*;
import java.util.List;
import  se.ds.ba.prophet.domain.bo.ColaBO;
/**
 * @author SE.COLA
 */

public interface ColaTemplateGateway {
  /**
   * @param
   * @return
   */
  List<ColaBO> findAll();
}

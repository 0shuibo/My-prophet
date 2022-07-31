package se.ds.ba.prophet.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;

import se.ds.ba.prophet.domain.dto.ColaDTO;
import se.ds.ba.prophet.domain.gateway.ColaTemplateGateway;
import se.ds.ba.prophet.domain.bo.ColaBO;

/**
 * @author SE.COLA
 */

@Service
public class ColaService {

    @Autowired
    private ColaTemplateGateway golaTemplateGateway;

    public List<ColaDTO> getColaList() {

        Iterable<ColaBO> it = golaTemplateGateway.findAll();

        /**
         * Aggregate and Transfer if needed:  BO => DTO
         * **/
        List<ColaBO> l = new ArrayList<ColaBO>();
        it.forEach(i -> l.add(i));

        return l.stream().map(e ->{
            ColaDTO dto = new ColaDTO();
            BeanUtils.copyProperties(e, dto);
            return dto;
        }).collect(Collectors.toList());

    }
}

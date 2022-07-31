package se.ds.ba.prophet.interfaces ;

import se.ds.ba.prophet.application.ColaService;
import se.ds.ba.prophet.domain.dto.ColaDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author SE.COLA
 */

@Slf4j
@RestController
@RequestMapping("/cola")
public class ColaController {

    @Autowired
    ColaService colaService;

    @GetMapping("/getColaList")
    public List<ColaDTO> getColaList() {
        log.info("> step into getColaList.");
        List<ColaDTO> colaList = colaService.getColaList();
        return colaList;
    }
}
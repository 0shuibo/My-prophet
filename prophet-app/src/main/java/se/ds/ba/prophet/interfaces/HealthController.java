package se.ds.ba.prophet.interfaces ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SE.COLA
 */

@Slf4j
@RestController
@RequestMapping("/v1")
public class HealthController {

    /**
     * 存活探针接口
     */
    @GetMapping(value="healthz")
    public Boolean getHealthZ()
    {
        return true;
    }

    /**
     * 就绪探针接口
     */
    @GetMapping(value="healthy")
    public Boolean getHealthY()
    {
        return true;
    }
}
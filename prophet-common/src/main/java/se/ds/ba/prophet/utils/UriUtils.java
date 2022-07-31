

package se.ds.ba.prophet.utils;

import java.net.URI;
import java.util.Optional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.zalando.problem.Problem;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Optional;
import se.ds.ba.prophet.config.HttpServletRequestAccessor;

/**
 * @author SE.COLA
 */


public class UriUtils {

    public static URI getUri(HttpServletRequestAccessor request){
        return request == null
                ? Problem.DEFAULT_TYPE
                : URI.create(request.getRequest().getRequestURI());
    }

    public static URI getUri(){
        return getUri(UriUtils::getRequest);
    }

    public static HttpServletRequest getRequest(){
        Optional<RequestAttributes> optional = Optional.ofNullable(RequestContextHolder.getRequestAttributes());
        return optional.isPresent()
                ? ((ServletRequestAttributes) optional.get()).getRequest()
                : null;
    }

}

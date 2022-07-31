package se.ds.ba.prophet.config;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SE.COLA
 */

@FunctionalInterface
public interface HttpServletRequestAccessor {
    HttpServletRequest getRequest();
}
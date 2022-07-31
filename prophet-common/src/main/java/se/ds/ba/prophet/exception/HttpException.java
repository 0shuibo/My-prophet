package se.ds.ba.prophet.exception;

import lombok.Getter;

/**
 * @author SE.COLA
 */


public class HttpException extends RuntimeException {

    @Getter
    private Integer code;
    @Getter
    private String message;
    @Getter
    private String detail;

    public HttpException(String message, Integer code, String detail) {
        super(message);
        this.message = message;
        this.code = code;
        this.detail = detail;
    }
}

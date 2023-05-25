package com.algaworks.algalog.domain.exception;

/**
 *
 * @author Leandro Menezes
 */
public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NegocioException(String message) {
        super(message);
    }

}

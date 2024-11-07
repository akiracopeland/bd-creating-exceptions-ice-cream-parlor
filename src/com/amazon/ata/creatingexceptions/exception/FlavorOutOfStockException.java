package com.amazon.ata.creatingexceptions.exception;

import java.io.Serializable;

public class FlavorOutOfStockException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public FlavorOutOfStockException() {
        super();
    }

    public FlavorOutOfStockException(String message) {
        super(message);
    }

    public FlavorOutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlavorOutOfStockException(Throwable cause) {
        super(cause);
    }
}

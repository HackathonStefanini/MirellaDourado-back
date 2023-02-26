package com.stefanini.exceptions;

import javax.ws.rs.BadRequestException;

public class NicknameRepetidoException extends BadRequestException{
    public NicknameRepetidoException() {
        super();
    }

    public NicknameRepetidoException(String message) {
        super(message);
    }
}


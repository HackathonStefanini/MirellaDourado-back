package com.stefanini.exceptions;

import javax.ws.rs.BadRequestException;

public class NomeRepetidoException extends BadRequestException{
  public NomeRepetidoException() {
    super();
}

public NomeRepetidoException(String message) {
    super(message);
}
}

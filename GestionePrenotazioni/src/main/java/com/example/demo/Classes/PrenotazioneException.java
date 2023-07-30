package com.example.demo.Classes;

public class PrenotazioneException extends RuntimeException {

	public PrenotazioneException() {
		super();
	}

	public PrenotazioneException(String message) {
		super(message);
	}

	public PrenotazioneException(String message, Throwable cause) {
		super(message, cause);
	}

	public PrenotazioneException(Throwable cause) {
		super(cause);
	}
}

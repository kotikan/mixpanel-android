package com.mixpanel.android.java_websocket.handshake;

public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
	private short status;
	private String message;

	public HandshakeImpl1Server() {
	}

	@Override
	public String httpStatusMessage() {
		return message;
	}

	@Override
	public short httpStatus() {
		return status;
	}

	public void bindHttpStatusMessage(String message) {
		this.message = message;
	}

	public void bindHttpStatus(short status) {
		this.status = status;
	}


}

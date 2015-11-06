package com.mixpanel.android.java_websocket.handshake;

public interface ServerHandshake extends Handshakedata {
	public short httpStatus();
	public String httpStatusMessage();
}

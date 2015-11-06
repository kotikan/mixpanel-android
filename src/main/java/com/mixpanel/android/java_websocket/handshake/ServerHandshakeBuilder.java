package com.mixpanel.android.java_websocket.handshake;

public interface ServerHandshakeBuilder extends HandshakeBuilder, ServerHandshake {
	public void bindHttpStatus(short status);
	public void bindHttpStatusMessage(String message);
}

package com.mixpanel.android.java_websocket.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
	private String resDescriptor = "*";

	public HandshakeImpl1Client() {
	}

	public void bindResourceDescriptor(String resourceDescriptor) throws IllegalArgumentException {
		if(resourceDescriptor==null)
			throw new IllegalArgumentException( "http resource descriptor must not be null" );
		this.resDescriptor = resourceDescriptor;
	}

	public String resourceDescriptor() {
		return resDescriptor;
	}
}

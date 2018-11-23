package com.lg.netty;

import java.net.URI;
import java.net.URISyntaxException;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

public class MyWebSocketClient extends WebSocketClient{
	
	public MyWebSocketClient(String serverUri) throws URISyntaxException {
		super(new URI(serverUri),new Draft_6455());
	}
	
	@Override
	public void onOpen(ServerHandshake serverHandshake) {
		System.out.println("连接成功!");
	}

	@Override
	public void onMessage(String msg) {
		System.out.println("收到消息==========" + msg);
	}

	@Override
	public void onClose(int i, String s, boolean b) {
		System.out.println("断开链接!");
	}

	@Override
	public void onError(Exception e) {
		System.out.println("出现错误!");
		e.printStackTrace();
	}
}

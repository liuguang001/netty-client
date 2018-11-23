package com.lg.netty;


import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
public class WebsocketClient{

	public WebSocketClient client;

	public WebsocketClient(String wsUrl){
		try {
			this.client = new MyWebSocketClient(wsUrl);
			this.client.connect();
			while (!this.client.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
				System.out.println("连接中...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closed() {
		this.client.close();
	}
	
	public void sendMsg(String message) {
		this.client.send(message);
	}
}

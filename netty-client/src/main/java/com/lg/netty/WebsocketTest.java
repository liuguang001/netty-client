package com.lg.netty;

public class WebsocketTest {
	public static void main(String[] args) {
		
		int i=0;
		while(true){
			WebsocketClient websocketClient = new WebsocketClient("ws://47.92.128.220:6088/");
			websocketClient.sendMsg("你好");
			System.out.println(++i);
			if (i>=1000000) {
				break;
			}
			websocketClient.closed();
		}
		
	}
}

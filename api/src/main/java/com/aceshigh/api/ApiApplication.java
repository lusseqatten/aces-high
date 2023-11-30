package com.aceshigh.api;

import reactor.netty.DisposableServer;
import reactor.netty.tcp.TcpServer;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

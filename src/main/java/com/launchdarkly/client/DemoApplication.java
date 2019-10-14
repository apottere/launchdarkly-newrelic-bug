package com.launchdarkly.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
	    NewRelicReflector.annotateTransaction("", "");
	}
}

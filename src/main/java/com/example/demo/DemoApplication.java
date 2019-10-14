package com.example.demo;

import com.launchdarkly.client.NewRelicReflectorTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		NewRelicReflectorTest.test();
	}
}

package com.launchdarkly.shaded.com.newrelic.api.agent;

public class NewRelic {
    public static void addCustomParameter(String name, String value) {
        System.out.println("Used shaded package: " + NewRelic.class.getName());
    }
}

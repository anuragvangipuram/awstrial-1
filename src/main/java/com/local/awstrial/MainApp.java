package com.local.awstrial;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class MainApp extends Application<Configuration> {
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(AwsController.class);
    }

    public static void main(String[] args) {
        try {
            new MainApp().run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

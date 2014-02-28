package org.jenkinsci.test.acceptance.controller;

import com.cloudbees.sdk.extensibility.Extension;

import java.io.IOException;
import java.net.URL;

/**
 * Scaffolding to run it against Jenkins that is run outside.
 *
 * @author Kohsuke Kawaguchi
 */
@Extension
public class ScaffoldController extends JenkinsController {

    private URL url;

    public ScaffoldController() throws IOException {
        this.url = new URL("http://localhost:8080/");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public void diagnose() {

    }

    @Override
    public void tearDown() {

    }
}

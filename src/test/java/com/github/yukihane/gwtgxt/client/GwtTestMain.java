package com.github.yukihane.gwtgxt.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * GWT JUnit <b>integration</b> tests must extend GWTTestCase.
 * Using <code>"GwtTest*"</code> naming pattern exclude them from running with
 * surefire during the test phase.
 * If you run the tests using the Maven command line, you will have to
 * navigate with your browser to a specific url given by Maven.
 * See http://mojo.codehaus.org/gwt-maven-plugin/user-guide/testing.html
 * for details.
 */
public class GwtTestMain extends GWTTestCase {

    /**
     * Must refer to a valid module that sources this class.
     */
    @Override
    public String getModuleName() {
        return "com.github.yukihane.gwtgxt.MainJUnit";
    }

}

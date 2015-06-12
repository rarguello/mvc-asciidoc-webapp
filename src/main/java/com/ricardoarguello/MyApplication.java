package com.ricardoarguello;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

/**
 * Class MyApplication.
 *
 * @author Ricardo Arguello <ricardo.arguello@gmail.com>
 */
@ApplicationPath("resources")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(HelloController.class);
    }
}

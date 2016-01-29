package com.dempe.lamp.sample;

import com.dempe.lamp.BootServer;
import com.dempe.lamp.Server;
import com.dempe.lamp.utils.DefConfigFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/1/29
 * Time: 10:36
 * To change this template use File | Settings | File Templates.
 */
public class LampServer4xml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        Server server = new BootServer(DefConfigFactory.createDEVConfig(), context);
        server.start();
    }
}

package ar.com.telecom.fmvue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
public class FmVueApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FmVueApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        obtenerAmbiente();
        return application.sources(FmVueApplication.class);
    }

    public static void obtenerAmbiente() {
        String ambiente = "";
        try {
            System.out.println("+------------------------------------------------+");
            Map<String, String> nodeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            nodeMap.put("DESA", "desa.");
            nodeMap.put("SIT", "sit.");
            nodeMap.put("UAT", "");
            nodeMap.put("PROD", "");

            ObjectName serverMBean = new ObjectName("jboss.as:management-root=server");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            String serverGroupName = (String) ManagementFactory.getPlatformMBeanServer().getAttribute(serverMBean, "serverGroup");
            System.out.println(" JBoss server group name is:" + serverGroupName);
            String key = serverGroupName.substring(0, serverGroupName.lastIndexOf("_"));
            System.out.println("key: " + key);
            ambiente = nodeMap.get(key);
            System.out.println("prop.pref:" + ambiente);

        } catch (Exception e) {
            System.out.println("JBoss server group name is: no encontrado");
            System.out.println("+------------------------------------------------+");
        }

        System.setProperty("prop.pref", ambiente);
    }
}



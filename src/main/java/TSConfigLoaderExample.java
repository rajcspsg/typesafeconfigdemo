import com.typesafe.config.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TSConfigLoaderExample {

    public static void main(String[] args) throws Exception {
        System.setProperty("actor_name", "MyActor");
        Config defaultsConfig = ConfigFactory.load("test/defaults.conf");
        System.out.println(defaultsConfig);
        Config defaultConfig = ConfigFactory.parseResources("test/defaults.conf").resolve();
        System.out.println(defaultConfig);

        Config cfg =  ConfigFactory.parseString(new String(Files.readAllBytes(Paths.get("./src/main/application.conf")))).resolve();
        System.out.println(cfg);
    }
}

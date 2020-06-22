import com.typesafe.config.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TSConfigLoaderExample {

    public static void main(String[] args) throws Exception {
        File f = new File("./src/main");
        System.setProperty("actor_name", "MyActor");
        System.setProperty("conf.name", "MyActor");
        System.setProperty("conf.title", "MyTitle");
        Config defaultConfig = ConfigFactory.parseResources("test/defaults.conf").resolve();
        System.out.println(defaultConfig);

        Config cfg =  ConfigFactory.parseString(new String(Files.readAllBytes(Paths.get("./src/main/application.conf")))).resolve();
        System.out.println(cfg);
    }
}
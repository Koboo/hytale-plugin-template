package eu.koboo.myplugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class MyPlugin extends JavaPlugin {

    public MyPlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getLogger().atInfo().log("MyPlugin was successfully started!");
        super.setup();
    }

    @Override
    protected void shutdown() {
        getLogger().atInfo().log("MyPlugin was successfully shutdown!");
        super.shutdown();
    }
}

package eu.koboo.myplugin.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class MyCommand extends CommandBase {

    public MyCommand() {
        super("mycommand", "This is my awesome new command!");
    }

    @Override
    protected void executeSync(@NonNullDecl CommandContext commandContext) {
        commandContext.sender().sendMessage(Message.raw("Hello from MyPlugin!"));
    }
}

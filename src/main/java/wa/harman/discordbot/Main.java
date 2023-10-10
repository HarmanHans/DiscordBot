package wa.harman.discordbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;

public class Main {
    private static final GatewayIntent[] gatewaysIntents = {GatewayIntent.MESSAGE_CONTENT, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS};
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        JDABuilder jdaBuilder = JDABuilder.create(System.getenv(TOKEN), Arrays.asList((gatewaysIntents)));
        JDA jda = jdaBuilder.build().awaitReady();
    }
}

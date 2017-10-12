package org.telegram.telegrambots.main;

import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.generics.BotSession;
import org.telegram.telegrambots.generics.Webhook;
import org.telegram.telegrambots.main.updatesreceivers.DefaultBotSession;
import org.telegram.telegrambots.main.updatesreceivers.DefaultWebhook;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * Initialization of ApiContext
 */
public final class ApiContextInitializer {
    private ApiContextInitializer() {
    }

    public static void init() {
        ApiContext.register(BotSession.class, DefaultBotSession.class);
        ApiContext.register(Webhook.class, DefaultWebhook.class);
    }
}

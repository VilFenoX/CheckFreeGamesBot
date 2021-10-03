package com.wixsite.vilsurmurtazin.cfg.command;

import com.wixsite.vilsurmurtazin.cfg.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.wixsite.vilsurmurtazin.cfg.command.CommandUtils.getChatId;

/**
 * No {@link Command}.
 */
public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/).\n"
            + "Чтобы посмотреть список комманд введи /help";

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(getChatId(update), NO_MESSAGE);
    }
}

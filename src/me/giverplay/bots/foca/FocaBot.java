package me.giverplay.bots.foca;

import me.giverplay.bots.Bot;
import me.giverplay.bots.command.CommandHandler;
import me.giverplay.bots.foca.emojis.Emoji;
import me.giverplay.bots.listener.FocaMessageListener;
import net.dv8tion.jda.api.entities.Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FocaBot extends Bot
{
  private List<Activity> activities = new ArrayList<>();
  private Random random = new Random();
  
  public FocaBot(String token, CommandHandler handler)
  {
    super(token, handler, "f.");
  
    Emoji.setJDA(getJDA());
    getJDA().addEventListener(new FocaMessageListener(this));
  }
}

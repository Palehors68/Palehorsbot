package irc.message;

/**
 * Created by Nick on 3/30/2014.
 */
public abstract class MessageHandler {
    /**
     * This method is called whenever a message is sent to a channel.
     * <p>
     * The implementation of this method in the PircBot abstract class
     * performs no actions and may be overridden as required.
     *
     * @param channel The channel to which the message was sent.
     * @param sender  The nick of the person who sent the message.
     * @param message The actual message sent to the channel.
     */
    public void onMessage(String channel, String sender, String message) {
    }


    /**
     * This method catches the new subscriber for a certain channel
     * that the user "twitchnotify" sends to the channel when
     * the recipient (newSub) subscribes to the channel.
     *
     * @param channel The channel the new subscriber subscribed to.
     * @param line    The line to parse.
     * @param newSub  The nick of the user.
     */
    public void onNewSubscriber(String channel, String line, String newSub) {
    }

    /**
     * This method is called whenever a private message is sent to the PircBot.
     * <p>
     * The implementation of this method in the PircBot abstract class
     * performs no actions and may be overridden as required.
     * <p>
     * This is used when JTV sends its messages about who's op, subscriber, etc.
     *
     * @param sender   The nick of the person who sent the private message.
     * @param login    The login of the person who sent the private message.
     * @param hostname The hostname of the person who sent the private message.
     * @param message  The actual message.
     */
    public void onPrivateMessage(String sender, String login, String hostname, String message) {
    }


    /**
     * This is called when the chat is cleared. This is used for a crude
     * ban detection, or just the chat being cleared in general.
     * <p>
     * This can return "CLEARCHAT user" or "CLEARCHAT"
     *
     * @param line The "CLEARCHAT" line.
     */
    public void onClearChat(String channel, String line) {
    }


    /**
     * This method is called whenever an ACTION is sent from a user.  E.g.
     * such events generated by typing "/me goes shopping" in most IRC clients.
     * <p>
     * The implementation of this method in the PircBot abstract class
     * performs no actions and may be overridden as required.
     *
     * @param sender The nick of the user that sent the action.
     * @param target The target of the action, be it a channel or our nick.
     * @param action The action carried out by the user.
     */
    public void onAction(String sender, String target, String action) {
    }


    /**
     * This method carries out the actions to be performed when the PircBot
     * gets disconnected.  This may happen if the PircBot quits from the
     * server, or if the connection is unexpectedly lost.
     * <p>
     * Disconnection from the IRC server is detected immediately if either
     * we or the server close the connection normally. If the connection to
     * the server is lost, but neither we nor the server have explicitly closed
     * the connection, then it may take a few minutes to detect (this is
     * commonly referred to as a "ping timeout").
     * <p>
     * If you wish to get your IRC bot to automatically rejoin a server after
     * the connection has been lost, then this is probably the ideal method to
     * override to implement such functionality.
     * <p>
     * The implementation of this method in the PircBot abstract class
     * performs no actions and may be overridden as required.
     */
    public void onDisconnect() {
    }

    /**
     * This method is called once the PircBot has successfully connected to
     * the IRC server.
     * <p>
     * The implementation of this method in the PircBot abstract class
     * performs no actions and may be overridden as required.
     *
     * @since PircBot 0.9.6
     */
    public void onConnect() {
    }

    /**
     * This method is called if the channel you're in is hosting somebody else.
     *
     * @param channel The channel you're in.
     * @param target  The person being hosted.
     */
    public void onHosting(String channel, String target, String count) {
    }

    /**
     * This method is called if you're being hosted by somebody.
     *
     * @param line The line from JTV.
     */
    public void onBeingHosted(String line) {
    }

    /**
     * This method is called if JTV is trying to tell you something.
     *
     * @param channel The channel (used for getting the pane)
     * @param line    What JTV is trying to tell you.
     */
    public void onJTVMessage(String channel, String line, String tags) {
    }
    
    /**
     * This method is called if the user gets banned from the chat.
     *
     * @param line    The message from the chat (which is parsed to get the channel).
     */
    public void onBanned(String line){
    }
    
    /**
     * Called from a PircBotWhisper instance to notify of a whisper.
     *
     * @param sender   The user that sent the whisper.
     * @param receiver The receiver of the whisper.
     * @param contents The contents of the whisper.
     */
    public void onWhisper(String sender, String receiver, String contents) {
    }
}
package package2;

/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Message {

    private String content;
    private MessageType type;

    public Message(){

    }

    public Message(String content, MessageType type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}

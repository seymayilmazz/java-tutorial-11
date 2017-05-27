package package1;

/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Message {

    public static final int SUCCESS_MESSAGE = 1;

    public static final int ERROR_MESSAGE = 2;

    private String content;
    private int type;

    public Message(){

    }

    public Message(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

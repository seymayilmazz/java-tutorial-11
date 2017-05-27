package package2;

/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Message message1 = new Message();
        message1.setType(MessageType.SUCCESS);

        if(message1.getType() == MessageType.SUCCESS){

        }
        else if(message1.getType() == MessageType.ERROR){

        }

    }
}

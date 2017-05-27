package package1;

/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {


        Message message1 = new Message();
        message1.setType(Message.SUCCESS_MESSAGE); /* 1 basari mesaji */
        message1.setContent("Basarili islem");

        Message message2 = new Message();
        message2.setType(Message.ERROR_MESSAGE); /* 2 basarisiz */
        message2.setContent("Basarisiz islem");

        /* ... */
        /* basarili */
        if(message1.getType() == Message.SUCCESS_MESSAGE){

        }
        /* basarisiz */
        else if(message1.getType() == Message.ERROR_MESSAGE){

        }

    }

}

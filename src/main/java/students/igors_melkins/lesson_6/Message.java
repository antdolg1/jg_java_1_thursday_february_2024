package students.igors_melkins.lesson_6;

public class Message {
    public static int instancesCreated = 0;
    private  String  text;



    public Message(String text) {
        this.text = text;
        System.out.println("Creating message = '" + text + "'");
        instancesCreated++;

    }

    public static void main(String[] args) {
        Message message1 = new Message("text1");
        Message message2 = new Message("text2");
        Message message3 = new Message("text3");
        Message message4 = new Message("text4");
        System.out.println(instancesCreated);
    }
}

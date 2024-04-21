package students.ruslan_k.lesson_9.level_2;

class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }
    String getMasterName(){
        return super.getName();
    }
}

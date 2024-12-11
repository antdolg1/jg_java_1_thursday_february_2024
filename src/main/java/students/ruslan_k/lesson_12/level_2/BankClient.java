package students.ruslan_k.lesson_12.level_2;

class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    BankClient(String userId, String fullName){
        this.uid=userId;
        this.fullName=fullName;
    }
    // создайте конструктор класса, в котором вы получите значения указанных свойств
    public String getUid(){
        return uid;
    }

    public String getFullName(){
        return fullName;
    }

    // создайте get() методы для каждого из свойств

}
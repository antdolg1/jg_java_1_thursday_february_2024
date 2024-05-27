package students.karina_cmile.lesson_12.level_2_intern;

public class BankClient {
    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    // конструктор класса, в котором вы получите значения указанных свойств
    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // get() методы для каждого из свойств
    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}

package students.ruslan_k.lesson_3.level_4;

public class DocVisit {
    String docFirstName;
    String docSecName;
    String profile;
    String visitDate;
    boolean isAmVisit;
    boolean isPmVisit;
    Client client;
    int visitNr;

    DocVisit(){
        this.docFirstName="";
        this.docSecName="";
        this.profile="";
        this.visitDate="";
        this.isAmVisit=false;
        this.isPmVisit=false;
        this.visitNr=0;
        client=new Client();
    }

    public int getVisitNr() {
        return visitNr;
    }

    public String getDocFirstName() {
        return docFirstName;
    }

    public String getDocSecName() {
        return docSecName;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getProfile() {
        return profile;
    }

    public void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public void setDocSecName(String docSecName) {
        this.docSecName = docSecName;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setVisitNr(int visitNr) {
        this.visitNr = visitNr;
    }

    //----------------------------------------------------------------------------------------------------------------------
    public class Client{
        String clientFirstName;
        String clientSecName;
        String diagnose;
        double visitPrice;
        Client(){
            this.clientFirstName="";
            this.clientSecName="";
            this.diagnose="";
            this.visitPrice=0;
        }

        public void setClientFirstName(String clientFirstName) {
            this.clientFirstName = clientFirstName;
        }

        public void setClientSecName(String clientSecName) {
            this.clientSecName = clientSecName;
        }

        public void setDiagnose(String diagnose) {
            this.diagnose = diagnose;
        }

        public void setVisitPrice(double visitPrice) {
            this.visitPrice = visitPrice;
        }

        public String getClientFirstName() {
            return clientFirstName;
        }

        public String getClientSecName() {
            return clientSecName;
        }

        public String getDiagnose() {
            return diagnose;
        }

        public double getVisitPrice() {
            return visitPrice;
        }
    }

}

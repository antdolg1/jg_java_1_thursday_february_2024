package students.arturs_novikovs.lesson_3.Doctor;

class DocVisit {
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

    int getVisitNr() {
        return visitNr;
    }

    String getDocFirstName() {
        return docFirstName;
    }

    String getDocSecName() {
        return docSecName;
    }

    String getVisitDate() {
        return visitDate;
    }

    String getProfile() {
        return profile;
    }

    boolean getAmVisit(){
        return isAmVisit;
    }

    boolean getPmVisit(){
        return isPmVisit;
    }

    void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    void setDocSecName(String docSecName) {
        this.docSecName = docSecName;
    }

    void setProfile(String profile) {
        this.profile = profile;
    }

    void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    void setVisitNr(int visitNr) {
        this.visitNr = visitNr;
    }

    void setAmVisit(boolean amVisit) {
        isAmVisit = amVisit;
    }

    void setPmVisit(boolean pmVisit) {
        isPmVisit = pmVisit;
    }

    //----------------------------------------------------------------------------------------------------------------------
    class Client{
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
        void setClientFirstName(String clientFirstName) {
            this.clientFirstName = clientFirstName;
        }

        void setClientSecName(String clientSecName) {
            this.clientSecName = clientSecName;
        }

        void setDiagnose(String diagnose) {
            this.diagnose = diagnose;
        }

        void setVisitPrice(double visitPrice) {
            this.visitPrice = visitPrice;
        }

        String getClientFirstName() {
            return clientFirstName;
        }

        String getClientSecName() {
            return clientSecName;
        }

        String getDiagnose() {
            return diagnose;
        }

        double getVisitPrice() {
            return visitPrice;
        }
    }

}

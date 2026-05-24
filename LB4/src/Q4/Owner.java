class Owner {

    // Data members
    private String ownerName;
    private String phoneNo;

    // No-Argument Constructor
    public Owner() {
        ownerName = "Unknown";
        phoneNo = "Unknown";
    }

    // Parameterized Constructor
    public Owner(String name, String phone) {
        ownerName = name;
        phoneNo = phone;
    }

    // Getter methods
    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // Setter methods
    public void setOwnerName(String name) {
        ownerName = name;
    }

    public void setPhoneNo(String phone) {
        phoneNo = phone;
    }
}
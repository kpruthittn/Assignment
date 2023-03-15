package Question1;

public class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", headOfficeAddress='" + headOfficeAddress + '\'' +
                ", chairmanName='" + chairmanName + '\'' +
                ", branchCount=" + branchCount +
                ", fdInterestRate=" + fdInterestRate +
                ", personalLoanInterestRate=" + personalLoanInterestRate +
                ", homeLoanInterestRate=" + homeLoanInterestRate +
                '}';
    }
}
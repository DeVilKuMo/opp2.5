package dz1;

public abstract class Driver< A extends  Transport  >  {
    private String fIo;
    private String driverLicense;
    private Double experience;




    public Driver(String fIo, String driverLicense, Double experience) {
        this.fIo = fIo;
        this.driverLicense = driverLicense;
        this.experience = experience;

    }

    public String getfIo() {
        return fIo;
    }

    public Double getExperience() {
        return experience;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setfIo(String fIo) {
        this.fIo = fIo;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }


    public abstract void startMove(A transport);

    public abstract void stopMove(A transport);

    public abstract void refill(A transport);


    @Override
    public String toString() {
        return "Водитель{" +
                "ФИО:='" + fIo + '\'' +
                ", Наличие водительских прав: ='" + driverLicense + '\'' +
                ", Стаж: =" + experience +
                '}';
    }
}

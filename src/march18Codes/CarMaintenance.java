package march18Codes;

public class CarMaintenance {
    String car_name;
    int odometerCurrent;
    int odometer_next_oil_Change;
    String airFilter_Status;
    String cabin_filter_Status;
    String oil_Filter_Status;

    public CarMaintenance(String car_name, int odometerCurrent, int odometer_next_oil_Change, String airFilter_Status, String cabin_filter_Status, String oil_Filter_Status) {
        this.car_name = car_name;
        this.odometerCurrent = odometerCurrent;
        this.odometer_next_oil_Change = odometer_next_oil_Change;
        this.airFilter_Status = airFilter_Status;
        this.cabin_filter_Status = cabin_filter_Status;
        this.oil_Filter_Status = oil_Filter_Status;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getOdometerCurrent() {
        return odometerCurrent;
    }

    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getOdometer_next_oil_Change() {
        return odometer_next_oil_Change;
    }

    public void setOdometer_next_oil_Change(int odometer_next_oil_Change) {
        this.odometer_next_oil_Change = odometer_next_oil_Change;
    }

    public String getAirFilter_Status() {
        return airFilter_Status;
    }

    public void setAirFilter_Status(String airFilter_Status) {
        this.airFilter_Status = airFilter_Status;
    }

    public String getCabin_filter_Status() {
        return cabin_filter_Status;
    }

    public void setCabin_filter_Status(String cabin_filter_Status) {
        this.cabin_filter_Status = cabin_filter_Status;
    }

    public String getOil_Filter_Status() {
        return oil_Filter_Status;
    }

    public void setOil_Filter_Status(String oil_Filter_Status) {
        this.oil_Filter_Status = oil_Filter_Status;
    }

    @Override
    public String toString() {
        return "CarMaintenance{" +
                "car_name='" + car_name + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", odometer_next_oil_Change=" + odometer_next_oil_Change +
                ", airFilter_Status='" + airFilter_Status + '\'' +
                ", cabin_filter_Status='" + cabin_filter_Status + '\'' +
                ", oil_Filter_Status='" + oil_Filter_Status + '\'' +
                '}';
    }
    public void doOilChange(){
        this.airFilter_Status="not clean";
        this.cabin_filter_Status="not clean";
        this.odometer_next_oil_Change=500;
        System.out.println("your car needs an oil change");
    }
    public void display(){
        System.out.println("your air filter status is:"+this.airFilter_Status+"\n "+"your cabin filter status is:"+this.cabin_filter_Status+" \n"+"your oil filter is:"+this.oil_Filter_Status);
    }

}

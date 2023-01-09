package homework.advance.coding.task6;

public class MeasurementConverter {

    private String conversionName;

    public MeasurementConverter(String conversionName) {
        this.conversionName = conversionName;
    }

    public String getConversionName() {
        return conversionName;
    }

    public void setConversionName(String conversionName) {
        this.conversionName = conversionName;
    }

    public double getValueConverter(int value, ConversionType conversionType){
        if(ConversionType.CENTIMETERS_TO_INCHES == conversionType){
            return value*ConversionType.CENTIMETERS_TO_INCHES.getConverter();
        }else if(ConversionType.INCHES_TO_CENTIMETERS == conversionType){
            return value*ConversionType.INCHES_TO_CENTIMETERS.getConverter();
        }else if(ConversionType.METER_TO_YARDS == conversionType){
            return value*ConversionType.METER_TO_YARDS.getConverter();
        }else if(ConversionType.YARDS_TO_METER == conversionType){
            return value*ConversionType.YARDS_TO_METER.getConverter();
        }else if(ConversionType.KILOMETERS_TO_MILES == conversionType){
            return value*ConversionType.KILOMETERS_TO_MILES.getConverter();
        }else if(ConversionType.MILES_TO_KILOMETERS == conversionType){
            return value*ConversionType.MILES_TO_KILOMETERS.getConverter();
        }
        return -1;
    }
}

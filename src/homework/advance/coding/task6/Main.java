package homework.advance.coding.task6;

public class Main {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter("Centimetres To Inches");
        System.out.println(measurementConverter.getValueConverter(100,ConversionType.CENTIMETERS_TO_INCHES));

        MeasurementConverter measurementConverter1 = new MeasurementConverter("Kilometers to Miles");
        System.out.println(measurementConverter1.getValueConverter(100,ConversionType.KILOMETERS_TO_MILES));
    }
}

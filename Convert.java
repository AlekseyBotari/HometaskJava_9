public interface Convert {
    default int convert(int celsius) {
        int fahrenheit;
        fahrenheit = (celsius * 9) / 5 + 32;
        return fahrenheit;
    }

    default double kelvin(int celsius) {
        double kelvin;
        kelvin = celsius + 273.15;
        return kelvin;
    }
}

public interface DataProcessor {
    String processData(String data);
    boolean isValid(String data);
}

class TextProcessor implements DataProcessor {

    @Override
    public String processData(String data) {
        if (data == null) {
            return null;
        }
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public boolean isValid(String data) {
        return data != null && !data.isEmpty();
    }
}

class NumberProcessor implements DataProcessor {

    @Override
    public String processData(String data) {
        if (data == null) {
            return null;
        }
        return "Processed: " + data;
    }

    @Override
    public boolean isValid(String data) {
        return data != null && data.matches("-?\\d+(\\.\\d+)?");
    }
}

class TestDataProcessor {
    public static void main(String[] args) {
        //TextProcessor
        DataProcessor textProcessor = new TextProcessor();
        String reversedData = textProcessor.processData("Bimber, Wódka");
        boolean isTextValid = textProcessor.isValid("Bimber, Wódka");

        System.out.println("text processor processed Data: " + reversedData);
        System.out.println("text processor is valid: " + isTextValid);

        //NumberProcessor
        DataProcessor numberProcessor = new NumberProcessor();
        String processedNumber = numberProcessor.processData("12345");
        boolean isNumberValid = numberProcessor.isValid("12345");

        System.out.println("number processor - processed data: " + processedNumber);
        System.out.println("number Processor - is valid: " + isNumberValid);
    }
}

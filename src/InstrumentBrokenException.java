class InstrumentBrokenException extends Exception {
    public InstrumentBrokenException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Проблема с инструментом: " + super.getMessage();
    }
}

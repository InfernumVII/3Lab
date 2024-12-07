class Magazine extends Publication {
    private final String illustration;

    public Magazine(String title, String illustration) {
        super(title);
        this.illustration = illustration;
    }

    public String getIllustration() {
        return illustration;
    }
}

class Newspaper extends Publication {
    private final String article;

    public Newspaper(String title, String article) {
        super(title);
        this.article = article;
    }

    public String getArticle() {
        return article;
    }
}
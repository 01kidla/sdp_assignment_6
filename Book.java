public final class Book implements Element {
    private final String title;
    private final double price;

    public Book(final String title, final double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitBook(this);
    }
}

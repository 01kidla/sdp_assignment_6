public final class DetailsVisitor implements Visitor {
    @Override
    public void visitBook(final Book book) {
        System.out.println("Book: " + book.getTitle()
                + ", price: $" + book.getPrice());
    }

    @Override
    public void visitMagazine(final Magazine magazine) {
        System.out.println("Magazine: " + magazine.getTitle()
                + ", price: $" + magazine.getPrice());
    }
}

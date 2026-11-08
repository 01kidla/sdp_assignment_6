public final class DiscountVisitor implements Visitor {
    @Override
    public void visitBook(final Book book) {
        final double discountedPrice = book.getPrice() * 0.90;
        System.out.println("Book " + book.getTitle()
                + " after 10% discount: $" + discountedPrice);
    }

    @Override
    public void visitMagazine(final Magazine magazine) {
        final double discountedPrice = magazine.getPrice() * 0.95;
        System.out.println("Magazine " + magazine.getTitle()
                + " after 5% discount: $" + discountedPrice);
    }
}

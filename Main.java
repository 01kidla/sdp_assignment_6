import java.util.ArrayList;
import java.util.List;

public final class Main {
    public static void main(final String[] args) {
        final List<Element> items = new ArrayList<>();

        items.add(new Book("Clean Code", 25.0));
        items.add(new Magazine("Tech Monthly", 8.0));
        items.add(new Book("Java Basics", 20.0));

        final Visitor detailsVisitor = new DetailsVisitor();
        final Visitor discountVisitor = new DiscountVisitor();

        System.out.println("ITEM DETAILS:");
        for (final Element item : items) {
            item.accept(detailsVisitor);
        }

        System.out.println("\nDISCOUNTED PRICES:");
        for (final Element item : items) {
            item.accept(discountVisitor);
        }
    }
}

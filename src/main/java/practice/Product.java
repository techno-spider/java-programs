package practice;

import customannotation.Important;

@Important
public record Product(String name, String category, int stockCount) {
}

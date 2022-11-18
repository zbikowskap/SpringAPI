package pl.sda.arppl3.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Book {
    private final Long id;
    private final String isbn;
    private final String title;
    private final String author;
    private final int pages;
}

package pl.sda.arppl3.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/book") //sktórenie zapisu wrzucając tu jednakową ściezkę dla wszystkich
public class BookController {
   // @RequestMapping(method = RequestMethod.GET, path = "/book/{id}")
  @GetMapping("/{id}")
        //  ResponseEntity<Book>findById() {
    Book findId(@PathVariable Long id) {
        Book book = new Book(1L, "simpleISBN", "simlpeTITLE", "Author", 1544);

        //return ResponseEntity.ok().body(book);
        return book;

    }

    //@RequestMapping(method = RequestMethod.GET, path = "/book")
  @GetMapping()
    List<Book> findAll(@RequestParam String author,
                       @RequestParam String title,
                       @RequestParam String sort) {
        Book book = Book.builder()
                .id(2L)
                .isbn("Sample isbn")
                .author(author)
                .title(title)
                .pages(16)
                .build();

//      List<Book>books = Stream.of(book)
//              .collect(Collectors.toList());

        // List<Book> books = List.of(book);

        //        ArrayList<Book> books = new ArrayList<>();
//        books.add(book);

        List<Book> books = Collections.singletonList(book);
        return books;

    }


    @ResponseStatus(HttpStatus.CREATED)
    // @RequestMapping(method = RequestMethod.POST, path = "/book")
    @PostMapping() // powyżej  wrequest mapping ściezka dla postMapingu
    void addBook(@RequestBody Book book) {
        //zeby dostac booka musisz zrbic request
        System.out.println("Added book.....");
    }
}

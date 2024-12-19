package booung.Api.Book.CRUD;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookRestController {


    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/product")
    public void create(@Valid @RequestBody CreateBookRequest createBookRequest) {

        bookService.create(createBookRequest);
    }

//    @GetMapping("/product")
//    public void seviceget(@PathVariable CreateBookRequest createBookRequest) {
//        Book book = new Book();
//        book.
//    }
}
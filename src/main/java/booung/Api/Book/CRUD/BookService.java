package booung.Api.Book.CRUD;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book create(CreateBookRequest createBookRequest) {

        return bookRepository.save(
            new Book(createBookRequest.title(),
                createBookRequest.author(),
                createBookRequest.isbn()));
    }
}

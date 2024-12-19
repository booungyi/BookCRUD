package booung.Api.Book.CRUD;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    public Book create(Book book) {
        return bookRepository.save(book);
    }

}

package booung.Api.Book.CRUD;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;


public record CreateBookRequest(@Size(min = 2, max = 10) String title,
                                @Size(min = 2, max = 10) String author,
                                @Size(max = 13, min = 13) String isbn,
                                @Min (1) Integer price,
                                @Min(1900) @Max(2024) Integer publishedYear
) {}
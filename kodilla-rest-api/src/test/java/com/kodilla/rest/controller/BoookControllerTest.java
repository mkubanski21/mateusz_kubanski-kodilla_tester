package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BoookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BoookController bookController = new BoookController(bookServiceMock);

    @Test
    void shouldFetchBooks() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBooks() {
        //when
        bookController.addBook(new BookDto("Title 1", "Author 1"));
        bookController.addBook(new BookDto("Title 2", "Author 2"));

        //then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("Title 1", "Author 1"));
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(new BookDto("Title 2", "Author 2"));
        Mockito.verify(bookServiceMock, Mockito.times(0)).addBook(new BookDto("Title 3", "Author 3"));
    }
}

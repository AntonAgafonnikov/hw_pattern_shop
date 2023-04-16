package ru.netology.website.database.products;

import java.time.LocalDate;
/*
Interface Segregation Principle
Когда добавиться новый товар, который может испортиться, нам не придётся выносить его в отдельную категорию, мы просто
сможем имплементировать интрфейс Expiretable (со сроком годности).
 */
public interface Expiretable {
    LocalDate expirationDate();
}

package com.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="BOOK")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="TITLE", length=200, nullable=false)
    private String title;

    @Column(name="ISBN", length=50, nullable=false)
    private String iSBN;

    @Column(name="SUBJECT", length=100, nullable=false)
    private String subject;

    @Column(name="PUBLISHER", length=200, nullable=false)
    private String publisher;

    @Column(name="LANGUAGE", length=100, nullable=false)
    private String language;

    @Column(name="NO_PAGES", length=10, nullable=false)
    private int noPages;

    @Column(name="AUTHOR_NAME", length=200, nullable=false)
    private String authorName;

}

package com.example.elasticsearch.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author eren
 */
@Document(indexName = "book", type = "mailbox", shards = 1, replicas = 0, refreshInterval = "-1")
@Data
@NoArgsConstructor
public class Book {
}

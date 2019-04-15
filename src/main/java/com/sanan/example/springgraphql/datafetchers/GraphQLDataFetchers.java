package com.sanan.example.springgraphql.datafetchers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	private static List<Map<String, String>> books = Arrays.asList(
			ImmutableMap.of("id", "book-1", "name", "Harry Potter and the Philosopher's Stone", "pageCount", "223"),
			ImmutableMap.of("id", "book-2", "name", "Moby Dick", "pageCount", "635"),
			ImmutableMap.of("id", "book-3", "name", "Interview with the vampire", "pageCount", "371"));

	public DataFetcher getBookByIdDataFetcher() {
		return dataFetchingEnvironment -> {
			String bookId = dataFetchingEnvironment.getArgument("id");
			return books.stream().filter(book -> book.get("id").equals(bookId)).findFirst().orElse(null);
		};
	}
}

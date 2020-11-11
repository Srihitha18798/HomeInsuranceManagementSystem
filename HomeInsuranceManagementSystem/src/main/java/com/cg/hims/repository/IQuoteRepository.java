package com.cg.hims.repository;

import java.util.List;

import com.cg.hims.entities.Quote;
import com.cg.hims.exceptions.QuoteNotFoundException;

public interface IQuoteRepository {

	public Quote addQuote(Quote quote);

	public Quote updateQuote(Quote quote) throws QuoteNotFoundException;

	public Quote findQuoteById(int id) throws QuoteNotFoundException;

	public Quote removeQuote(int id) throws QuoteNotFoundException;

	public List<Quote> showAllQuotes();

}

package stepDefinitions;

import org.junit.Assert;

import apiEngine.model.Book;
import apiEngine.model.requests.AddBooksRequest;
import apiEngine.model.requests.ISBN;
import apiEngine.model.requests.RemoveBookRequest;
import apiEngine.model.response.Books;
import apiEngine.model.response.UserAccount;
import apiEngines.IRestResponse;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import io.restassured.response.Response;

public class BooksSteps extends BaseStep {

	public BooksSteps(TestContext testContext) {
		super(testContext);
	}

	private static final String USER_ID = "450d6cd0-737b-49e3-b246-b3f0456e097b";
	private Response response;
	private IRestResponse<UserAccount> userAccountResponse;
	private Book book;

	@Given("^A list of books are available$")
	public void listOfBooksAreAvailable() {
		IRestResponse<Books> booksResponse = getEndPoints().getBooks();
		Book book = booksResponse.getBody().books.get(0);
		getScenarioContext().setContext(Context.BOOK, book);
	}

	@When("^I add a book to my reading list$")
	public void addBookInList() {
		Book book = (Book) getScenarioContext().getContext(Context.BOOK);
		String userId = (String) getScenarioContext().getContext(Context.USER_ID);

		ISBN isbn = new ISBN(book.isbn);
		AddBooksRequest addBooksRequest = new AddBooksRequest(userId, isbn);

		IRestResponse<UserAccount> userAccountResponse = getEndPoints().addBook(addBooksRequest);
		getScenarioContext().setContext(Context.USER_ACCOUNT_RESPONSE, userAccountResponse);
	}

	@When("^I remove a book from my reading list$")
	public void removeBookFromList() {
		Book book = (Book) getScenarioContext().getContext(Context.BOOK);
		String userId = (String) getScenarioContext().getContext(Context.USER_ID);

		RemoveBookRequest removeBookRequest = new RemoveBookRequest(userId, book.isbn);

		Response response = getEndPoints().removeBook(removeBookRequest);
		getScenarioContext().setContext(Context.BOOK_REMOVE_RESPONSE, response);
	}

}

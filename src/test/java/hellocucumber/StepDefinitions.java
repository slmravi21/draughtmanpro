package hellocucumber;

 import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.stream.Stream;

public class StepDefinitions {

    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();

    System.out.println("WHEN");
//    wait(1000);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) throws IOException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("THEN");

    String fileName = "E:\\drmanpro\\draughtsmanpro\\src\\test\\resources\\data\\ebcdicnumbers.txt";
    try(Stream<String> line = Files.lines(Paths.get(fileName))){
//        List<String> text = null;
        
      line.forEach(System.out::println);
//        System.out.println(Convert(line,"CP1047","ISO-8859-1"));

    }
    }

  public static String Convert(Stream<String> strToConvert, String in, String out) {
    try {
      Charset charset_in = Charset.forName(out);
      Charset charset_out = Charset.forName(in);
      CharsetDecoder decoder = charset_out.newDecoder();
      CharsetEncoder encoder = charset_in.newEncoder();
      CharBuffer uCharBuffer = CharBuffer.wrap((CharSequence) strToConvert);
      ByteBuffer bbuf = encoder.encode(uCharBuffer);
      CharBuffer cbuf = decoder.decode(bbuf);
      String s = cbuf.toString();
      // System.out.println("Original String is: " + s);
      return s;
    } catch (CharacterCodingException e) {
      // System.out.println("Character Coding Error: " + e.getMessage());
      return "";
    }
}
    @Given("Connect to the DB")
    public void connect_to_the_db() throws ClassNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "java";
        String password = "password";

        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver loaded!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }
}

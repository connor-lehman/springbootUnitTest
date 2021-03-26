
package example.springboot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Scanner;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


public class ApplicationTest {
    @Autowired
    private MockMvc mvc;

    public static void ApplicationTest1() throws Exception {
        mvc.perform(post("/api")
            .contentType(MediaType.APPLICATION_JSON)
            .content("Posting a cool message")
            .accept(MediaType.APPLICATION_JSON));
        mvc.perform(post("/delete")
            .contentType(MediaType.APPLICATION_JSON)
            .content("Posting a cool message")
            .accept(MediaType.APPLICATION_JSON));
    }

    public static void ApplicationTest2(){
        mvc.perform(post("/api")
                .contentType(MediaType.APPLICATION_JSON)
                .content("Testing if delete is case sensitive")
                .accept(MediaType.APPLICATION_JSON));
        mvc.perform(post("/delete")
                .contentType(MediaType.APPLICATION_JSON)
                .content("TESTING IF DELETE IS CASE SenSItIVe")
                .accept(MediaType.APPLICATION_JSON));
    }
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 or 2 corresponding to the test you want to run:");
        int userInput = scan.nextInt();
        if (userInput == 1) { ApplicationTest1(); }
        else { ApplicationTest2(); }

    }
}
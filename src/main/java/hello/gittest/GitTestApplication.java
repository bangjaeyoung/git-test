package hello.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("test1234");
        System.out.println("second");
        System.out.println("fourth");
        System.out.println("fourth2");
        System.out.println("fourth3");
    }
}

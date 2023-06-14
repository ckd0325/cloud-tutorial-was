package test.cloud_tutorial.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/")
    public SampleJson getSampleJson() {
        SampleJson json = new SampleJson();
        json.setMessage("Hello, world!");
        json.setNumber(42);
        return json;
    }

    private static class SampleJson {
        private String message;
        private int number;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}

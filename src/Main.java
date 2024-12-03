import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    WebDriver driver;

    public void launch(){
        driver = new SafariDriver();

        driver.get("https://jsdl.in/DT-49B6JJS98DQ");


        try {
            WebElement searchBox = driver.findElement(By.id("main-auto"));
            searchBox.sendKeys("");

            List<WebElement> rats = driver.findElements(By.xpath("//*[@id=\"__next\"]/div"));


            Thread.sleep(4000);
            //WebElement rati = driver.findElement(By.xpath("//*[@id=\"__next\"]"));


            File file = new File("/Users/retro/IdeaProjects/Selenium/src/Feedback.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (WebElement rating : rats) {
                String review = "Rating: " + rating.getText();
                writer.write(review);       // Write the review to the file
                writer.newLine();           // Write a new line
            }
           // WebElement gi = rati;
           // String review = "Rating: " + gi.getText();
           // writer.write(review);



            System.out.println("Reviews have been saved to Feedback.txt");


        } catch (InterruptedException | IOException e) {
            e.printStackTrace();

        }
        finally {
            driver.quit();
        }

    }
    public static void main(String[] args) {

        Main obj = new Main();
        obj.launch();

    }
}
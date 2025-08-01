package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GoogleSteps {

    WebDriver driver;

    /*@Given("el usuario abre Google Chrome")
    public void abrirGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        try {
            WebElement aceptar = driver.findElement(By.id("L2AGLb")); // botón de cookies
            aceptar.click();
        } catch (Exception e) {
            // si no aparece, continuar
        }
    }*/

    @Given("el usuario abre Google en Firefox")
    public void abrirGoogleFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");

        // Indica la ubicación exacta del ejecutable de Firefox
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); // o cambia si es otra ruta

        driver = new org.openqa.selenium.firefox.FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        try {
            WebElement aceptar = driver.findElement(By.id("L2AGLb"));
            aceptar.click();
        } catch (Exception e) {
            // si no aparece el botón de cookies, continuar
        }
    }
    @When("el usuario abre la búsqueda directa de imágenes con la palabra {string}")
    public void abrirBusquedaImagenesDirecta(String palabra) throws InterruptedException {
        String url = "https://www.google.com/search?q=" + palabra + "&tbm=isch";
        driver.get(url);
        Thread.sleep(2000);
    }

    @When("el usuario busca {string}")
    public void buscarPalabra(String palabra) {
        WebElement buscador = driver.findElement(By.name("q"));
        buscador.sendKeys(palabra);
        buscador.submit();
    }

    @When("hace clic en la pestaña de Imágenes")
    public void hacerClickImagenes() throws InterruptedException {
        Thread.sleep(2000); // espera por carga
        WebElement imagenes = driver.findElement(By.linkText("Imágenes"));
        imagenes.click();
    }

    @Then("se muestran imágenes relacionadas a {string}")
    public void verificarImagenes(String palabra) throws InterruptedException {
        Thread.sleep(2000);
        boolean hayImagenes = driver.findElements(By.cssSelector("img")).size() > 0;
        if (hayImagenes) {
            System.out.println("✅ Se encontraron imágenes de " + palabra);
        } else {
            System.out.println("❌ No se encontraron imágenes.");
        }
        driver.quit();
    }
}

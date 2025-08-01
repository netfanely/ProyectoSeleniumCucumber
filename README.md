# ProyectoSeleniumCucumber
Para mi portafolio, que puedan revisar los de recursos humanos , para busqueda de una nueva posición como QA Specialist 2 o  QE (QA Engineer)

```markdown
# 🧪 Buscar Garfield en Google Imágenes con Selenium + Cucumber

Este proyecto automatiza la búsqueda de imágenes en Google (u otros motores) usando **Selenium WebDriver**, **Cucumber** y **Gherkin**, ejecutando escenarios BDD desde IntelliJ con Maven.

---

## 📌 ¿Qué hace?

- Abre Google en **Chrome** o **Firefox**
- Busca una palabra clave (como “Garfield”)
- Da clic en la pestaña de imágenes
- Valida si se muestran resultados
- También permite **abrir directamente la URL de búsqueda de imágenes**

---

## 🛠 Tecnologías usadas

- Java 11+
- Selenium 4
- Cucumber 7
- JUnit 4
- Maven

---

## 📁 Estructura del proyecto

```

src/
├── test/
│   ├── java/
│   │   ├── runner/
│   │   │   └── TestRunner.java
│   │   └── steps/
│   │       └── GoogleSteps.java
│   └── resources/
│       ├── features/
│       │   └── buscar\_garfield.feature
│       └── drivers/
│           └── chromedriver.exe / geckodriver.exe

````

---

## ▶️ Cómo ejecutar

### 1. Clona este repositorio

```bash
git clone https://github.com/tu-usuario/buscar-garfield-selenium.git
cd buscar-garfield-selenium
````

### 2. Importa el proyecto en IntelliJ IDEA como **proyecto Maven**

### 3. Verifica los drivers

* Asegúrate de tener `chromedriver.exe` y/o `geckodriver.exe` en `src/test/resources/drivers/`
* Descarga `geckodriver` aquí: [https://github.com/mozilla/geckodriver/releases](https://github.com/mozilla/geckodriver/releases)

### 4. Ejecuta el Runner

Desde IntelliJ, haz clic derecho en `TestRunner.java` > **Run**

---

## 🧪 Ejemplos de escenarios (Gherkin)

```gherkin
Scenario: Usuario accede directamente a imágenes de Garfield
  Given el usuario abre Google en Firefox
  When el usuario abre la búsqueda directa de imágenes con la palabra "Garfield"
  Then se muestran imágenes relacionadas a "Garfield"
```

---

## 📷 Captura de pantalla

## 🖼 Vista previa del test en ejecución

![Prueba automatizada en Firefox](docs/garfield_test.png)

---

## 🧠 Autor

Creado por Fanny Pastor — automatización con cariño y Garfield 🐱

---

## ⚖️ Licencia

MIT License

```


# Innlevering 2: Http server

[![Java CI with Maven](https://github.com/kristiania-pgr203-2021/pgr203-innlevering-2-sanderwe/actions/workflows/maven.yml/badge.svg)](https://github.com/kristiania-pgr203-2021/pgr203-innlevering-2-sanderwe/actions/workflows/maven.yml)

## Oppgave

Lag en HTTP server som kan returnere HTML-filene som er inkludert i oppgaven og behandle requestene til /api/products, /api/categoryOptions og /api/newProduct korrekt. Det skal være JUnit-tester for HttpServer-koden

## Innlevering

Innleveringen skal leveres parvis på Canvas med link til GitHub-repository. Begge skal levere i Canvas (med link til
samme repository). Dere kan gå sammen med et annet par for å gi hverandre code review om dere ønsker

## Krav til innlevering

* Funksjonalitet
    * [x] `mvn package` bygger en executable jar-fil med shade plugin
    * [x] HttpServer lar brukeren vise websidene
    * [x] `newProduct.html` henter og viser en liste over produktkategorier fra serveren
    * [x] `newProduct.html` lagrer produkt til serveren
    * [x] `listProducts.html` henter og viser produkter fra serveren
* Innlevering (som for innlevering 1, men zip-fil er ikke nødvendig)
    * [X] Koden er sjekket inn på et repository på https://github.com/kristiania-pgr203-2021
    * [X] GitHub repository er private. Dere skal gi tilgang til de som eventuelt gir code review
    * [x] Begge har levert link til Github Repository i Canvas
* Github (som for innlevering 1)
    * [X] `.idea`, `*.iml` og `target` er lagt til i .gitignore og ikke sjekket inn
    * [x] Github Actions rapporterer at 100% av testene kjører grønt
    * [X] GitHub Actions skal ha `timeout` på bygget
* Kode (som for innlevering 1)
    * [X] Prosjektet skal være korrekt strukturert etter Maven sine standarder (koden skal ligge under `src/main/java` og tester under `src/test/java`)
    * [X] Klassene skal ligge i Java packages
    * [x] Koden inneholder testklasser for HttpServer og HttpClient
    * [x] Klassenavn, pakkenavn, metodenavn og variabelnavn skal følge Java-konvensjoner når det gjelder små og store bokstaver
    * [X] Koden skal være korrekt indentert

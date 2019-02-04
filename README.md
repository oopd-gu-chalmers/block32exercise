# block31exercise

## Uppgifter
* Färdigställ implementationen av klassen Tuple. Tanken är att den ska fungera som en tupel i e.g. Haskell eller Python. Den ska hålla två värden av (potentiellt) olika (godtycklig) typ, och ha metoderna fst() och snd() för att returnera första respektive andra komponenten.
* Titta på koden för AnimalShelter med tillhörande kring-klasser. Kika särskilt på ShelterError. Hur kan vi tänka om, så att det inte är möjligt att sätta hundar i ett katt-hem, och vice versa, utan att förlora code reuse eller extensibility? Vi vill få ett statiskt felmeddelande, inte ett fel (exception) vid runtime!
* Färdigställ implementationen av interfacet Function. Tanken är att det ska representera funktioner från argument av någon typ T till resultat av någon typ R. Interfacet ska ha metoderna compose, som sätter ihop två funktioner av lämpliga argument- och retur-typer, samt apply, som applicerar funktionen på ett lämpligt argument. 

## För mer utmaning: 
* Färdigställ implementationen av klassen Either<A,B>. Tanken är att den ska fungera som typen Either i Haskell. Den ska representera antingen ett objekt av typen A (annoterat Left) eller ett objekt av typen B (annoterat Right), och ha metoderna isLeft() och isRight(). Den ska också ha metoden either med motsvarande signatur (A -> R) -> (B -> R) -> R (fast uttryckt på ett sätt som är möjligt i Java).
* Ge en default-implementation av metoden Function.compose från ovan (Obs! Kräver kännedom om Lambdas!).

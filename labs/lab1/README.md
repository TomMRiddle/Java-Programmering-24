# Dokumentation
## Hur spelar man?
### Allmänt om spelet
Spelet startas från Main-klassen och spelaren får i en meny välja vilket spel de vill spela genom att ange den siffra som står för det menyvalet. Skriver man in en annan siffra än de tillåtna valen får de ett meddelande om att ange en giltig siffra. efter att man spelat klart ett spel hamnar man åter i huvudmenyn.

### DiceGame
För att spela spelet ska man först ange sitt namn, hur många sidor tärningen ska ha och hur många spelrundor man vill ha, spelet börjar sedan.
En spelrunda är att spelaren får gissa vad tärningskastet kommer visa, tärningen kastas och spelaren får ett poäng ifall de gissar rätt. När det antal rundor som angavs innan spelet början har gått så visas slutpoängen för spelaren.


### MultiplayerDiceGame
Innan spelet börjar får man ange antal spelare, antal tärningar, antal sidor på tärningarna samt antal rundor man vill spela. När man angett antal spelare får man direkt skriva spelarnas namn innan nästa fråga kommer. När alla frågor är besvarade körs spelet. Då det bara är ett spel med slump utan någon input från spelarna skrivs utfallet för alla rundor ut och vinnarna. En runda går till så att tärningarna kastas och läggs på spelarens poäng. Vinnare är de spelare som efter alla rundor spelats har flest poäng.

### PigGame
Innan spelet börjar får man ange antal spelare och fylla i deras namn. Spelet snartar direkt efter att sista spelarens namn fyllts i. efter att en tärning kastats får användaren reda på vad tärningen visar och en fråga om de vill avsluta sin runda eller kasta igen. spelarens runda tar slut när de väljer att avsluta den eller när ett tärningskast resulterar i en etta. om man kastar en etta får man inte fortsätta och alla poäng man fått den rundan tas bort. om man avslutar genom att aktivt välja att avsluta sin runda så läggs resultatet från alla tärningskast från den rundan till ens totala poäng. när en användare nått 100 eller mer poäng så avslutas spelet när alla spelat klart sin runda. alla spelare med högst poäng visas som vinnare.

## Förklaring av koden
Jag började med att planera hur jag skulle dela upp spelet i olika klasser och ville göra det på ett strukturerat sätt och valde MVC-mönstret (Model, view, controller), för att jag kände till det sedan tidigare och bekantat mig med det när jag använde ett php-ramverk när jag gick Webbutveckling på Blekinge Tekniska Högskola för 100 år sedan. Modellerna är data-lagret, kontrollerna står för logiken och vyerna för användargränssnittet. Tanken var från början att alla speltyper skulle få sin egen modell, kontroller och vy. Allt eftersom jag skrev koden så tog jag bort modellerna för varje speltyp och nöjde mig med en gemensam vy för alla varianter, detta för att det inte fanns så mycket att skriva i dem och det blev en bättre balans för överskådligheten utifrån hur uppgiften såg ut.

Ett resultat av att jag tog bort modellerna är att nästan all logik ligger i kontrollerna och metoder som skulle ha en returtyp inte behövde det längre då det som de skulle returneras låg i samma klass som där metoden användes. Jag hade också skapat abstrakta klasser och interface som jag tog bort och en GameFactory som sedan mer eller mindre blev main-klassen till slut. 

Man kan i stort sett förstå hur allt hänger ihop för en given speltyp genom att läsa koden i kontrollern för den speltypen. Det är en del av koden i kontrollersena som är samma (som upprepas) men i det stora hela så är det som ligger i modellerna och vyn som återanvänds i alla speltyper utan att kod upprepas.

Sammanfattningsvis kan man säga att jag hade större ambitioner än vad som fanns möjlighet till och att jag skapade onödig komplexitet som jag sedan tog bort allt eftersom spelen växte fram. Det känns lite som att jag gått baklänges i omstruktureringen, det tog lång planering och jag hade stora planer. Nästa gång ska jag ägna mer tid åt omstrukturering än planering, så vida inte uppgiften kräver något annat.

## Fullständig offentliggörande om användning av AI
Jag har gjort en del webbsökningar för att läsa om olika metoder och design-mönster. Jag har även under tiden jag utvecklat återkommande frågat en LLM (qwen2.5-coder via ollama som körts lokalt på datorn) för att förstå olika delar innan jag gjort vägval. AI-chat-modellen har genererat exempelkod som varit som ett stöd för att förstå olika resonemang. Inte en enda rad har kopierats eller exakt skrivits av från konversationen med AI:n.

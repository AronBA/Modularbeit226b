# Journal 
###### von Tristan

---
## 18/3/2022
Heute habe ich ein wenig mit JFrame experimentiert. Ich konnte nicht viel fortschritt machen, weil ich noch nicht viel Gedanken darüber gemacht hatte, was wir machen. Ich habe einfach Aron geholfen beim groben Design des Guis.

---
## 25/03/2022
Heute hatte ich Orientierungstag. Deswegen konnte ich nicht am Projekt mitarbeiten.

---
## 01/04/2022
Heute habe ich Aron geholfen beim Finden der Formel. Es hat sich als schwerer herausgestellt als gedacht, da die Formel vom Offiziellen Minecraft Wiki nicht ganz funktioniert hat. Ich habe später in dem verlauf der Stunde eine funktionierende Formel gefunden, welche wir verwenden können. Wir haben es direkt implementiert was einfach war als gedacht und sie anschließend ausgetestet.

---
## 08/04/2022
Da wir keine möglichkeit gefunden haben ein Interface sinnvoll in das Projekt einzubinden, abgesehen von den Actionlistener, habe ich weiter unten einen kleinen Text zu den Interfaces geschrieben. Dammit ich die erklärung schreiben konnte, musste ich mich natürlich Informieren wie genau diese funktionieren.
### Interfaces 


Interfaces funktionieren im grunde wie Klasse nur mit dem Unterschied, dass man nur Variablen definieren und Methodensignaturen angeben kann. Das heist man kann nur angegeben was gemacht wird, aber nicht wie es gemacht wird. Das bringt den entscheidenden Vorteil, das wir Klassen haben können mit funkionen, ohne in dieser zu definieren, was genau passiert. Hier ein Beispiel:
```java
/**
 * Das Interface IZahlung definiert nur die Signatur der Methode erzeugeZahlung();
 */
interface IZahlung{
    void erzeugeZahlung();
}
/**
 * Abgesehen von der PayPal Klasse gibt es noch andere Klassen (zB. Visa, Maestro) welche gleich aufgebaut sind.
 * Der Einzige unterschied ist das in erzeugeZahlung() eine andere Logik steht.
 */

class PayPal implements IZahlung{ 
    
    @Override
    public void erzeugeZahlung(){
        //Hier würde die Zahlungslogik mit PayPal stehen bzw. die Logik für Visa in der Visa Klasse
    }
}
/**
 * Die Shop klasse verwendet für die zahlen Methode mit der logik welche im Konstruktor angegeben wurde.
 */
class Shop{
    
    private IZahlung zahlung = null;
    
    shop(IZahlung z){
        this.zahlung = z;
    }
    public void zahlen(){
        zahlungsart.erzeugeZahlung();
    }
}

/**
 * In der Main klasse wird ein neues Shop objekt erstellt mit der PayPal und die Zahlen funktion verwendet.
 */

class Main{
    public static void main(String[] args) {
        Shop s = new Shop(new PayPal());
        s.zahlen();//note: die zahlen funktion nutzt die Logik der PayPal Klasse.
    }
}
```
Der Punkt bei diesem beispiel ist, dass falls sich etwas mit der Bezahlmethode von PayPal ändert, wir einfach die PayPal Klasse abändern können und nicht die Shop-Klasse umschreiben müssen, was ein größerer Wartungsaufwand wäre.

---
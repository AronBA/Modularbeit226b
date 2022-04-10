# Journal 
###### von Aron

---
## 18/3/2022
Heute hab ich mit dem Design der GuiCalculators angefangen. Um eine ungefähre ahnung zu bekommen, wie ich das ganze Programmiere habe ich ein grobes Design in Word gemacht. Danach habe ich mich mit JFrame auseinandergesetzt. Da ich noch nicht so viel erfahrung mit GuiCalculators habe, musste ich zuerst mich informiert wie JFrame überhaupt funktioniert.

---
## 25/03/2022
Heute habe ich angefangen das GuiCalculator zu programmieren. Da ich heute alleine arbeiten muss, konnte ich sehr effizient arbeiten. Zuerst gab es Probleme weil ich vergessen habe `this.setVisible(true);` auf true zu stellen. Dadurch konnte ich das GuiCalculator nicht sehen und dachte es funktioniert nicht. Später bin ich noch auf ein anderes Problem gestoßen. Als ich mein Label darstellen wollte, ist mir aufgefallen das es manchmal einfach nicht angezeigt wird. Durch ein wenig recherche habe ich herausgefunden, wo das Problem lag. `this.setVisible(true);` muss zwingen am Ende stehen. Ansonsten kann es sein das einige Labels nicht mehr geladen werden. 

---
## 01/04/2022
Heute habe ich mit dem berechnen angefangen, ich musste zuerst mich Informieren wie überhaupt schaden berechnet wird. Dazu habe ich das Minecraft Wiki verwendet auf dem ich auf einige Formeln gestoßen bin.
Die Formel zu verstehen machte mir, am anfang ein wenig Probleme. ALs ich sie in Java angewendet hatte, stimmten die Ergebnisse trotzdem nicht. Ich habe noch ein wenig weiter gesucht und habe dann eine Formel gefunden die Funktioniert. Danach habe ich angefangen das GUI für das Resultat zu schreiben. Es zeigt ganz simple einfach an wie viele Herzen der spieler verliert.

---
## 02/04/2022
Heute habe ich das gesamte Projekt ein wenig umstrukturiert. Die Waffen auswahl und die Rüstung auswahl sollen eigene GUIs kriegen. Ich habe auch das gesamte Layout abgeändert damit es ein wenig schöner aussieht. Ich habe außerdem ein Java LookandFeel (LAF) hinzugefügt, da mir das standard von JFrame nicht gefiel. Da aber nicht jeder die Plugins installiert hat, musste ich eine Lösung suchen. Ich habe mich dazu entschieden die plugins im Resource Ordner des Projects zu speichern was gut funktioniert.

---
## 03/04/2022
Heute habe ich ein kleineres Problem gelöst. Die Ausgabe des Resultats war nicht ganz korrekt. Das Problem war, das die ausgewählten Daten überhaupt nicht zur Berechnung verwendet wurden. Ich musste einige getter und setter schreiben, damit ich Klassen übergreifend auf die Daten zugreifen kann. Ich habe außerdem das LaF nochmal geändert. Später habe ich einige variablen umbenennt zur besseren Übersicht, sowie den Code neu formatiert. Zum schluss habe ich noch eine Catch block eingebaut welcher die null pointer exception catcht, falls der benutzer versuchte etwas auszurechnen, ohne vorher irgendetwas auszuwählen.

---
## 08/04/2022
Heute habe ich damit begonnen den Source Code zu dokumentieren. Außerdem habe ich noch Äxte hinzugefügt. Da ich genauere Daten angeben wollte beim resultat also nur der Schaden, musste ich neu auch die Angriffsgeschwindigkeit mit berechnen damit ich damit auf den Schaden pro sekunde komme. ICh habe mich entschieden das Ganze in einer Tabelle darzustellen.

---
## 09/04/2022
Heute habe ich das Journal ausgearbeitet sowie einige Variablen umbenannt. Außerdem habe ich den Source Code noch besser dokumentiert.

---
## 10/04/2022
Heute habe ich das Journal nochmal überarbeitet. Außerdem habe ich das README file überarbeitet und eine Fertige Version des Rechners als Kompilierte Jar file auf GGithub unter den Releases zur Verfügung gestellt. 

---
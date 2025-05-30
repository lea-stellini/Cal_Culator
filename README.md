# 🤖 Cal Culator  
Cal Culator est une calculatrice en ligne de commande en Java, qui permet de faire les opérations de base (+, -, *, /) avec des nombres entiers ou décimaux.  
Elle est conçue avec une architecture modulaire pour faciliter la maintenance et les évolutions.

### Fonctionnalités  
- Addition, soustraction, multiplication et division

- Support des nombres entiers et décimaux (double)

- Gestion des erreurs utilisateur (saisie invalide, division par zéro)

- Répétition des calculs jusqu’à ce que l’utilisateur choisisse d’arrêter

### Structure du projet  
-  Main.java : Point d’entrée, gestion du flux principal du programme    

- Calculator.java : Classe regroupant les opérations mathématiques

- ConsoleUtils.java : Gestion des interactions avec l’utilisateur (saisie, messages)

### Installation & exécution
1. Cloner le dépôt ou copier les fichiers .java dans un dossier com/example

2. Compiler les fichiers depuis la racine du dossier contenant com :

    ```javac com/example/*.java```  

3. Lancer le programme :

    ```java com.example.Main```
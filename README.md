# Sistem de Plăți Interbancare APC 🏦

O aplicație Full-Stack modernă pentru procesarea transferurilor bancare simultane, punând accent pe securitate, multithreading și experiență utilizator (UX).

## Tehnologii Utilizate
* **Backend:** Java Spring Boot (REST API)
* **Frontend:** HTML5, CSS3 (Modern UI cu efecte de blur), JavaScript (Asynchronous Fetch API)
* **Baza de date:** H2 In-Memory Database
* **Securitate:** Sistem antifraudă integrat și validare strictă a datelor.

## Funcționalități Cheie
1.  **Procesare Paralelă (Multithreading):** Transferurile către unități diferite sunt executate simultan.
2.  **Sistem Antifraudă:** Detectarea utilizării aceluiași card în locații diferite în aceeași sesiune.
3.  **Istoric Detaliat:** Jurnal de tranzacții cu timestamp precis și status.
4.  **Filtrare Avansată:** Sistem de filtrare a istoricului după locație și dată, cu interfață modală.

---

## Case Studies

### 1. Interfața Principală și Selecția
Utilizatorul poate alege una sau mai multe unități bancare pentru a iniția transferuri.
**[SCREENSHOT: Meniul de selecție cu 2-3 bănci bifate]**

### 2. Validarea Datelor și Limitări
Sistemul previne erorile de introducere, cum ar fi sumele negative sau depășirea limitei de credit.
**[SCREENSHOT: Mesaje de eroare pentru "Suma trebuie sa fie pozitiva"]**
**[SCREENSHOT: Mesaj de eroare pentru depășirea limitei de 5000 RON]**

### 3. Securitate: Detectarea Fraudei
Aplicația blochează tranzacțiile dacă detectează utilizarea aceluiași card în mai multe locații simultan.
**[SCREENSHOT: Mesajul de Alerta Securitate pentru card utilizat în mai multe orașe]**

### 4. Succes și Confirmare
După procesarea cu succes, formularele sunt curățate și utilizatorul primește confirmarea.
**[SCREENSHOT: Mesajul verde "Transferurile au fost procesate"]**

### 5. Managementul Istoricului
Tranzacțiile sunt salvate cu toate detaliile tehnice necesare.
**[SCREENSHOT: Pagina de Istoric cu mai multe tranzacții listate]**

### 6. Sistemul de Filtrare
Filtrarea dinamică permite auditarea rapidă a plăților.
**[SCREENSHOT: Modalul de filtrare deschis, cu fundalul blurat în spate]**

---

## Cum se rulează
1. Asigurați-vă că aveți Java JRE instalat.
2. Rulați `Start-Server.bat` pentru a porni backend-ul.
3. Deschideți `app.html` în orice browser modern.
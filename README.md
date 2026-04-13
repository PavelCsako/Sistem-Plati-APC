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
<img width="994" height="467" alt="image" src="https://github.com/user-attachments/assets/ddbe787f-8df6-432b-a421-43f605fb52aa" />

Utilizatorul poate alege una sau mai multe unități bancare pentru a iniția transferuri.
<img width="986" height="753" alt="image" src="https://github.com/user-attachments/assets/060ce4b6-f0a4-496b-a151-c22f6b98c2e6" />


### 2. Validarea Datelor și Limitări
Sistemul previne erorile de introducere, cum ar fi sumele negative sau depășirea limitei de credit.
<img width="865" height="582" alt="image" src="https://github.com/user-attachments/assets/060ea7a3-6d31-49e6-a28f-010b70a97fb2" />
<img width="867" height="157" alt="image" src="https://github.com/user-attachments/assets/2b1bd3ec-baea-4254-a79b-d4cc7c9252cc" />

### 3. Securitate: Detectarea Fraudei
Aplicația blochează tranzacțiile dacă detectează utilizarea aceluiași card în mai multe locații simultan.
<img width="895" height="609" alt="image" src="https://github.com/user-attachments/assets/5b5a0250-6574-4516-8f77-d33a8336c142" />

### 4. Succes și Confirmare
După procesarea cu succes, formularele sunt curățate și utilizatorul primește confirmarea.
<img width="995" height="470" alt="image" src="https://github.com/user-attachments/assets/d1094fb4-1b4f-405f-8ec1-0bc31f01613a" />

### 5. Managementul Istoricului
Tranzacțiile sunt salvate cu toate detaliile tehnice necesare.
<img width="990" height="866" alt="image" src="https://github.com/user-attachments/assets/763979b6-c3a2-42b1-8452-14332621a5bc" />

### 6. Sistemul de Filtrare
Filtrarea dinamică permite auditarea rapidă a plăților.
<img width="689" height="760" alt="image" src="https://github.com/user-attachments/assets/ddbe2e0b-69ed-484c-9895-0c138d0a8df1" />

---

## Cum se rulează
1. Asigurați-vă că aveți Java JRE instalat.
2. Rulați `Start-Server.bat` pentru a porni backend-ul.
3. Deschideți `app.html` în orice browser modern.

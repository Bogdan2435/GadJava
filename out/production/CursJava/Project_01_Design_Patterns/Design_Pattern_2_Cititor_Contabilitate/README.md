#DESIGN PATTERN 2, Cititor pentru contabilitate

Primul design pattern ales de mine este unul de tip Chain of Resonsibility cu ajutorul caruia voi putea verifica daca anumite fisiere pot fi deschise sau nu. <br/>
Modul in care functioneaza acest program este: el verifica cu ajutorul extensilor pe care il au fisierele daca aceste pot fi deschise sau nu cu ajutorul programelor deja instalate. El trece prin fiecare program instalat si vede daca acesta stie sa deschida respectivul format de extensie, daca nu stie sa il foloseasca, acesta trece la urmatorul program. Atunci cand acesta nu gaseste un program care sa poata deschide fisierul, acesta arunca o exceptie in acest sens. <br/>
<br/>
In exemplul dat de mine, calculatorul stie sa foloseasca doar programe de tip Excel, Numbers si QuickBooksReader. Putem observa faptul ca putem adauga sau elimina programe cu usurinta. <br/>
In exemplul din Main putem observa cum incerc sa 
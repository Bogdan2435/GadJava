# DESIGN PATTERN 2, Cititor pentru fisiere

Al doilea design pattern ales de mine este unul de tip Chain of Resonsibility cu ajutorul caruia voi putea verifica daca pot citi date din anumite fisiere. <br/>
Modul in care functioneaza acest program este: el verifica cu ajutorul extensiilor pe care il au fisierele daca poate citi date sau nu din aceste fisiere cu ajutorul programelor deja instalate. El trece prin fiecare program instalat si vede daca acesta stie sa deschida respectivul format de extensie. Daca nu stie sa il foloseasca, acesta trece la urmatorul program. Atunci cand nu gaseste un program care sa poata citi date din respectivul fisier, acesta arunca o exceptie in acest sens. <br/>
<br/>
In exemplul dat de mine, calculatorul stie sa foloseasca doar programe de tip Excel, Numbers si QuickBooksReader. Putem observa faptul ca putem adauga sau elimina programe cu usurinta. <br/>
In exemplul din Main putem observa cum incerc sa citesc date din mai multe tipuri de fisiere (.xls, .numbers, .qbl si .jpg). Se poate vedea faptul ca pentru programele cu extensii pe care le cunoaste, stie sa citeasca date din acele fisiere. In schimb, pentru formatul de tip jpg, acesta nu stie sa citeasca date din fisier si arunca o exceptie ("File format not suported.").

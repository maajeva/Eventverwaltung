create table veranstaltung(

id number,
bezeichnung varchar2(50),
teilnehmerAnzahl number,
preis number,
datumVon date,
datumBis date,
treffOrt varchar2(50),
veranstalter_id number,

constraint fk_Veranstalter foreign key(verasntalter_id) REFERENCES veranstalter(id),
constraint pk_veranstaltung primary key(id)
);

create table veranstalter(
id number,
firmenname varchar2(50),
vorname varchar2(50),
nachname varchar2(50),
benutzername varchar(50),
passwort varchar2(50),
email varchar2(50),
telnr number,

constraint pk_veranstalter primary key(id)
);

create table teilnehmer(
id number,
vorname varchar2(50),
nachname varchar2(50),
benutzername varchar(50),
passwort varchar2(50),
email varchar2(50),
telnr number,

constraint pk_teilnehmer primary key(id)
);

create table tBesuchtV(
idTeilnehmer number,
idVeranstaltung number,

constraint pk_tBesuchtV primary key(idTeilnehmer, idVeranstaltung),
constraint fk_tBesuchtV_idTeilnehmer foreign key(idTeilnehmer) references teilnehmer(id),
constraint fk_tBesuchtV_idVeranstaltung foreign key(idVeranstaltung) references veranstaltung(id)
);

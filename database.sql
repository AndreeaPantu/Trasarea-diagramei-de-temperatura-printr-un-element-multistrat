--------------------------------------------------------
--  File created - luni-ianuarie-15-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CALCULE
--------------------------------------------------------

  CREATE TABLE "ANDREE1"."CALCULE" 
   (	"ID" NUMBER, 
	"MATERIAL" VARCHAR2(50 BYTE), 
	"LAMBDA" FLOAT(126), 
	"GROSIME" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DIAGRAMA
--------------------------------------------------------

  CREATE TABLE "ANDREE1"."DIAGRAMA" 
   (	"GROSIME" FLOAT(126), 
	"TETA" FLOAT(126), 
	"ID" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MATERIALE
--------------------------------------------------------

  CREATE TABLE "ANDREE1"."MATERIALE" 
   (	"MATERIAL" VARCHAR2(50 BYTE), 
	"LAMBDA" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table REZULTATE
--------------------------------------------------------

  CREATE TABLE "ANDREE1"."REZULTATE" 
   (	"TI" FLOAT(126), 
	"TE" FLOAT(126), 
	"RSI" FLOAT(126), 
	"RSE" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ANDREE1.CALCULE
SET DEFINE OFF;
REM INSERTING into ANDREE1.DIAGRAMA
SET DEFINE OFF;
REM INSERTING into ANDREE1.MATERIALE
SET DEFINE OFF;
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton simplu cu agregate naturale','1,62');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu zgura de cazan','0,87');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu zgura granulata','0,64');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu zgura expandata','0,58');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu perlit','0,41');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu granulit','0,81');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton celular autoclavizat','0,28');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Saltele din vata minerala','0,04');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Pin si brad perpendicular pe fibre','0,17');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Pin si brad in lungul fibrelor','0,41');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Stejar si fag perdendicular pe fibre','0,23');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Stejar si fag in lungul fibrelor','0,41');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placaj incleiat','0,17');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Rumegus','0,09');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi termoizolante din talas','0,14');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton cu agregate vegetale','0,21');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi termoizolante din coaja de rasinoase','0,116');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi din fibre de lemn','0,084');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi aglomerate fibrolemnoase','0,084');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi din aschii de lemn','0,101');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi aglomerate din puzderie','0,101');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Stufit','0,09');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi de paie','0,14');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Saltele din deseuri textile sintetice','0,045');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din pietre de forma regulata','1,13');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din pietre de forma neregulata','1,06');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din caramizi cu gauri verticale','0,75');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din caramizi de diatomit','0,52');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din blocuri mici pline din beton','1,16');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din blocuri de beton celular autoclavizat','0,3');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Fasii armate din beton celular autoclavizat','0,25');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton armat','1,74');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Vata minerala','0,042');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi si foi de azbociment','0,35');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi termoizolante de azbest','0,13');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Mortar asfaltic','0,75');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Beton asfaltic','1,04');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Bitum','0,17');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Mortar de ciment','0,93');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Mortar de ciment si var','0,87');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Mortar de var','0,7');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Mortar de zgura cu ciment','0,64');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Pasla minerala','0,043');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi de vata minerala','0,048');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Sticla','0,75');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Sticla spongioasa','0,14');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Vata de sticla','0,036');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi de ipsos','0,41');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Ipsos celular','0,18');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Sapa de ipsos','1,03');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Produse termoizolante din diatomit','0,22');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Pamant vegetal in stare umeda','1,16');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Umplutura din nisip','0,58');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Umplutura din pietris','0,7');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zgura de cazan','0,35');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zgura granulata','0,36');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zgura expandata','0,31');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Cenusa si zgura de termocentrala','0,29');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Granulit','0,49');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Perlit','0,088');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Diatomit','0,25');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Scorie bazaltica','0,26');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Marmura, granit, bazalt','3,48');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Gresie si cuartite','2,03');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Pietre calcaroase','1,16');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Tuf calcaros','0,52');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Zidarie din caramizi pline','0,8');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Otel de constructii','58');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Fonta','50');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Aluminiu','220');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Polistiren celular','0,044');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Spume de policlorura de vinii','0,05');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Poliuretan celular','0,042');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Covor PVC fara suport textil','0,38');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Covor PVC cu suport textil','0,29');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Panza bitumata','0,17');
Insert into ANDREE1.MATERIALE (MATERIAL,LAMBDA) values ('Placi termoizolante din perlit liate cu ciment','0,16');
REM INSERTING into ANDREE1.REZULTATE
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table CALCULE
--------------------------------------------------------

  ALTER TABLE "ANDREE1"."CALCULE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table DIAGRAMA
--------------------------------------------------------

  ALTER TABLE "ANDREE1"."DIAGRAMA" MODIFY ("ID" NOT NULL ENABLE);

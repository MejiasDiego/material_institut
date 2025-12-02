# 📦 Sistema de Gestió de Material

Projecte Java per a la gestió d'inventari i préstecs de material a l'Institut Camí de Mar.

---

## 📂 Contingut del repositori
- `src/` → Codi font Java organitzat en paquets:
  - **Paquet `model`**
    - `Categoria`
    - `Material`
    - `Prestec`
  - **Paquet `repository`**
    - `InventariRepository`
  - **Paquet `service`**
    - `InventariService`
  - **Classe `Main`** → punt d’entrada per proves i execució del sistema.
- `doc/` → Carpeta amb el Javadoc generat des d’Eclipse.
- `Documentacio_Usuari.pdf` → Guia per a professors i personal del centre.
- `Documentacio_Tecnica.pdf` → Guia per a programadors i mantenidors.
- `README.md` → Aquest document.


---

## 🚀 Importació del projecte a Eclipse
1. Obrir **Eclipse IDE**.
2. Seleccionar **File → Import → Existing Projects into Workspace**.
3. Escollir la carpeta del projecte (`material_institut`).
4. Comprovar que les classes apareixen dins del paquet `src`.

---

## ▶️ Execució del projecte
1. Obrir la classe `InventariService`.
2. Crear un objecte `InventariRepository` i passar-lo al constructor de `InventariService`.
3. Afegir alguns materials amb `afegirMaterial(...)`.
4. Llistar materials amb `llistarMaterials()`.
5. Fer préstecs amb `ferPrestec(...)` i retornar amb `retornarMaterial(...)`.

*(He afegit una classe `Main` per fer proves ràpides amb un `public static void main(String[] args)`.)*

---

## 📖 Generació del Javadoc
1. A Eclipse, anar a **Project → Generate Javadoc...**.
2. Seleccionar el projecte `material_institut`.
3. Escollir la carpeta de destinació: `doc/`.
4. Confirmar i generar.
5. Comprovar que els fitxers HTML apareixen dins de `doc/`.

---

## 🛠️ Requisits tècnics
- **Java 17** (o superior).
- **Eclipse IDE** amb suport per a Javadoc.
- GitHub per a la gestió de versions.

---

## ✅ Estat del projecte
- ✔️ Documentació d’usuari
- ✔️ Documentació tècnica
- ✔️ Projecte Java amb Javadoc
- ✔️ Publicació a GitHub

---

## 💻 Exemple de sessió d'ús

A continuació es mostra una execució típica del programa amb la classe `Main`:

=== MENÚ INVENTARI ===
1. Afegir material
2. Llistar materials
3. Fer préstec
4. Retornar material
0. Sortir
Opció: 1
Nom del material: Ordinador portàtil
Categoria: Informàtica
Material afegit correctament.

=== MENÚ INVENTARI ===
1. Afegir material
2. Llistar materials
3. Fer préstec
4. Retornar material
0. Sortir
Opció: 1
Nom del material: Projector
Categoria: Audiovisual
Material afegit correctament.

=== MENÚ INVENTARI ===
Opció: 2
Materials a l'inventari:
- Ordinador portàtil (Informàtica) [Disponible]
- Projector (Audiovisual) [Disponible]

=== MENÚ INVENTARI ===
Opció: 3
Nom del material a prestar: Ordinador portàtil
Préstec realitzat correctament.

=== MENÚ INVENTARI ===
Opció: 2
Materials a l'inventari:
- Ordinador portàtil (Informàtica) [Prestat]
- Projector (Audiovisual) [Disponible]

=== MENÚ INVENTARI ===
Opció: 4
Nom del material a retornar: Ordinador portàtil
Material retornat correctament.

=== MENÚ INVENTARI ===
Opció: 2
Materials a l'inventari:
- Ordinador portàtil (Informàtica) [Disponible]
- Projector (Audiovisual) [Disponible]

=== MENÚ INVENTARI ===
Opció: 0
Sortint del sistema...

## 📌 Autor
Pràctica realitzada per **Diego Mejias** dins del mòdul DAWTM05_0487 - DAW2.

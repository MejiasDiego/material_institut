# 📦 Sistema de Gestió de Material

Projecte Java per a la gestió d'inventari i préstecs de material a l'Institut Camí de Mar.

---

## 📂 Contingut del repositori
- `src/` → Codi font Java amb les classes:
  - `Categoria`
  - `Material`
  - `Prestec`
  - `InventariRepository`
  - `InventariService`
  - `Main`
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

*(He afegir una classe `Main` per fer proves ràpides amb un `public static void main(String[] args)`.)*

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

## 📌 Autor
Pràctica realitzada per **Diego Mejias** dins del mòdul DAWTM05_0487 - DAW2.

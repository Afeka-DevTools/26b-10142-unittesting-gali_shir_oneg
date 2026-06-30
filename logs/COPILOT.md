# COPILOT.md — תיעוד שימוש בכלי AI לכתיבת בדיקות יחידה

## פרטי המשימה
במסגרת תרגיל בית 2 בכלי פיתוח, נדרשנו לכתוב בדיקות יחידה ב־Java עבור הפונקציות הקיימות בקובץ `App.java`, ולהשתמש בפונקציות `assert` שונות בתוך קובץ הבדיקות `AppTest.java`.

## כלי AI שבו נעשה שימוש
נעשה שימוש ב־ChatGPT ככלי עזר להבנת הקוד, תכנון מקרי הבדיקה, כתיבת בדיקות היחידה, הרצת הבדיקות עם Gradle ותיקון בעיות בסביבת העבודה.

## מטרת השיחה עם כלי ה־AI
המטרה הייתה לקבל סיוע בשלבים הבאים:

1. איתור קבצי הפרויקט הרלוונטיים.
2. הבנת הפונקציות שנמצאות בקובץ `App.java`.
3. כתיבת בדיקות יחידה בקובץ `AppTest.java`.
4. בדיקה שהטסטים מכסים מקרי קצה ונתיבים שונים בפונקציות.
5. הרצת הבדיקות באמצעות Gradle.
6. פתרון שגיאות שהופיעו בזמן ההרצה.
7. העלאת השינויים ל־GitHub.

## איתור קבצי הבדיקה
באמצעות ה־CMD חיפשנו את הקבצים הרלוונטיים בפרויקט:

```cmd
dir /s App.java
dir /s AppTest.java
```

נמצאו הקבצים הבאים:

```text
app\src\main\java\org\example\App.java
app\src\test\java\org\example\AppTest.java
```

## הפונקציות שנבדקו
בקובץ `App.java` נמצאו פונקציות עזר שונות. עבורן נכתבו בדיקות יחידה:

- `add(int a, int b)`
- `isPrime(int n)`
- `reverse(String s)`
- `factorial(int n)`
- `isPalindrome(String s)`
- `fibonacciUpTo(int n)`
- `charFrequency(String input)`
- `isAnagram(String s1, String s2)`
- `average(int[] arr)`
- `filterEvens(List<Integer> list)`
- `mostCommonWord(String text)`

## סוגי הבדיקות שנכתבו
נכתבו בדיקות מסוגים שונים כדי לכסות התנהגות תקינה, מקרי קצה ושגיאות צפויות.

### בדיקות רגילות
בדיקות שמוודאות שהפונקציה מחזירה את הערך הצפוי עבור קלט תקין.

דוגמאות:

```java
assertEquals(5, App.add(2, 3));
assertEquals("olleh", App.reverse("hello"));
assertTrue(App.isPrime(7));
```

### בדיקות למקרי קצה
נבדקו מצבים מיוחדים כמו אפס, מחרוזת ריקה, רשימה ריקה ומספרים קטנים מהמינימום הרלוונטי.

דוגמאות:

```java
assertFalse(App.isPrime(1));
assertEquals("", App.reverse(""));
assertEquals(1, App.factorial(0));
```

### בדיקות חריגה
נבדקו מצבים שבהם הפונקציה אמורה לזרוק חריגה מסוג `IllegalArgumentException`.

דוגמאות:

```java
assertThrows(IllegalArgumentException.class, () -> App.factorial(-3));
assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1));
assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));
```

## כיסוי נתיבים ומקרי קצה
הבדיקות נכתבו כך שיכסו כמה שיותר נתיבים לוגיים בקוד:

- עבור `isPrime` נבדקו מספר ראשוני, מספר לא ראשוני, 2, 1, 0 ומספר שלילי.
- עבור `factorial` נבדקו מספר חיובי, 0, 1 ומספר שלילי שזורק חריגה.
- עבור `isPalindrome` נבדקו פלינדרום רגיל, מחרוזת שאינה פלינדרום, אותיות גדולות, רווחים וסימנים.
- עבור `fibonacciUpTo` נבדקו גבול חיובי, 0 וקלט שלילי.
- עבור `average` נבדק מערך רגיל, מערך עם מספרים שליליים ומערך ריק.
- עבור `filterEvens` נבדקה רשימה עם מספרים זוגיים, רשימה ללא זוגיים ורשימה ריקה.

## הרצת הבדיקות
הבדיקות הורצו באמצעות Gradle:

```cmd
gradlew.bat test
```

בתחילה התקבלה שגיאה שנבעה מגרסת Java לא מתאימה:

```text
java.lang.IllegalArgumentException: 26.0.1
```

לאחר בדיקה התברר שהמחשב משתמש ב־Java 26, ולכן הותקן Java 21 באמצעות הפקודה:

```cmd
winget install EclipseAdoptium.Temurin.21.JDK
```

לאחר פתיחת CMD מחדש ווידוא שהמערכת משתמשת ב־Java 21:

```cmd
java -version
```

הורצו הבדיקות שוב:

```cmd
gradlew.bat test
```

הפעם ההרצה הסתיימה בהצלחה:

```text
BUILD SUCCESSFUL
```

## העלאת השינויים ל־GitHub
לאחר שהבדיקות עברו בהצלחה, השינויים נוספו ל־Git, נשמרו ב־commit והועלו ל־GitHub:

```cmd
git add app\src\test\java\org\example\AppTest.java
git commit -m "Add unit tests"
git push
```

ה־push הסתיים בהצלחה והקובץ `AppTest.java` עודכן במאגר ב־GitHub.

## סיכום
באמצעות כלי ה־AI נכתבו בדיקות יחידה עבור הפונקציות בקובץ `App.java`. הבדיקות כוללות שימוש ב־`assertEquals`, `assertTrue`, `assertFalse` ו־`assertThrows`, ומכסות קלטים רגילים, מקרי קצה וחריגות. לאחר תיקון סביבת Java והרצת Gradle, כל הבדיקות עברו בהצלחה.

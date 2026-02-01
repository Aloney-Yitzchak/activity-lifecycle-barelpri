[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rJsPZNR5)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22464356)
# משימה 1: Activity Lifecycle Logger 📱🔄

## מטרת המשימה
ללמוד את מחזור החיים של Activity על ידי הוספת הודעות Log ותצפית במה שקורה בפועל.

---

## הוראות

### חלק א' - הוספת לוגים (40 נקודות)

1. פתחו את הפרויקט ב-Android Studio
2. פתחו את הקובץ `MainActivity.java`
3. הוסיפו את כל 6 פונקציות מחזור החיים אם הן לא קיימות:
   - `onCreate()`
   - `onStart()`
   - `onResume()`
   - `onPause()`
   - `onStop()`
   - `onDestroy()`
4. בכל פונקציה, הוסיפו הודעת Log.d() בפורמט הבא:
   ```java
   Log.d("LifecycleDemo", "onXXX called");
   ```
   (החליפו XXX בשם הפונקציה)

**טיפ:** אל תשכחו לקרוא ל-`super.onXXX()` בכל פונקציה!

---

### חלק ב' - ניסויים ותצפיות (50 נקודות)

הריצו את האפליקציה על אמולטור או מכשיר אמיתי, ובצעו את הניסויים הבאים.
לאחר כל ניסוי, רשמו בקובץ `OBSERVATIONS.md` אילו פונקציות נקראו ובאיזה סדר.

#### ניסוי 1: הפעלה ראשונה
1. הריצו את האפליקציה
2. צפו ב-Logcat
3. רשמו אילו פונקציות נקראו

#### ניסוי 2: לחיצה על Home
1. לחצו על כפתור Home
2. רשמו אילו פונקציות נקראו
3. חזרו לאפליקציה
4. רשמו אילו פונקציות נקראו כשחזרתם

#### ניסוי 3: סיבוב מסך
1. סובבו את המסך (Ctrl+Arrow באמולטור)
2. רשמו אילו פונקציות נקראו

#### ניסוי 4: סגירה מלאה
1. לחצו על כפתור Back עד שהאפליקציה נסגרת
2. רשמו אילו פונקציות נקראו

---

### חלק ג' - שאלות (10 נקודות)

ענו על השאלות בקובץ `OBSERVATIONS.md`:

1. מה ההבדל בין מה שקרה כשלחצתם Home לבין כשסובבתם את המסך?
2. למה לדעתכם סיבוב מסך גורם להריסה ויצירה מחדש של ה-Activity?

---

## קבצים להגשה

- [ ] `MainActivity.java` - עם כל 6 פונקציות והלוגים
- [ ] `OBSERVATIONS.md` - עם כל התצפיות והתשובות

---

## קריטריונים להערכה

| קריטריון | ניקוד |
|----------|-------|
| כל 6 פונקציות מחזור החיים קיימות | 20 |
| Log.d() נכון בכל פונקציה | 20 |
| תצפיות מניסוי 1 (הפעלה ראשונה) | 10 |
| תצפיות מניסוי 2 (Home) | 15 |
| תצפיות מניסוי 3 (סיבוב מסך) | 15 |
| תצפיות מניסוי 4 (סגירה) | 10 |
| תשובות לשאלות | 10 |
| **סה"כ** | **100** |

---

## בעיות נפוצות

**בעיה:** לא רואים את הלוגים ב-Logcat
**פתרון:** 
1. וודאו שבחרתם את המכשיר הנכון ב-Logcat
2. סננו לפי "LifecycleDemo"
3. וודאו שרמת הסינון היא Debug ומעלה

**בעיה:** האפליקציה קורסת
**פתרון:**
1. וודאו שקראתם ל-`super.onCreate(savedInstanceState)` ב-onCreate
2. וודאו ש-`setContentView()` נמצא אחרי קריאת ה-super

**בעיה:** סיבוב מסך לא עובד באמולטור
**פתרון:** השתמשו ב-Ctrl+Left Arrow או Ctrl+Right Arrow

---

## משאבים

- [תיעוד רשמי - Activity Lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
- [Logcat Guide](https://developer.android.com/studio/debug/am-logcat)

---

בהצלחה! 🚀

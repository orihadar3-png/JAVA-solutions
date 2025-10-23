#!/bin/bash

# קביעת תאריך ושעה
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt

# מעבר לענף temp-branch (יוצר אותו אם לא קיים)
git checkout -B temp-branch

# הוספת קבצים ל-commit
git add .

# ביצוע commit אוטומטי
git commit -m "AutoUpdate"

# משיכה מהענף לפני push
git pull --rebase origin temp-branch

# שליחת השינויים לענף
git push origin temp-branch

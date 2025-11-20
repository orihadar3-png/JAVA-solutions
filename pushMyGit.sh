#!/bin/bash

# שם branch ברירת מחדל או לפי ארגומנט
branch=${1:-main}
echo "Using branch: $branch"

# שמירת timestamp לקובץ
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt
echo "Timestamp saved to fileDatepush.txt"

# מעבר ל-branch או יצירה אם לא קיים
if git rev-parse --verify "$branch" >/dev/null 2>&1; then
  echo "Switching to existing branch: $branch"
  git switch "$branch"
else
  echo "Creating and switching to new branch: $branch"
  git checkout -b "$branch"
fi

# הוספת כל הקבצים
echo "Adding all files..."
git add .

# ביצוע commit
echo "Committing changes..."
git commit -m "Upload all project files"

# דחיפה ל-GitHub
echo "Pushing to origin/$branch"
git push origin "$branch" --force

echo "Done."
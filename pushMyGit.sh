
#!/bin/bash
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt
git switch temp-branch 2>/dev/null || git checkout -b temp-branch
git pull origin temp-branch
if ! git diff --cached --quiet || ! git diff --quiet; then
  git add .
  git commit -m "AutoUpdate"
  git push origin temp-branch
else
  echo "No changes to commit."
fi

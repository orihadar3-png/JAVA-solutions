
#!/bin/bash

# Set branch name from argument or default to 'temp-branch'
branch=${1:-temp-branch}
echo "Using branch: $branch"

d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt
echo "Timestamp saved to fileDatepush.txt"

if git rev-parse --verify "$branch" >/dev/null 2>&1; then
  echo "Switching to existing branch: $branch"
  git switch "$branch"
else
  echo "Creating and switching to new branch: $branch"
  git checkout -b "$branch"
fi

echo "Pulling latest changes from origin/$branch"
git pull origin "$branch"

if ! git diff --cached --quiet || ! git diff --quiet; then
  echo "Changes detected. Adding and committing..."
  git add .
  git commit -m "AutoUpdate"
  echo "Pushing to origin/$branch"
  git push origin "$branch"
else
  echo "No changes to commit."
fi
if[ "$branch" != "main" ]; then
  echo "Merging $branch into main..."
  git switch main
  git pull origin main
  git merge "$branch"
  echo "Pushing merged changes to origin/main"
  git push origin main
fi

echo "Done."

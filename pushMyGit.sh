#!/bin/bash


branch=${1:-main}
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


echo "Adding all files..."
git add .


echo "Committing changes..."
git commit -m "Upload all project files"


echo "Pushing to origin/$branch"
git push origin "$branch" --force

echo "Done."
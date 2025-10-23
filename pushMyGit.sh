#!/bin/bash

# Get current date and time
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt

# Switch to temp-branch (create if it doesn't exist)
git checkout -B temp-branch

# Stage all changes
git add .

# Commit with automatic message
git commit -m "AutoUpdate"

# Pull latest changes from remote branch (no rebase to avoid errors)
git pull origin temp-branch

# Push changes to remote
git push origin temp-branch

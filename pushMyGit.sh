#!/bin/bash
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt
git add .
git commit -m "AutoUpdate"
b="temp-branch"
git pull --rebase origin "$b"
git push origin "$b"


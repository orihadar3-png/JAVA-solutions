#!/bin/bash
d=$(date +"%Y-%m-%d_%H:%M:%S")
echo "$d" > fileDatepush.txt
git add .
git commit -m "AutoUpdate"
b=$(git rev-parse --abbrev-ref HEAD)
git pull --rebase origin "$b"
git push origin "$b"

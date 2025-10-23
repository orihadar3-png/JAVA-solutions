#!/bin/bash 
date   >> fileDatepush.txt
git add . && git commit -m "עדכון אוטומטי" && git push


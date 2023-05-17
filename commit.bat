@echo off
set /p commit=Enter Commit Message: 
git add *
git commit -m "%commit%"
git push
pause>null